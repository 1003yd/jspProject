package kr.or.ddit.user.service;

import java.util.List;

import kr.or.ddit.user.model.UserVO;

public interface UserServiceInf {
	
	public List<UserVO> selectUserAll();
	
	public UserVO selectUser(String userid);
	
	public UserVO selectUser(UserVO userVo);

}
