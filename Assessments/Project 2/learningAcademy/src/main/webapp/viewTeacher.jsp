<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import=" com.learningAcademy.dto.TeacherDetails" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%


ArrayList<TeacherDetails> c = (ArrayList<TeacherDetails>) request.getAttribute("clist");
Iterator it=c.iterator(); %>
<h2>Teeacher Details</h2><br><br>
	<table border=1>
	<tr><td>Teacher ID</td>
	<td>Teacher Name</td>
	<td>Age</td>
	<td>Subject ID</td></tr>
	
<%while(it.hasNext()){
Object o=(Object)it.next();
TeacherDetails c1=(TeacherDetails)o; %>
 <tr>
	<td><%out.println(c1.getTeacherID());%></td>
	<td><%out.println(c1.getTName());%></td>
	<td><%out.println(c1.getAge());%></td>
	<td><%out.println(c1.getSubID());%></td>
			 </tr>
<%}%>

 </table>
 <br>
<a href="home.html">Go Back</a>
</body>
</html>