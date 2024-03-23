package com.contextconfig;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String user=req.getParameter("name1");
		req.setAttribute("user", user);
		PrintWriter out=res.getWriter();
		out.print("<h1>"+"Hi"+"</h1>");
		ServletContext ctx=getServletContext();
		String job=ctx.getInitParameter("job");
		//out.println("<h1>"+name+"from UserServlet"+"</h1>");
		req.setAttribute("job", job);
		RequestDispatcher rd=req.getRequestDispatcher("/userhome");
		rd.forward(req, res);
	}
}
