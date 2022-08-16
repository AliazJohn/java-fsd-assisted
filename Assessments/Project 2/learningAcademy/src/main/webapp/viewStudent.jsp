<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import=" com.learningAcademy.dto.StudentDetails" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%


ArrayList<StudentDetails> c = (ArrayList<StudentDetails>) request.getAttribute("clist");
Iterator it=c.iterator(); %>
<h2>Student Details</h2><br><br>
	<table border=1>
	<tr><td>Class Number</td>
	<td>Class Advisor Name</td>
	<td>Class Advisor Name</td>
	<td>Class Advisor Name</td>
	<td>Class Advisor Name</td>
	<td>Number of Students</td></tr>
	
<%while(it.hasNext()){
Object o=(Object)it.next();
StudentDetails c1=(StudentDetails)o; %>
 <tr>
	<td><%out.println(c1.getStudentId());%></td>
	<td><%out.println(c1.getRollNo());%></td>
	<td><%out.println(c1.getStudentName());%></td>
	<td><%out.println(c1.getStdId());%></td>
	<td><%out.println(c1.getAge());%></td>
	<td><%out.println(c1.getAddress());%></td>
			 </tr>
<%}%>

 </table>
 <br>
<a href="home.html">Go Back</a>
</body>
</html>