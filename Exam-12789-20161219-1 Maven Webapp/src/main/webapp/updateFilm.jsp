<%@page import="com.cn.domain.FilmDomain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
FilmDomain filmDomain=(FilmDomain)request.getAttribute("filmDomain");
%>
<form action="" method="post">
<table>
<tr>
<td>TITLE</td>
<td><input type="text" name="title" value="<%=filmDomain.getTitle()%>"/></td>
</tr>
<tr>
<td>DESCRIPTION</td>
<td><textarea cols="20px" rows="30px" name="textarea"><%=filmDomain.getDescription() %></textarea></td>
</tr>
<tr>
<td>LANGUAGE</td>
<td><input type="text" name="language" value="<%=filmDomain.getLanguage() %>" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="submit" value="修改"/> &nbsp;&nbsp;
<input type="reset" name="reset" value="重置"/> 
</td>
</tr>
</table>
</form>
</body>
</html>