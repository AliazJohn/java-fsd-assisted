<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class to student</title>
</head>
<body>
<h2>Enter the details</h2><br><br>
<form action="updateClassInStudent" method="post"> 
Enter the ID number of the Student:  <input type="text" name="stdid"></input><br><br>
Enter the name of the Student:  <input type="text" name="name"></input><br><br>
Enter the Class Number: <input type="text" name="std"></input><br><br>
<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>