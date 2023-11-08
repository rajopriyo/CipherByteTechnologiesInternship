package com.login;

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

@WebServlet("/login")
public class login extends HttpServlet {


	
	String sql="select *from register where  uname=? and pass=?";
	String sql1="select *from attended where  uname=? and pass=?";
	String url="jdbc:mysql://localhost:3306/onlineExam";
    String username="root";
    String password="Prince@2001";
	public boolean check(String uname,String pass) throws ClassNotFoundException, SQLException
	{
		

        try
        {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,username,password);
		PreparedStatement st=conn.prepareStatement(sql);
		st.setString(1,uname);
		st.setString(2,pass);
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next())
		{
			return true;
		}
		st.close();
		conn.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	System.out.print(e.getMessage());
        }
        
        
		return false;
	}
	public boolean checkDuplicate(String uname,String pass) throws ClassNotFoundException, SQLException
	{
		

        try
        {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,username,password);
		PreparedStatement st=conn.prepareStatement(sql1);
		st.setString(1,uname);
		st.setString(2,pass);
		ResultSet rs = st.executeQuery();
		int score=-1;
		
		if(rs.next())
		{
			score=rs.getInt("score");
		}
		if(score>=0)
		{
			return true;
		}
		
	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	System.out.print(e.getMessage());
        }
        
        
		return false;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url,username,password);
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
	
			
			
			HttpSession session = request.getSession();
			if(rs.next())
			{
			String name=rs.getString("name");
			String user=rs.getString("uname");
			String email=rs.getString("email");
			String phone=rs.getString("phone");
					
			
			session.setAttribute("name", name);
			session.setAttribute("uname", user);
			session.setAttribute("email", email);
			session.setAttribute("phone", phone);
			session.setAttribute("pass", pass);
			
			}
			
			if(checkDuplicate(uname, pass) && uname!="")
			{
				response.sendRedirect("LoginDuplicate.jsp");
			}
			else if(check(uname, pass) && uname!="")
			{
					response.sendRedirect("StartTestjsp.jsp");
			}
			else
			{
				response.sendRedirect("loginError.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
		
			e.printStackTrace();
		}
	}


	
}
