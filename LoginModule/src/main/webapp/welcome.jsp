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
//prevent back button after logout
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//Http 1.1
	response.setHeader("Parama", "no-cache");//Http 1.0
	response.setHeader("Expires", "0");//Proxies
	String user1=(String)session.getAttribute("user");
	if(user1==null){
		response.sendRedirect("login.jsp");
	}
%>
 <h1>Welcome  <%=user1 %> </h1><br><br>
 <div>
 <a href="photos.jsp">Photos&Videos here</a>
 
 </div>
 <br><br>
 <div>
 <form action="logout" method="post">
		
		<input type="submit" value="Logout">
 </form>
 </div>
 
</body>
</html>