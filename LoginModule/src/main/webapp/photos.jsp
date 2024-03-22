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

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//Http 1.1
response.setHeader("Parama", "no-cache");//Http 1.0
response.setHeader("Expires", "0");//Proxies
	String user1=(String)session.getAttribute("user");
	if(user1==null){
		response.sendRedirect("login.jsp");
	}
%>
<div>
<img src="https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/91iv1O9URdL._AC_UF1000,1000_QL80_.jpg" alt="ball Image" height="200px" width="200px">

</div>
<div>
<iframe width="560" height="315" src="https://www.youtube.com/embed/eJSwFZLjljM?si=jqTitcz6cznJfB9R" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
</div>

</body>
</html>