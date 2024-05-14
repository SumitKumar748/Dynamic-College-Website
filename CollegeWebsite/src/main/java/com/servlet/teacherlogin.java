package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/teacherlogin")
public class teacherlogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out= resp.getWriter();
		 HttpSession session= req.getSession();
		 String email=req.getParameter("teid");
		 String password= req.getParameter("tpwd");
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sumitdb","root","sumit@4070");
			 PreparedStatement pst=con.prepareStatement("select * from technoindiateachers where Email=? and Password=?");
			 pst.setString(1, email);
			 pst.setString(2, password);
			 ResultSet rslt=pst.executeQuery();
					 if(rslt.next()) 
					 {
						 RequestDispatcher rd= req.getRequestDispatcher("/teacherwelcome.jsp");
						 rd.forward(req, resp);
						 
					 }
					 else {
//						 		resp.setContentType("text/html");
//						 		out.print("<h2 style=\"color:red;text-align:center;\">Invalid Details</h2>");
				         		
						 		req.setAttribute("msg", "Invalid Details");
						 		RequestDispatcher rd= req.getRequestDispatcher("/tlogin.jsp");
				         		rd.include(req,resp);
						 
					 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	
			
			 
	}
}
