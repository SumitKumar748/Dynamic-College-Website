<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Credentials</title>
<link href="css/allinone.css" rel="stylesheet" type="text/css">
<link rel="icon" type="image/png" href="images/icon.ico">
</head>
<body style="background-color: #B2B5E0;">
	<div id="maindiv">
        <div class="d1">
            <img src="images/thelogo.png" class="img1">
            <h1> Techno Main Salt Lake, Sector V</h1>
        </div>
        <div class="d2"></div>
         <div class="mcd3">
		            
		            <a href="studentwelcome.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Dashboard</h4></a>
		       
		           <a href="StMyCredential.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>My Credentials</h4></a>
		
		           <a href="Students/StAllSubjects.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>Subjects Details</h4></a>
		
		           <a href="Students/StCamarks.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>CA Marks</h4></a>
		           
		           <a href="Students/StPCAmarks.jsp" style="text-decoration: none;color:rgb(103, 12, 88);" class="mcd33"><h4>PCA Marks</h4></a>
		           
		       </div>

        <div class="tb1">
	        <div class="tb11">
	        		<center>
			        		<form action="mycred" method="get" >
			        				<button type="submit" style="padding:10px 45px 10px 45px; border-radius:4px;cursor:pointer;">Click here to show details</button>
			        		</form>
	        		</center>
	        </div>
            <div class="tb11">
		               <img src="images/user-icon-png-transparent-35.jpg" alt="Image not present in database" width="200px" height="250px" id="ti1"><br>
		                <span id="span11">Name:${name}</span><br>
		                <span id="span11">E-mail:${email}</span><br>
		                <span  id="span11">Phone number:${phnumber}</span><br>
		                <span  id="span11">Qualification:${qualification}</span><br>
		                <span id="span11" >Assigned as:${position}</span><br><br>
				       
            </div>
        </div>
	<br><br><br><br><br><br><br>
				<div class="mcd3">
				            
					<a href="studentwelcome.jsp" style="text-decoration: none; color: rgb(103, 12, 88); margin-left: 2%;" class="mcd33"><h4>Back to Dashboard</h4></a>
				</div>
				<br><br><br>



    </div>
</body>
</html>