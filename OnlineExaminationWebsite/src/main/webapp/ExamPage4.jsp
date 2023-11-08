<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExamPage1</title>
<link rel="stylesheet" href="ExamPage4.css">  
<script>
  window.onload = function() {
    var countDownDate = new Date().getTime() + 92000; // Set timer for 1 minute

    var x = setInterval(function() {
      var now = new Date().getTime();
      var distance = countDownDate - now;

      var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
      var seconds = Math.floor((distance % (1000 * 60)) / 1000);

      document.getElementById("timer").innerHTML = "<h2>Time left:</h2>" + minutes + ": " + seconds + " ";
      document.getElementById("timer").style.color = "green"; // Set the timer color to green

      if (distance < 1  ) {
          clearInterval(x);

          setTimeout(function() {
            window.location.href = "ExamPage5.jsp"; // Replace with your desired URL
          }, 2000); // Redirect after 2 seconds (2000 milliseconds)
        }
      }, 1000);
    };
</script>
</head>
<body>
<header>
    
    <img class="logo" alt="logo" src="https://media.licdn.com/dms/image/D560BAQG-b0mkRk-xCQ/company-logo_200_200/0/1688576653099?e=2147483647&v=beta&t=68qiUuFjgwnicntNfnVCp28yjfRoX3c-PIgUDxzD_g8">
    <div class="picture">
      	<div id="timer"></div>
    </div>
</header>

<br><br>
<br><br>
<br><br>
<br><br>
<article>
  <div class="side_bar"> 
  	<br><br><br><br><br><br>
    <button class="question">1</button>
    <button class="question" >2</button>
    <button class="question" >3</button>
    <button class="question_1" >4</button><br>
    <button class="question">5</button>
    <button class="question" >6</button>
    <button class="question" >7</button>
    <button class="question" >8</button><br>
    <button class="question">9</button>
    <button class="question" >10</button><br>
  </div>
  
  <div class="ques"><b>Question 4:</b><br><br>
  Which one of the following is not a Java feature?
  </div>
  
  <div class="right_side">
  <div class="candidate">
   <%
	String name=(String) session.getAttribute("name");
  	String uname=(String) session.getAttribute("uname");
  	String email=(String) session.getAttribute("email");
  	String phone=(String) session.getAttribute("phone");

  
  %>

 
 <b>Candidate Details:</b><br><br>
    <b>Name:</b> <%= name %><br>
    <b>Username:</b> <%= uname %><br>
    <b>Phone No. :</b> <%= phone %><br>
    <b>Email:</b><br> <%= email %><br>
	</div>
  </div>
  
</article>

<article>
  <div class="side_bar1"> <br><br><br><br><br><br> </div>
  <div class="ans"><b>Options:</b><br><br>

<form action="ans4" method="post">
  <input class="radio_button" type="radio" value="a" name="ans">Object-oriented<br>
  <input class="radio_button" type="radio" value="true" name="ans"> Use of pointers<br>
  <input class="radio_button" type="radio" value="c" name="ans">  Portable<br>
  <input class="radio_button" type="radio" value="d" name="ans">Dynamic and Extensible<br>
  
  <br><br>
  
  
 <button class="login" >Submit</button></form>
  </div>

  <div class="right_side1">
    <button type="submit" class="logout_button" > LogOut </button>
  </div>    

</article>
</body>
</html>
