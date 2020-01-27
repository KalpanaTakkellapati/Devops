

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	String user,pass;
public void init()
{
	System.out.println("inside method");
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("User", user);
		out.println("username"+user+" "+"password"+pass);
		
		
		if(user.equals("User")&& pass.equals("cat123"))
			{
			response.sendRedirect("Servlet2?User="+user);
			//RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			//rd.forward(request,response);
			
			//out.println("Hello"+user+"welcome to this site");
			
			//out.println("Email"+getServletContext().getInitParameter("Email"));
			
			}
		else
			//response.sendRedirect("Login.html");
			out.println("fail");
	}


public void destroy()
{
	
		
		System.out.println("inside destroy method");
		
		
	}

}
