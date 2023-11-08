package com.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/result")
public class Result extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String sql="INSERT INTO attended(uname,phone,pass,score) VALUES (?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/onlineExam";
	    String username="root";
	    String password="Prince@2001";
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,username,password);
		System.out.print("Connection Established");	
		PreparedStatement st=conn.prepareStatement(sql);
		
		HttpSession session=request.getSession();
		
	  	String uname=(String) session.getAttribute("uname");
	  	String pass=(String) session.getAttribute("pass");
	  	String phone=(String) session.getAttribute("phone");
	  	int score=(int)session.getAttribute("score");
	  	
		st.setString(1,uname);
		st.setString(2,phone);
		st.setString(3,pass);
		st.setInt(4,score);
		
		st.execute();
		
		if(score>=24)
			response.sendRedirect("Pass.jsp");
		else
			response.sendRedirect("Fail.jsp");
		
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

	  }
		
	}
}
