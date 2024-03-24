package com.nt.pack1;

import java.awt.im.InputMethodRequests;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
    public void init(ServletConfig config) 
    {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","siva");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void doPost(HttpServletRequest request ,HttpServletResponse response) 
    {
    	try {
			String s1=request.getParameter("uname");
			String s2=request.getParameter("pword");
			PreparedStatement pstmt=con.prepareStatement("select * from NareshIt where uname=? and pword=?");
			pstmt.setString(1,s1);
			pstmt.setString(2,s2);
		    ResultSet rs=pstmt.executeQuery();
		    PrintWriter pw=response.getWriter();
		    pw.println("<html><body bgcolor=yellow><h1>");
		    if(rs.next())
		    {
		    	//servlet forwarding
				
				  RequestDispatcher rd=request.getRequestDispatcher("/welcome");
				  rd.forward(request,response);
				 
		    	//servlet redirecting
		    	//response.sendRedirect("/welcome");
		    }
		    else
		    {
				
				  RequestDispatcher rd1=request.getRequestDispatcher("/login.html");
				  rd1.include(request,response);
				 
		    	
		    	//response.sendRedirect("/login.html");
		    }
		    pw.println("</h1></body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
