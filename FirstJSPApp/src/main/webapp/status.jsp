<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
 <%
 	session=request.getSession();
 	String username=(String) session.getAttribute("user");
 	out.println("<h1>"+ username+ " Successfully Login "+ "</h1>");
 %>
</body>
</html>