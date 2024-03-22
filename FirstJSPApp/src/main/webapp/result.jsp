<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% 
    session=request.getSession();
	String user=request.getParameter("name1");
	System.out.println(user);
	String pass=request.getParameter("pass");
	session.setAttribute("user", user);
	if((user.equals("Admin"))&&(pass.equals("123")))
	{
		response.sendRedirect("status.jsp");
	}
	else
	{
		response.sendRedirect("error.jsp");
	}
	%>
</body>
</html>