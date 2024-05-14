package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/mycred")
public class mycred extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();		
		Connection con;
		try {
			
					Class.forName("com.mysql.cj.jdbc.Driver");
					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sumitdb","root","sumit@4070");
					
					PreparedStatement ps= con.prepareStatement("select Name, Email, Phonenumber, Qualification, CurrentPosition from technoindia ");
					
					ResultSet rs=ps.executeQuery();
					out.print("<h1>Under Construction</h1>");
					
					
					
					
					while(rs.next()) 
					{
						String name = rs.getString("Name");
		                String email = rs.getString("Email");
		                double  phnumber= rs.getDouble("PhoneNumber");
		                String qualification  = rs.getString("Qualification");
		                String position  = rs.getString("CurrentPosition");
		                
		                request.setAttribute("name", name);
		                request.setAttribute("email", email);
		                request.setAttribute("phnumber", phnumber);
		                request.setAttribute("qualification", qualification);
		                request.setAttribute("position", position);
					}
					
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("../webapp/Teacher/MyCredential.jsp");		            
					dispatcher.include(request, resp);

			}
			catch( Exception e)
			{
				e.printStackTrace();
			}
		

	            
		}
	
	
}
