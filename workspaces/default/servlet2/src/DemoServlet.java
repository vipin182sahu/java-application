

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
 public class DemoServlet implements GenericServlet {
	 
	 public void init(ServletConfig config){}
	 public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 out.println("<html><body>");
		 out.println("hello");
		 out.println("</body></html>");
	 }
	 public void destroy(){}
	 public String getServletInfo(){
		return null;}
	 public ServletConfig getServletConfig(){return null;}     	  	    
}