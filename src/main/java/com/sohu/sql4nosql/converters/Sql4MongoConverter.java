/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.utils.AntlrUtils;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-18 下午08:23:59
 */
public class Sql4MongoConverter implements ISql4NosqlConverter {
	private DB db;
	
	public Sql4MongoConverter(String host, int port, String dbName) {
		try {
			Mongo mongo = new Mongo(host, port);
			db = mongo.getDB(dbName);
		} catch (Exception e) {
			throw new RuntimeException("Can not create mongo instance!",e);
		}
	}
	
	public List<?> queryForList(String sql, Object... params) {
		QuerySqlStruct sqlStruct = AntlrUtils.buildSqlStruct(sql);
		String collectionName = sqlStruct.getTableName();
		DBCollection collection = db.getCollection(collectionName);
		BasicDBObject query = new BasicDBObject();
		query.put(sqlStruct.getWhereFieldName(), sqlStruct.getFieldValue().replaceAll("'", ""));
		DBCursor cursor = collection.find(query);
		List<DBObject> dbObjects = new ArrayList<DBObject>();
		while(cursor.hasNext()) {
			DBObject dbObject = cursor.next();
			dbObjects.add(dbObject);
		}
		return dbObjects;
	}

}
