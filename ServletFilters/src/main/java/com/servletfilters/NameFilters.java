package com.servletfilters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/userinfo")
public class NameFilters extends HttpFilter implements Filter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		System.out.println("Name Filter Called");
		HttpServletRequest req= (HttpServletRequest) request;
		String name=req.getParameter("name1");
		if(name.length()>=3)
		chain.doFilter(request, response);
		else
			out.println("invalid name input");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
