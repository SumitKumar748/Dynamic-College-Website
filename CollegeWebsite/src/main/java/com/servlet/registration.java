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
@WebServlet("/registration")
public class registration extends HttpServlet
{
	
		protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
		{
			
			String sname=req.getParameter("sname");
			String pname=req.getParameter("pname");
			String email=req.getParameter("email");
			String pword=req.getParameter("pword");
			String phnum=req.getParameter("phnum");
			String dob=req.getParameter("dob");
			String dment =req.getParameter("department");
			String idnum =req.getParameter("idnum");
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			
			
			
			if(!idValidation(idnum)) {
				req.setAttribute("msgg", "Student Id not exist");
		 		RequestDispatcher rd= req.getRequestDispatcher("/register.jsp");
         		rd.forward(req,resp);
			}
			
else	
{		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sumitdb","root","sumit@4070");
				PreparedStatement ps = con.prepareStatement("insert into technoindia values(?,?,?,?,?,?,?,?)");
				ps.setString(1,sname);
				ps.setString(2, pname);
				ps.setString(3, email);
				ps.setString(4, pword);
				ps.setString(5, phnum);
				ps.setString(6, dob);
				ps.setString(7, dment);
				ps.setString(8, idnum);
				
				int count = ps.executeUpdate();
				if(count>0) {
//					out.print("User Registered Successfully");
//					RequestDispatcher rdd= req.getRequestDispatcher("/slogin.jsp");
//					rd.include(req,resp);
					
					req.setAttribute("msgg", "User Registered Successfully");
			 		RequestDispatcher rdd= req.getRequestDispatcher("/register.jsp");
	         		rdd.forward(req,resp);
				}
				else {
					req.setAttribute("msgg", "Registration status! Unsuccessful");
			 		RequestDispatcher rdr= req.getRequestDispatcher("/register.jsp");
	         		rdr.forward(req,resp);
				
				}
				
				
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				out.print(e);
			}
	
		}

}

public boolean idValidation(String Id) {
	boolean present = false;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
        String url = "jdbc:mysql://localhost:3306/sumitdb";
        String dbUser = "root";
        String dbPassword = "sumit@4070";

        // Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Open a connection
        connection = DriverManager.getConnection(url, dbUser, dbPassword);

        // SQL query to check if ID exists
        String sql = "SELECT * FROM collegeid WHERE Id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, Id);

        // Execute the query
        resultSet = preparedStatement.executeQuery();

        // Check if result set is not empty
        present = resultSet.next();
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    } 
		    finally 
		    {
		        // Close resources
		        try {
				            if (resultSet != null) 
				            {
				                resultSet.close();
				            }
				            if (preparedStatement != null) 
				            {
				                preparedStatement.close();
				            }
				            if (connection != null) 
				            {
				                connection.close();
				            }
		        } 
		        catch (SQLException e) 
		        {
		            e.printStackTrace();
		        }
		    }
    return present;
}
	
}



