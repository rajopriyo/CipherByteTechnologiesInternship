package com.guess;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/guess")
public class Guess extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int guess=Integer.parseInt(request.getParameter("number"));
		Random random = new Random();
		int actual = random.nextInt(1+100) + 1;
		HttpSession session=request.getSession();
		session.setAttribute("actual", actual);
		if(guess==actual)
		{
			response.sendRedirect("Sucess.jsp");
		}
		else if(guess<actual)
		{
			response.sendRedirect("Fail.jsp");
		}
		else if(guess>actual)
		{
			response.sendRedirect("Fail1.jsp");
		}
	}
	
	
}
