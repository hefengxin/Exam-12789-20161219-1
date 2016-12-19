   
    
package com.cn.servlet.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

  

public class UserFilter implements Filter {

	
	
	


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2=(HttpServletRequest)request;
		String name=(String)request2.getSession().getAttribute("name");
		System.out.println(name);
		if(name!=null){
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}


	@Override
	public void destroy() {

	}

}
