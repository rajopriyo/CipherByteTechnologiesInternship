package com.guess;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/again")
public class PlayAgain extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   HttpSession session=request.getSession();
	   int visit=(int)session.getAttribute("visit");
	   PrintWriter out=response.getWriter();
	   if(visit>5)
	   {
		   response.sendRedirect("Error.jsp");		   
	   }
	   else
	   {
		   response.sendRedirect("GamePage.jsp");
	   }
	}

		
}
