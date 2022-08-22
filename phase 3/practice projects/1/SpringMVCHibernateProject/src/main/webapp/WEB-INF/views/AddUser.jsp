<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user form</title>
</head>
<body>

		<h2>Add User </h2><br>
		<form action="insertUser" method="post">
	
						<label for="name">ID</label> <input type="text"
							 id="id" name="id"
							placeholder="Enter ID"><br><br>
		

						<label for="name">Name</label> <input type="text"
							 id="name" name="name"
							placeholder="Enter Name"><br><br>
	
	
						<label for="name">Age</label> <input type="text"
							 id="age" name="age"
							placeholder="Enter Age"><br><br>
			

			<a href="${pageContext.request.contextPath }/"
				> Back </a>
			<input type="submit" value="SUBMIT">
		</form>


</body>
</html>