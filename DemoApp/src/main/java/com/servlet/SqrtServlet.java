package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqrtServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k=(int)req.getAttribute("C");
		PrintWriter out=res.getWriter();
		out.println("<h1>"+"Sum is:"+k+"</h1>");
		
		k=k*k;
		
		out.println("<h1>"+"Square root is:"+k+"</h1>");
	}
	
}
