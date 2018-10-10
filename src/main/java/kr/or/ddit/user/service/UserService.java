package kr.or.ddit.user.service;

import java.util.List;

import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVO;

public class UserService implements UserServiceInf{
	UserDao userDao = new UserDao();

	@Override
	public List<UserVO> selectUserAll() {
		return userDao.selectUserAll();
	}

	@Override
	public UserVO selectUser(String userid) {
		return userDao.selectUser(userid);
	}

	@Override
	public UserVO selectUser(UserVO userVo) {
		return userDao.selectUser(userVo);
	}

}
