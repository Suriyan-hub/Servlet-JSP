<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 
	  int x=10/0;
 	  //String s=null;
 	  //out.println(s.length());
 	 String invalidNumber = "abc";
     int result = Integer.parseInt(invalidNumber);
    // out.println(result);
 %>
</body>
</html>