package com.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/updateEmail")
public class UpdateEmail extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String sql="INSERT INTO register(name,uname,email,phone,pass) VALUES (?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/onlineExam";
	    String username="root";
	    String password="Prince@2001";
	    
	    String email=request.getParameter("mail");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,username,password);
		
		
		
		HttpSession session = request.getSession();
		String name=(String) session.getAttribute("name");
		String uname=(String)session.getAttribute("uname");
		String phone=(String)session.getAttribute("phone");
		String pass=(String)session.getAttribute("pass");
		
		PreparedStatement st=conn.prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,uname);
		st.setString(3,email);
		st.setString(4,phone);
		st.setString(5,pass);
		
		st.execute();
		
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		response.sendRedirect("welcome.jsp");
	}
		

	
}
