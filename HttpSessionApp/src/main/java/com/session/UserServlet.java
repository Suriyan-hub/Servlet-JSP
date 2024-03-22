package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	String str=req.getParameter("name1");
	System.out.println("name :"+str);
	HttpSession session=req.getSession();//session create
	session.setAttribute("uname", str);
	res.sendRedirect("userhome");
	
//	PrintWriter out=res.getWriter();
//	out.println("<h1>"+"Username is: "+str+"</h1>");
}
}
