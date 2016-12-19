<%@page import="com.cn.domain.FilmDomain"%>
<%@page import="java.util.List,com.cn.domain.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>film_id</td>
<td>title</td>
<td>description</td>
<td>language</td>
<td>操作</td>
</tr>
<%
	List<FilmDomain> list=(List<FilmDomain>)request.getAttribute("list");
	if(list!=null){
		for(FilmDomain filmDomain:list){
%>
<tr>
	<td><%=filmDomain.getId() %></td>
	<td><%=filmDomain.getTitle() %></td>
	<td><%=filmDomain.getDescription() %></td>
	<td><%=filmDomain.getLanguage() %></td>
	<td><a href="DeleteServlet?id=<%=filmDomain.getId()%>">删除</a>&nbsp;&nbsp;<a href="UUserServlet?method=editPre&id=<%=filmDomain.getId()%>">编辑</a></td>
</tr>
<%
	}
}else{
	out.print("没有信息");
}
%>
</table>
</body>
</html>