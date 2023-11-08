<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="name.css">
</head>
<body>
	<br><br>
	<div class="heading">
		<center><b>Hey Welcome!!</b></center>
	</div>
		
	<div>
	    <div class="my_animation">
      <p>...What is your Name?...</p>
  </div>
	<br><br><br><br>
	<form action="name" method="post">
	<div class="guess">
	<b>Enter Your Name:</b><br><br><input class="Name" type="text" name="name" >
	
	</div>
	
	<button class="play">Proceed</button>
	
	</form>
	
	</div>
	
	<%
	   int visit=(int)session.getAttribute("visit");
	   session.setAttribute("visit", visit+1);
	%>
	
</body>
</html>