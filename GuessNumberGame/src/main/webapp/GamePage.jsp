<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="game.css">
</head>
<body>
	<br><br>
	<div class="heading">
	<%
		String name=(String) session.getAttribute("name");
		name=name+" ";
		name=name.substring(0,name.indexOf(' '));
	%>
		<center><b>Hello <%= name %>!!</b></center>
	</div>
		
	<div>
	    <div class="my_animation">
      <p>...Now Guess a Number(Between 1 to 100)...</p>
  </div>
	<br><br><br><br>
	<form action="guess" method="post">
	<div class="guess">
	<b>Enter the Number you Guessed:</b><br><br><input type="text" name="number" >
			<article>
	</div>
	
	<button class="play">Guess</button>
	
	</article>	
	</form>
	
	</div>
	
	<%
	   int visit=(int)session.getAttribute("visit");
	   session.setAttribute("visit", visit+1);
	%>
	
</body>
</html>