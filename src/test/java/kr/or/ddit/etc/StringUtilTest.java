package kr.or.ddit.etc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test() {
		/***Given***/
		String contentDisposition= "form-data; name=\"profile\"; filename=\"brown.png\"";

		/***When***/
		//logic
		String fileName = "";
		String[] strArray = contentDisposition.split("; ");
		
//		for(String str : strArray){
//			if(str.contains("filename")){
//				System.out.println(str);
//			}
//		}
		
		for(String str : strArray){
			if(str.indexOf("filename") >= 0 ){
				//filename="brown.png"
				System.out.println(str.length());
				fileName = str.substring(10, str.lastIndexOf("\""));
			
			}
		}

		/***Then***/
		assertEquals("brown.png", fileName);

	}

}
