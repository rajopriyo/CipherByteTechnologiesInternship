<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="welcome.css">
</head>
<body>
	<br><br><br><br>
	<div class="heading">
		<center><b>Welcome!!</b></center>
	</div>
	
	<br><br><br><br>
	
	<div>
	<h1>...So Guys Lets Guess...</h1>
	</div>
	<br><br><br><br><br><br>
	
	
	<form action="Name.jsp">
	<button class="play">Play</button>
	</form>
	
	<% 
	   int visit=0;
	   session.setAttribute("visit", visit);
	%>
</body>
</html>