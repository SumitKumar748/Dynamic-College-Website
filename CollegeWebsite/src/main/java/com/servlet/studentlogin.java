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
@WebServlet("/studentlogin")
public class studentlogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out= resp.getWriter();
		 HttpSession session= req.getSession();
		 String email=req.getParameter("eid");
		 String password= req.getParameter("pwd");
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sumitdb","root","sumit@4070");
			 resp.setContentType("text/html");
			 PreparedStatement pst=con.prepareStatement("select * from technoindia where Email=? and Password=?");
			 pst.setString(1, email);
			 pst.setString(2, password);
			 ResultSet rslt=pst.executeQuery();
					 if(rslt.next()) 
					 {
						 RequestDispatcher rd= req.getRequestDispatcher("/studentwelcome.jsp");
						 rd.forward(req, resp);
						 
					 }
					 else {
						 		req.setAttribute("msg","Invalid Details");
				         		RequestDispatcher rd= req.getRequestDispatcher("/slogin.jsp");
				         		rd.include(req,resp);
						 
					 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	
			
			 
	}
}
