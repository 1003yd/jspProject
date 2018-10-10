package kr.or.ddit.user.dao;

import java.util.List;

import kr.or.ddit.user.model.UserVO;

public interface UserDaoInf {

	public List<UserVO> selectUserAll();

	public UserVO selectUser(String userid);

	public UserVO selectUser(UserVO userVo);

}
