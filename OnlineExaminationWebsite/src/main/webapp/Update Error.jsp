<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="loginError.css">  
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
		<form action="login" method="post">
		<br>
		<div class="details">
		Name:<br> <input type="text" name="uname"><br><br>
		
		Username:<br> <input type="text" name="pass"><br><br>
		</div>
		
		
		<button type="submit" class="login_button" > Login </button>
		
			<p class="warning"><b>Warning:</b> Username/Name doesn't exists.</p>
	</form>
		
	
		
	</div>
		

</body>
</html>