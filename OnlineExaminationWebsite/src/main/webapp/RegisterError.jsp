<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" href="signup_style.css">  
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
		<p class="warning"><b>Warning:</b> Confirm Password and Password not same.</p>
			<form action="register" method="post">
		
		Full Name:<b>*</b><br> <input type="text" name="name"><br><br>
		UserName:<b>*</b><br> <input type="text" name="uname"><br><br>
		Email Id:<b>*</b><br> <input type="text" name="email"><br><br>
		Phone No:<b>*</b><br> <input type="text" name="phone"><br><br>
		Password:<b>*</b><br> <input type="password" name="pass" ><br><br>
		Confirm Password:<b>*</b><br> <input type="text" name="conpass"><br><br>
		
		<button type="submit" class="register_button" > Register </button>
		
	</form>
	</div>


</article>
</body>
</html>