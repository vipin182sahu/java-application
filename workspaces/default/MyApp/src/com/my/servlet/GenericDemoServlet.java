package com.my.servlet;

import java.io.*;
import javax.servlet.*;

public class GenericDemoServlet extends GenericServlet {

	private static final long serialVersionUID = 1893575424183489652L;

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Hello Generic Servlet");
		out.println("</body></html>");
	}/*

	public void destroy() {
	}

	public String getServeltInfo() {
		return null;
	}

	public ServletConfig getServletConfig() {
		return null;
	}*/
}