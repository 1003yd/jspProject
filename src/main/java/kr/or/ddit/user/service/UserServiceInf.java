package kr.or.ddit.user.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

public interface UserServiceInf {
	
	public List<UserVO> selectUserAll();
	
	public UserVO selectUser(String userid);
	
	public UserVO selectUser(UserVO userVo);
	
	/**  
	* Method   : selectUserPageList 
	* 작성자 : 1003yd 
	* 변경이력 :  
	* @param page
	* @return  
	* Method 설명 :  사용자 페이징 조회
	*/
	public Map<String, Object> selectUserPageList(PageVO page);

}
