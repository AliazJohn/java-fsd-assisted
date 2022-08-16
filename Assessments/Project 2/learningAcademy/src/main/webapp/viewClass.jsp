<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Details</title>
</head>
<body>
<%@ page import=" com.learningAcademy.dto.ClassDetails" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%


ArrayList<ClassDetails> c = (ArrayList<ClassDetails>) request.getAttribute("clist");
Iterator it=c.iterator(); %>
<h2>Class Details</h2><br><br>
	<table border=1>
	<tr><td>Class Number</td>
	<td>Class Advisor Name</td>
	<td>Number of Students</td></tr>
	
<%while(it.hasNext()){
Object o=(Object)it.next();
 ClassDetails c1=(ClassDetails)o; %>
 <tr>
	<td><%out.println(c1.getClassNum());%></td>
	<td><%out.println(c1.getAdvisorName());%></td>
	<td><%out.println(c1.getStudCount());%></td>
			 </tr>
<%}%>

 </table>
 <br>
<a href="home.html">Go Back</a>
</body>
</html>