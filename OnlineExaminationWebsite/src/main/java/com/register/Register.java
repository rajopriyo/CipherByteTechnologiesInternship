package com.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class Register extends HttpServlet {
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String sql="INSERT INTO register(name,uname,email,phone,pass) VALUES (?,?,?,?,?)";
		String sql1="select *from register where  uname=?";
		String url="jdbc:mysql://localhost:3306/onlineExam";
	    String username="root";
	    String password="Prince@2001";
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,username,password);
		System.out.print("Connection Established");	
		
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String pass=request.getParameter("pass");
		String conpass=request.getParameter("conpass");
		
		PreparedStatement st1=conn.prepareStatement(sql1);
		st1.setString(1,uname);
		ResultSet rs=st1.executeQuery();
		if(rs.next())
		{
			response.sendRedirect("UsernameError.jsp");
		}
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("uname", uname);
		session.setAttribute("email", email);
		session.setAttribute("phone", phone);
		session.setAttribute("pass", pass);
		
		if( name=="" || uname=="" || email=="" || phone=="" || pass=="")
		{
			response.sendRedirect("RegisterBlank.jsp");
		}
		else
		{
		if(pass.equals(conpass))
		{
		PreparedStatement st=conn.prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,uname);
		st.setString(3,email);
		st.setString(4,phone);
		st.setString(5,pass);
		st.execute();
		response.sendRedirect("Succesful.jsp");
		
		
		}
		else 
		{
			response.sendRedirect("RegisterError.jsp");
		}
		}
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
}
}
