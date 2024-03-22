import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MultiplyServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int a=Integer.parseInt(req.getParameter("num1"));
	 int b=Integer.parseInt(req.getParameter("num2"));
	 int c=a*b;
	 System.out.println(c);
	 res.sendRedirect("cubenum?C="+c);//URL Rewriting
	 
}
	
}
