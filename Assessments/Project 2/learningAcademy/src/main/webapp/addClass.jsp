<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Details</title>
</head>
<body>
<h2>Enter the Class Details</h2>
<form action="addClassDetails" method="post">
Class Number: <input type="text" name="classnum"></input><br><br>
Number of students: <input type="text" name="studentsnum"></input><br><br>
Class Advisor: <input type="text" name="advisorname"></input><br><br>
<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>