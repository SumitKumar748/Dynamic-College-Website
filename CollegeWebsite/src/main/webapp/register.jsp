<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="css/allinone.css" rel="stylesheet" type="text/css">
    <link rel="icon" type="image/png" href="images/icon.ico">
    <title>Register as new user</title>
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

    <div class="container">
    <p style="color:black;text-align:center;font-size:25px;">${msgg}</p>
        <div class="title">Registration Form</div>
			        <div class="content">
							          <form action="registration" method="post">
									            <div class="user-details">
									            	<div class="input-box">
													     	    <span id="details" >Department</span>
																<select id="selectdepart" name="department" >
																			        <option value="EE-A">Electrical Engineering</option>
																			        <option value="EE-B">Mechanical Engineering</option>
																			        <option value="EE-C">Civil Engineering</option>
																			        <option value="EE-D">Computer Science Engineering</option>
																			        <option value="EE-A">Information Technology Engineering</option>
																			        <option value="EE-B">Food Technology Engineering</option>
																			        <option value="EE-C">Bachelor's in Computer Application</option>
																			        <option value="EE-D">Bachelor's in Business Administration</option>
															      </select>
														</div>
															 <div class="input-box">
														                <span class="details" >Id Number</span>
														                <input type="text" name="idnum" placeholder="Enter your name" required>
												 				</div>
												              <div class="input-box">
														                <span class="details" >Student Name</span>
														                <input type="text" name="sname" placeholder="Enter your name" required>
												 				</div>
												              <div class="input-box">
															                <span class="details">Parent's Name</span>
															                <input type="text" name="pname" placeholder="Enter Mother's/Father's name" required>
															  </div>
												              <div class="input-box">
														                <span class="details" >Email</span>
														                <input type="text" name="email" placeholder="Enter your email" required>
												              </div>
												              <div class="input-box">
														                <span class="details">Password</span>
														                <input type="password" name= "pword" placeholder="Enter your password" required>
												          	   </div>
												              <div class="input-box">
														                <span class="details">Phone Number</span>
														                <input type="text" name="phnum" placeholder="Enter Phone Number" required>
														      </div>
												              <div class="input-box">
														                <span class="details">Date of birth</span>
														                <input id="date" type="date" name="dob" required>
												              </div>
							            		</div>
										            <div class="button-container">
												              <div class="button">
												                <input type="submit" value="Register">
										              		</div>
							           			    </div>
							           			    
							          </form>
			        </div>
      </div>
    <br>
    <br>
    <br>
    <br>

</div>
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
</body>
</html>