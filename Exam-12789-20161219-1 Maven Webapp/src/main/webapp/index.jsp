<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
	<table>
	<tr>
	<td ><a href="login.jsp">用户登录</a></td>
	</tr>
	<tr>
	<td><a href="FilmServlet?method=findFilm">显示信息</a></td>
	</tr>
	</table>
</body>
</html>