<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		<h1>Edit User Form</h1>
		<form action="updateUser" method="post">

	
						<label for="id">Id</label> <input type="text"
							value="${user.id}"  id="id" name="id"
							readonly="readonly">
							<label for="name">Name</label> <input type="text"
							value="${user.name }"  id="name"
							name="name" placeholder="Enter Name">
							<label for="age">Age</label> <input type="number"
							value="${user.age}"  id="age"
							name="age" placeholder="Enter Age">

			<button type="submit">Submit</button>
		</form>

</body>
</html>