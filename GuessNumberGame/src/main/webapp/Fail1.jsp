<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="fail.css">
</head>
<body>
	<%
		int actual=(int) session.getAttribute("actual");
	%>
	<br><br>
	<div class="heading">
		<center><b>!! You Lose !!</b></center>

	<div>
	    <div class="my_animation">
      <p>...Sorry you guessed a Gretear Number...<br>The number was <b><%= actual %></b></p>
  </div>

	
	<div class="guess">
	<img alt="" src="https://cdn4.vectorstock.com/i/1000x1000/75/03/sad-smile-in-paper-style-on-red-background-vector-22507503.jpg">
	</div>
	
	<form action="again" method="post">
	<button class="play">Try Again</button>
	</form>

	<form action="Welcome Page.jsp">
	<button class="exit">Exit</button>
	</form>
	

		
	
	

	
</body>
</html>