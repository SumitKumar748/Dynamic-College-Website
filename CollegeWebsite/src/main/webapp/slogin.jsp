<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="css/allinone.css" rel="stylesheet" type="text/css">
    <link rel="icon" type="image/png" href="images/icon.ico">
    <title>Student Login</title>
</head>
<body style="background-color:#96C2DB">
<div id="maindiv">
    <div class="d1">
        <img src="images/thelogo.png" class="img1">
        <h1> Techno Main Salt Lake, Sector V</h1>

    </div>
    <div class="d2"></div>
    <div class="mcd3">
		            
		            <a href="index.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Home</h4></a>
		       
		           <a href="register.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Registration form</h4></a>
		
		           <a href="slogin.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Student Login</h4></a>
		
		           <a href="tlogin.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Teachers Login</h4></a>
		           
		           <a href="helpdesk.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Announcement</h4></a>
		           
      </div>

    <form class="d4" action="studentlogin" method="post" style="background-color:#96C2DB;">
            <div class="d41">
                <center><label class="l1">Student Id</label>
                <input class="i1" name="eid" placeholder="Enter Email" type="email" required>
               <label class="l1">Password</label>
                <input class="i1" name="pwd" placeholder="Enter Password" type="password" required><br>
                </center>
                <button type="submit" class="but1"><h3 class="login">Login</h3></button>
                <p style="color:white;text-align:center; font-size:25px;">${msg}</p>
            </div>
          
    </form>
    

  <br><br><br><br>
				
	<footer style="display: flex;background-color: black;" >
                <img src="images/img11.png" style="width: 80px; height: 80px;" >
            <center>
                
                <p style="color: whitesmoke;">Techno Main Salt Lake is a unit of the Techno India Group,
                    situated at the Salt Lake Campus.It is an elite academic 
                    institution which caters to bright students and is committed to
                    providing them the best education and opportunities 
                    for future career growth.</p>
            </center>
            </footer>			

</div>

</body>
</html>