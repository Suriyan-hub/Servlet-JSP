
package com.contextconfig;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.print("<h1>"+"Hi"+"</h1>");
		String username=(String) req.getAttribute("user");
		String userjob = (String) req.getAttribute("job");
		out.println("<h1>"+username+" profession is:"+userjob+"</h1>");
		ServletConfig cg=getServletConfig();
		String name=cg.getInitParameter("name");
		out.println("<h1>"+"Name from HomeServlet using ServletConfig"+name+"</h1>");
	}
}
/* ServletContext and ServletConfig can be used to get initial values for a servlet or for a application */
/* eg: username and password,file path */
/* both ServletContext & ServletConfig are interfaces*/
/* ServletContext is the values shared by all the servlets*/
/* for different values for different servlet we go for servletconfig */