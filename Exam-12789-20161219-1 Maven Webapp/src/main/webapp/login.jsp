<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="dbag1" class="l1">
					<p class="msg" align="center">${msg}</p>
					<form action="UUserServlet" method="post"
						target="_top">
						<input type="hidden" name="method" value="login" />
						<table align="center" cellspacing="5" cellpadding="2">
							<tr>
								<td colspan="5" id="ltile" align="center">用户登录</td>
							</tr>
							<tr>
								<td>name</td>
								<td colspan="3"><input type="text" name="user"
									value="${form.username}" /></td>

							</tr>
							<tr>
								<td colspan="5"></td>
							</tr>
							<tr>
								<td></td>
								<td rowspan="4" width="50"><input type="submit" value="登陆" />
								</td>
								
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td  colspan="2">
									</td>
								<td></td>
							</tr>
						</table>
					</form>
				</div>
  </body>
</html>
