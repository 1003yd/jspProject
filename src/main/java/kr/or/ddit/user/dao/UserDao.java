package kr.or.ddit.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.SqlFactoryBuilder;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

public class UserDao implements UserDaoInf {
	public List<UserVO> selectUserAll(){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();

		//selectOne : 데이터가 한건일 때
		//selectList : 여러건의 데이터를 조회
		//메소드 인자 : 문자열 = namespace(모듈명).queryId
		List<UserVO> userList = session.selectList("user.selectUserAll");
		int cntList = userList.size();
		System.out.println(cntList);

		return userList;
	}

	public UserVO selectUser(String userid){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();

		UserVO userVo = (UserVO)session.selectOne("user.selectUser", userid);

		return userVo;
	}


	public UserVO selectUser(UserVO userVo){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();

		UserVO userVoList = session.selectOne("user.selectUserByVo", userVo);

		return userVoList;

	}
	
	public List<UserVO> selectUserPageList(PageVO page){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		List<UserVO> pageUserList = session.selectList("user.selectUsrPageList", page);
		
		for(UserVO uservo : pageUserList){
			System.out.println(uservo.getUserId());
		}
		
		return pageUserList;
	}
}
