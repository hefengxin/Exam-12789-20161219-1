package com.cn.servlet;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.domain.FilmDomain;
import com.cn.service.UserService;

import cn.itcast.servlet.BaseServlet;

public class FilmServlet extends BaseServlet {
	 private  UserService userService=new UserService();
	/**
	 * 查询所有电影
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String findFilm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<FilmDomain> list=userService.getList();
		request.setAttribute("list", list);
		return "f:/show/showFirm.jsp";
	}
}
