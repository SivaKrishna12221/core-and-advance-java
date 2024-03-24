package com.nt.coockie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Set
 */
public class Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Set() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  String s1=request.getParameter("product1");
	  String s2=request.getParameter("product2");
	  String s3=request.getParameter("product3");
	  String s4=request.getParameter("product4");
	  PrintWriter pw=response.getWriter();
	  pw.println(" <html><body bgcolor=yellow text=blue><h1>");
	  pw.println("you have selected some products<br>");
	  pw.println("<a href=geturl?p1="+s1+"&p2"+s2+"&p3"+s3+"&p4"+s4+">next</a>");
	  pw.println("</h1></body></html>");
	}

}
