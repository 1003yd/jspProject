package kr.or.ddit.user.dao;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

import org.junit.Before;
import org.junit.Test;

public class UserDaoTest {
	private UserDao userDao ;
	
	@Before
	public void setUp(){
		userDao = new UserDao();
	}
	
	
	@Test
	public void selectUserAllTest() {
		/***Given***/
		

		/***When***/
		int userList = userDao.selectUserAll().size();

		/***Then***/
		assertEquals(105,userList);
		
	}
	
	@Test
	public void selectUserTest(){
		/***Given***/
		String id = "brown";

		/***When***/
		UserVO userVo = userDao.selectUser(id);
		System.out.println(userVo.getUserId());
		
		
		/***Then***/
		assertNotNull(userVo);
		assertEquals(id, userVo.getUserId());
		assertEquals("브라운", userVo.getName());

	}
	
	@Test
	public void selectUserByVoTest(){
		/***Given***/

		/***When***/
		UserVO userVo = new UserVO();
		userVo.setUserId("brown");
		userVo.setName("브라운");
		userVo.setPass("brownPass");
		
		UserVO userId = userDao.selectUser(userVo);
		
		/***Then***/
		assertNotNull(userVo);
		assertEquals(userVo.getUserId(), userId.getUserId());
		System.out.println("userVo.getUserId() :" + userVo.getUserId() + "  && userId.getUserId() :  " + userId.getUserId());
		assertEquals(userVo.getName(), userId.getName());
		System.out.println("userVo.getName() :" + userVo.getName() + "   && userId.getName() :  " + userId.getName());
		
	}
	
	@Test
	public void selectUsrPageListTest(){
		/***Given***/
		
		
		/***When***/
		PageVO page = new PageVO();
		page.setPage(1);
		page.setPageSize(10);

		List<UserVO> pageUserList = userDao.selectUserPageList(page);
		
		/***Then***/
		assertEquals(10, pageUserList.size());

	}
	
	/**  
	* Method   : getUserCntTest 
	* 작성자 : 1003yd 
	* 변경이력 :    
	* Method 설명 :  사용자 전체 건수 조회 테스트
	*/
	@Test
	public void getUserCntTest(){
		/***Given***/
		

		/***When***/
		int totalUserCnt = userDao.getUserCnt();

		/***Then***/
		assertEquals(105, totalUserCnt);
	}

}
