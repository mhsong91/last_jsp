package com.last.jsp.util;

public class URIParser {

//	public static final int LAST_INDEX_SLASH=1;  열거형 데이터 타입
	
	public static String getCommand(String uri,int type) {
		if(type==1) {
			return uri.substring(uri.lastIndexOf("/")+1);
		}
		return "";
	}
}
