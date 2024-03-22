package com.cookie;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String str=req.getParameter("name1");
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("name :"+str);
		Cookie c=new Cookie("uname", str);
		Cookie c1=new Cookie("uid", String.valueOf(id));

		res.addCookie(c);
		res.addCookie(c1);
		
		res.sendRedirect("userhome");
		
//		PrintWriter out=res.getWriter();
//		out.println("<h1>"+"Username is: "+str+"</h1>");
	}
}
