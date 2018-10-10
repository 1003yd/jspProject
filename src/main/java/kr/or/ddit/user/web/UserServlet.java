package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.UserService;
import kr.or.ddit.user.service.UserServiceInf;

@WebServlet("/userAllList")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//서버의 상태가 바뀌지 않을때 (=db에 변화가 생기지 않을 때) :  보통 get을 사용한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전체 사용자 정보 조회
		UserServiceInf userService = new UserService();
		List<UserVO> userList = userService.selectUserAll();
		
		//조회된 사용자 정보를 userAllList.jsp를 통해 화면처리
		//userAllList.jsp에서 userList를 참조하려면??
		//attribute 이용
		//attribute 를 사용할 수 있는 것들 : session, application, request
		//session의 특징 : 해당 사용자만 접근이 가능하다. (사용자의 전용 공간)  => 자주 참조하는 데이터가 있을 때 사용
		//													=> 너무 많은 데이터를 저장할 경우 서버의 과부하(OOM)가 발생하게 된다.
		//application의 특징 : 모든 사용자가 접근이 가능하다. (서버당 1개만 생성) => 보통 설정과 관련된 부분으로 쓰인다.
		//request 의 특징  : 해당 요청의 응답이 끝날 때 까지 
		
		
//		getServletContext().setAttribute("userList", userList); => 모든 사용자가 접근이 가능하기 때문에 요청에 대한 응답을 쓰기에는 부적합하다.

		request.setAttribute("userList", userList);
		
		//화면으로 위임(2가지 방법)
		// 1. dispatch : 조회만 했을 때 (이유: 새로고침을 하게 되면 데이터들도 모두 처음부터 갖고오게 된다.)
		// 2. sendRedirect : 서버의 데이터가 변경이 되면 일반적으로 사용 (이유 : 새로고침을 하게 되면 마지막 요청만 새로고침을 하게 된다.)
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/user/userAllList.jsp");
		rd.forward(request, response);
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
