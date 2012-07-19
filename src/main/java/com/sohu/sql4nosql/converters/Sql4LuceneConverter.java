/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.utils.AntlrUtils;
import com.sohu.sql4nosql.utils.Page;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-19 下午03:38:45
 */
public class Sql4LuceneConverter implements ISql4nosqlConverter {

	private SimpleSearcher searcher;
	
	public Sql4LuceneConverter(String indexPath) {
		searcher = new SimpleSearcher(indexPath);
	}

	public List<?> queryForList(String sql, Object... params) {
		QuerySqlStruct querySqlStruct = AntlrUtils.buildSqlStruct(sql);
		String fieldName = querySqlStruct.getWhereFieldName();
		String value = querySqlStruct.getFieldValue().replaceAll("'", "");
		Query query = new TermQuery(new Term(fieldName, value));
		return searcher.search(query, 10000);
	}

}
class SimpleSearcher {
	/**索引目录路径*/
	private String indexPath;
	
	public SimpleSearcher(String indexPath) {
		super();
		this.indexPath = indexPath;
	}
	/**
	 * 查询从0到limit的文档对象
	 * @param query 查询对象
	 * @param limit 查询最大数
	 * @return 文档对象集合
	 * @throws Exception
	 */
	public List<Document> search(Query query,int limit) {
		return this.search(query, 0, limit);
	}
	/**
	 * 查询从start到limit的文档对象
	 * @param query 查询对象
	 * @param start 查询开始数
	 * @param limit 查询最大数
	 * @return 文档对象集合
	 * @throws Exception
	 */
	public List<Document> search(Query query,int start,int limit) {
		return this.search(query, start, limit, null);
	}
	/**
	 * 查询从start到limit的文档对象
	 * @param query 查询对象
	 * @param start 查询开始数
	 * @param limit 查询最大数
	 * @param sort 排序对象
	 * @return 文档对象集合
	 * @throws Exception
	 */
	public List<Document> search(Query query,int start,int limit,Sort sort) {
		try {
			File indexDir = new File(indexPath);
			Directory fsDir = FSDirectory.open(indexDir);
			IndexReader reader = IndexReader.open(fsDir, true);
			IndexSearcher is = new IndexSearcher(reader); 
			TopDocs hits = null;
			if(sort!=null){
				hits = is.search(query,null,limit,sort);
			}else{
				hits = is.search(query,limit);
			}
			int totalSize = hits.totalHits;
			Page page = new Page(start, totalSize, limit);
			List<Document> documents = new ArrayList<Document>();
			for(int i=page.getStart();i<page.getEnd();i++){
				Document doc = is.doc(i);
				documents.add(doc);
			}
			return documents;
		} catch (Exception e) {
			throw new RuntimeException("search error which query:"+query+",start:"+start+",limit:"+limit);
		}
	} 
}