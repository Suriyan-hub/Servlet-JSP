package com.annotation;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	HttpSession session=req.getSession();
	String user=req.getParameter("name1");
	System.out.println(user);
	String pass=req.getParameter("pass");
	session.setAttribute("user", user);
	if((user.equals("Admin"))&&(pass.equals("123")))
	{
		res.sendRedirect("profile");
	}
	else
	{
		System.out.println("Inavalid User & password");
	}
}
}
