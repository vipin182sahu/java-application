

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
 
 public class RequestServlet extends HttpServlet{
   
   public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	   res.setContentType("text/Html");
	   PrintWriter out = res.getWriter();
	   out.println("<html><body>");
	   String name = req.getParameter("name");
	   String pass = req.getParameter("pass");
	   
	   if(name.equals("ducat") && pass.equals("ducat")){
		   out.println("valid user from service");
	   }
	   else{
		   out.println("invalid user from service");
		   
	   }
	   out.println("</body></html>");
   }
     
	public RequestServlet() {
		super();
	}   	
	 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 out.println("<html><body>");
		 
		 String name = req.getParameter("name");
		 String pass = req.getParameter("pass");
		 try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vipin");
			 
			 Statement s = c.createStatement();
			  s.executeUpdate("create table emp123(name varchar(12),pass text();");
			 int x = s.executeUpdate("insert into emp123 values('name','pass')");
			 ResultSet rs = s.executeQuery("select * from emp123");
			 while(rs.next()){
				 out.println(rs.getString(1));
				 out.println(rs.getString(2));
			 }
		 }
	
		catch(Exception e){
			 System.out.println(e);
		 }
		 if(name.equals("ducat") && pass.equals("ducat")){
			   out.println("valid user from doget");
		   }
		   else{
			   out.println("invalid user from doget");
			   
		   }
		 out.println("</body></html>");
	}
	
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 out.println("<html><body>");
		 String name = req.getParameter("name");
		 String pass = req.getParameter("pass");
		 
		 if(name.equals("ducat") && pass.equals("ducat")){
			   out.println("valid user from dopost");
		   }
		   else{
			   out.println("invalid user from dopost");
		   }
		  out.println("</body></html>");
		 
	}   	  	    
}