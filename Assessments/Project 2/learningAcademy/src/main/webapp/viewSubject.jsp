<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import=" com.learningAcademy.dto.SubjectDetails" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%


ArrayList<SubjectDetails> c = (ArrayList<SubjectDetails>) request.getAttribute("clist");
Iterator it=c.iterator(); %>
<h2>Subject Details</h2><br><br>
	<table border=1>
	<tr><td>Subject ID</td>
	<td>Subject Name</td>
	
	
<%while(it.hasNext()){
Object o=(Object)it.next();
SubjectDetails c1=(SubjectDetails)o; %>
 <tr>
	<td><%out.println(c1.getSubID());%></td>
	<td><%out.println(c1.getSubjectName());%></td>
			 </tr>
<%}%>

 </table>
 <br>
<a href="home.html">Go Back</a>
</body>
</html>