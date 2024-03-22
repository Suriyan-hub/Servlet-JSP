package com.jstl;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/message")
public class MessageServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String msg1=req.getParameter("msg");
		req.setAttribute("name", msg1);
		RequestDispatcher rd=req.getRequestDispatcher("second.jsp");
		rd.forward(req, res);
	}

}
