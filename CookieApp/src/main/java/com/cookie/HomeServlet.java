package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String s="";
		int id=0;
		Cookie[] cookies=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("uname")) {
				s=c.getValue();
				//s1=c.getValue();
			}
		}
		for (Cookie c1 : cookies) {
		    if (c1.getName().equals("uid")) {
		        id = Integer.parseInt(c1.getValue());
		    }
		}		
		PrintWriter out=res.getWriter();
    	out.println("<h1>"+"Username is: "+s+ " id:"+ id+ "</h1>");
		
    }
}
