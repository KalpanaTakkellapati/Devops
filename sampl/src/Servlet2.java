

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet2 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Hello"+request.getAttribute("User")+"you are in the page"+request.getServletConfig().getServletName());
		//ServletContext sc=getServletContext();
	//out.println("Email"+sc.getInitParameter("Email"));
	}

}
