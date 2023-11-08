<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" href="Fail.css">  
</head>
<body> 

		
	<header>
		<a src="welcome.jsp"><img class="logo" alt="logo" src="https://media.licdn.com/dms/image/D560BAQG-b0mkRk-xCQ/company-logo_200_200/0/1688576653099?e=2147483647&v=beta&t=68qiUuFjgwnicntNfnVCp28yjfRoX3c-PIgUDxzD_g8"></a>
		
		<form action="logout" method="post"><button type="submit" class="logout_button" > LogOut </button></form>
	
	</header>
	

	
	<article>
	<div class="side_bar">
		<p class="contact">
		<b>    Get in Touch:</b><br><br>
		
		Military Road, Kolkata <br> 
		PIN-700056<br><br>
		
		<b>Mail Us:</b> cipherbytetechnologies@gmail.com<br><br>
		</p>
	</div>
	
	<div class="Successful">
		<img class="logo_right" src="https://st.depositphotos.com/47577860/53443/v/450/depositphotos_534432526-stock-illustration-face-sad-smiley-icon-filled.jpg">
		<center><b>Sorry You have Failed.</b></center>
			
		<br>
			 <div class="result">
	<%
		int score=(int) session.getAttribute("score");
		score+=4;
	%>

	<center>Score: <%=score%>/40</center>
	</div>
	</div>
		
		
	</article>
	
	<article>
	
	
</article>
	
</body>
</html>