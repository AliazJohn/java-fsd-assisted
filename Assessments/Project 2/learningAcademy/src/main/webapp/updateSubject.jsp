<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject to Teacher</title>
</head>
<body>
<h2>Enter the details</h2><br><br>
<form action="updateSubjectInTeacher" method="post"> 
Enter the Teacher ID number:  <input type="text" name="teacherid"></input><br><br>
Enter the Subject ID number:  <input type="text" name="subjectid"></input><br><br>

<input type="submit" name="submit"></input>
</form>
<br>
<a href="home.html">Go Back</a>
</body>
</html>