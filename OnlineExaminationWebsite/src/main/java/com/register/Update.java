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

@WebServlet("/update")
public class Update extends HttpServlet {


	
	String sql="select *from register where  name=? and uname=?";
	String sql1="delete from register where  name=? and uname=?";
	String url="jdbc:mysql://localhost:3306/onlineExam";
    String username="root";
    String password="Prince@2001";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url,username,password);
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2,uname);
			ResultSet rs = st.executeQuery();
	
			
			
			HttpSession session = request.getSession();
			if(rs.next())
			{
			
			String phone=rs.getString("phone");
			String email=rs.getString("email");
			String pass=rs.getString("pass");
			
			session.setAttribute("name", name);
			session.setAttribute("uname", uname);
			session.setAttribute("email", email);
			session.setAttribute("phone", phone);
			session.setAttribute("pass", pass);
			
			PreparedStatement st1=conn.prepareStatement(sql1);
			st1.setString(1,name);
			st1.setString(2,uname);
			st1.execute();
			
			response.sendRedirect("Update.jsp");
			
			}
			else
			{
				response.sendRedirect("Update Error.jsp");
			}
		} catch (ClassNotFoundException | SQLException  e) {
		
			e.printStackTrace();
		}
		
		
	}


	
}
