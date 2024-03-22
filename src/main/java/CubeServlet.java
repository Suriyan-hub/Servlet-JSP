import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CubeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k=Integer.parseInt(req.getParameter("C"));
		k=k*k*k;
		System.out.println("K:"+k);
		PrintWriter out=res.getWriter();
		out.println("<h1>"+"Cube root is:"+k+"</h1>");
	}

}
