package com.cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;

import com.cn.domain.FilmDomain;
import com.cn.service.UserService;

public class UUserServlet extends BaseServlet {

    private  UserService userService=new UserService();
	 
    
    /**
     * 登录
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     */
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("user");
		boolean name1=userService.findByName(name);
		if(name1){
			request.setAttribute("msg", "登录成功！");
			System.out.println(name);
			request.getSession().setAttribute("user", name);
			return "f:/se.jsp";
		}else{
			request.setAttribute("msg", "登录失败！");
			return "f:login.jsp";
		}
	}
	
	
	
	
	/**
	 * 修改前预加载
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String editPre(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		FilmDomain filmDomain=userService.find(id);
		request.setAttribute("filmDomain", filmDomain);
		return "f:/updateFilm.jsp";
	}
	
	/**
	 * 修改 
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String edit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String language=request.getParameter("language");
		String title=request.getParameter("title");
		String textarea=request.getParameter("textarea");
		FilmDomain film=new FilmDomain();
		film.setId(id);
		film.setLanguage(language);
		film.setTitle(title);
		film.setDescription(textarea);
		userService.edit(film);
		
		return "f:/updateFilm.jsp";
	}
	
	public String delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		boolean find= userService.deleteFilm(id);
		if(find){
			response.getWriter().print("删除成功！");
		}else {
			response.getWriter().print("删除失败");
		}
		return null;
	}
	
}

