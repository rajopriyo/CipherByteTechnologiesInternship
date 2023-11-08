package com.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ans2")
public class question2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		try
		{
		String ans=request.getParameter("ans");
//		PrintWriter out=response.getWriter();
		
	
		
		HttpSession session = request.getSession();
		int sum=(int)session.getAttribute("score");
		if(ans.equals("true"))
		{
			
			sum+=4;
			session.setAttribute("score", sum);
			response.sendRedirect("ExamPage3.jsp");
			
		}
		else
		{
			sum+=0;
			session.setAttribute("score", sum);
			response.sendRedirect("ExamPage3.jsp");
		}
		
		
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
		
	  }
		
	}
		
		
		
		

