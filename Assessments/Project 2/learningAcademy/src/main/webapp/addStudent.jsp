<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>Enter the Student Details</h2>
<form action="addStudentDetails" method="post">
Name: <input type="text" name="name"></input><br><br>
Roll No: <input type="text" name="rollno"></input><br><br>
Age: <input type="text" name="age"></input><br><br>
Class: <input type="text" name="std"></input><br><br>
Address: <input type="text" name="address"></input><br><br>
<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>