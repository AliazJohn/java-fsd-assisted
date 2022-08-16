<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher Details</title>
</head>
<body>
<h2>Enter the Teacher Details</h2>
<form action="addTeacherDetails" method="post">
Name: <input type="text" name="name"></input><br><br>
Age: <input type="text" name="age"></input><br><br>
Subject ID: <input type="text" name="subjectid"></input><br><br>
<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>