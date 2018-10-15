package kr.or.ddit.util;

public class StringUtil {
	public static String getFileNameFormHeader(String contentDisposition){
		
		String fileName ="";
		String[] strArray = contentDisposition.split("; ");
		
		for(String str : strArray){
			if(str.indexOf("filename") >= 0){
				fileName = str.substring(10, str.lastIndexOf("\""));
			}
		}
		return fileName;
	}
	
}
