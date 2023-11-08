<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="UpdateDetails.css">  
</head>
<body>

	
	<header>
		<a src="welcome.jsp"><img class="logo" alt="logo" src="https://media.licdn.com/dms/image/D560BAQG-b0mkRk-xCQ/company-logo_200_200/0/1688576653099?e=2147483647&v=beta&t=68qiUuFjgwnicntNfnVCp28yjfRoX3c-PIgUDxzD_g8"></a>
		<h1 class="heading">Welcome to CipherByte Technologies</h1>
		
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
	
	<div>
			<form class="updateForm" action="updateEmail" method="post">
	
		<div class="details">
		<br><br>
		Enter New Email Address:<br> <input type="text" name="mail"><br><br>		
		<br>
		<button type="submit" class="" > Update </button>
		
	</form>
	</div>
		
	</article>
	

</body>
</html>