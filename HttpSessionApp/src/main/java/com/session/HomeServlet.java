package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		HttpSession session=req.getSession();
		String user=(String) session.getAttribute("uname");
		System.out.println("user:"+user);
		PrintWriter out=res.getWriter();
    	out.println("<h1>"+"Username is: "+user+"</h1>");
		
    }
}
