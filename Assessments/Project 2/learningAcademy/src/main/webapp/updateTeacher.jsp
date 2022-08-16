<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Class To Student</title>
</head>
<body>
<h2>Enter the details</h2><br><br>
<form action="updateTeacherInClass" method="post"> 
Enter the Class Number: <input type="text" name="classnum"></input><br><br>
Enter the name of Class Advisor: <input type="text" name="advisorname"></input><br><br>
<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>