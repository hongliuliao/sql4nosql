package com.sohu.sql4nosql.utils;

public class Page {
	
	private int start;
	private int totalSize;
	private int limit;
	
	public Page(int start,int totalSize,int limit) {
		this.start = start;
		this.totalSize = totalSize;
		this.limit = limit;
	}
	public int getStart(){
		return this.start;
	}
	public int getEnd(){
		return Math.min(this.totalSize, this.getStart() + this.limit );
	}
	public void setPageSize(int pageSize) {
		this.limit = pageSize;
	}
	public int getTotalPage() {
		return totalSize/limit==0?totalSize/limit:totalSize/limit+1;
	}
}
