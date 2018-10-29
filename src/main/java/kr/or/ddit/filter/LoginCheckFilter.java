package kr.or.ddit.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import kr.or.ddit.user.model.UserVO;

public class LoginCheckFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
	
		UserVO userVo = (UserVO)request.getAttribute("S_USER");
		
		if(userVo== null){
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
		}
		
		chain.doFilter(request, response);
		
		
	
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}