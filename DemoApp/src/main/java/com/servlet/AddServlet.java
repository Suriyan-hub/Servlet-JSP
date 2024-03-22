package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	 System.out.println("Hi");
	 int a=Integer.parseInt(req.getParameter("num1"));
	 int b=Integer.parseInt(req.getParameter("num2"));
	 int c=a+b;
	 System.out.println("Result is:" +c);
	// PrintWriter out=res.getWriter();
	 //out.println("<h1>"+"Result is: "+c+"</h1>");
	 req.setAttribute("C",c);
	 RequestDispatcher rd=req.getRequestDispatcher("square");
	 rd.forward(req, res);
 }
}
