package sha;

import static org.junit.Assert.*;
import kr.or.ddit.encrypt.sha.KISA_SHA256;

import org.junit.Test;

public class KISA_SHA256_Test {

	/**  
	* Method   : encryptTest 
	* 작성자 : 1003yd 
	* 변경이력 :    
	* Method 설명 :  encrypTest
	*/
	@Test
	public void encryptTest() {
		/***Given***/
		String pass= "brownpass";
		String pass1= "brownpast";
		
		/***When***/
		String encrypt = KISA_SHA256.encrypt(pass);
		String encrypt1 = KISA_SHA256.encrypt(pass1);
		System.out.println("encrypt  : " + encrypt);
		System.out.println("encrypt1 : " + encrypt1);
		/***Then***/
		assertEquals("f01471c38113db263f9a532d8b6c054af31bf653aeea92d1c284cdd022b9", encrypt);
	}

}
