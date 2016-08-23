import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class SendRequest extends HttpServlet
{
	public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Before");
		//res.sendRedirect("http://localhost:7001/w1/demo");	//("selectTable.html");	//*Here we type the mapping name of servlet. 
		out.println("After");
		out.println("</body></html>");
	}
}