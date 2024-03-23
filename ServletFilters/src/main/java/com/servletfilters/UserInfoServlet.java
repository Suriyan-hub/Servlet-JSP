package com.servletfilters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userinfo")
public class UserInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	 PrintWriter out=res.getWriter();
	 System.out.println("In Servlet");
	 int id=Integer.parseInt(req.getParameter("id1"));
	 String name=req.getParameter("name1");
	 
	 out.println("id: "+id+" "+"name: "+name);
		
	}
	
}
