package kr.or.ddit.user.service;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.user.model.UserVO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserServiceTest {
	
	//JUnit 실행 주기
	// @BeforeClass 가 적용된 메소드 실행(최초 1회만) => 반드시 static이어야 한다.
	// @Before 가 적용된 메소드 실행(테스트 메소드 실행전 실행)
	// @Test
	// @After 가 적용된 메소드 실행(테스트 메소드 실행 후 실행)
	// @AfterClass 가 적용된 메소드 실행(최초1회)

	// beforeClass 
	// before  -> selectAllUser() -> after
	// before -> selectUser(String) -> after
	// before -> selectUser(UserVo) -> after
	
	private String test ="";
	
	private UserService service;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforclass");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}

	@Before
	public void before(){
		System.out.println("before");
		service = new UserService();
	}
	
	@After
	public void after(){
		System.out.println("after");
	}
	
	@Test
	public void selectUserAlltest() {
		/***Given***/

		/***When***/
		List<UserVO> userList = service.selectUserAll();
		/***Then***/
		assertEquals(5, userList.size());

	}

	
	@Test
	public void selectUserTest() {
		/***Given***/

		/***When***/
		UserVO user = service.selectUser("brown");
		/***Then***/
		assertEquals("brown", user.getUserId());
		
	}
	
	@Test
	public void selectUserByVoTest() {
		/***Given***/

		/***When***/
		UserVO userparameter = new UserVO();
		userparameter.setUserId("brown");
		userparameter.setName("브라운");
		userparameter.setPass("brown1234");
		
		UserVO user = service.selectUser(userparameter);
		/***Then***/
		assertEquals(userparameter.getUserId(), user.getUserId());
	}
	
	

}
