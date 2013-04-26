/**
 * 
 */
package com.sohu.sql4nosql.utils;

/**
 * @author liaohongliu
 *
 * 2012-2-23 下午09:33:02
 */
/**
 * $Id: TextFileUtils.java 17852 2012-02-15 10:20:35Z hongliuliao $
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TextFileUtils {
	
	private final static Log log = LogFactory.getLog(TextFileUtils.class);
	/**
	 * 调用批量处理方法的时候使用,表示的是一次最多返回的记录数
	 */
	private static int READ_BATCH_SIZE = 10000;
	/**
	 * 读取文件中的文本信息
	 * @param filePath 文件路径
	 * @param handler 对每行文本进行的处理
	 */
	public static void readFileText(String filePath,String fileEncode,SingleLineHandler handler) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),fileEncode));
			String line = null;
			while((line = reader.readLine()) != null) {
				handler.handleLine(line);
			}
		} catch (Exception e) {
			log.error("read file error which path:"+filePath,e);
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				log.error("close file error which path:"+filePath,e);
			}
		}
	}
	/**
	 * 批量读取文本文件
	 * @param filePath 文件路径
	 * @param batchSize 一次批量的大小
	 * @param handler 相应处理器
	 */
	public static void readFileTextBatch(String filePath,String fileEncode,final int batchSize,final MultiLineHandler handler) {
		final List<String> lines = new ArrayList<String>();
		readFileText(filePath,fileEncode, new SingleLineHandler() {
			
			public void handleLine(String line) {
				if(lines.size() < batchSize) {
					lines.add(line);
				}else {
					handler.handleMultiLines(lines);
					lines.clear();
					lines.add(line);
				}
			}
		});
		//最后还是需要处理滴
		if(lines.size() != 0) {
			handler.handleMultiLines(lines);
		}
	}
	/**
	 * 批量读取文本文件
	 * @param filePath 文件路径
	 * @param handler 相应处理器
	 */
	public static void readFileTextBatch(String filePath,String fileEncode,final MultiLineHandler handler) {
		readFileTextBatch(filePath, fileEncode, READ_BATCH_SIZE, handler);
	}
	/**
	 * 每条文本记录的处理器
	 * 
	 * CreateDate:2012-2-10 下午05:16:57
	 */
	public interface SingleLineHandler{
		/**
		 * 处理单行文本
		 * @param line 单行文本
		 */
		void handleLine(String line);
	}
	/**
	 * 多条文本记录的处理器
	 * 
	 * CreateDate:2012-2-10 下午05:32:43
	 */
	public interface MultiLineHandler {
		/**
		 * 处理多行文本
		 * @param lines 多行文本
		 */
		void handleMultiLines(List<String> lines);
	}
	
	
}

