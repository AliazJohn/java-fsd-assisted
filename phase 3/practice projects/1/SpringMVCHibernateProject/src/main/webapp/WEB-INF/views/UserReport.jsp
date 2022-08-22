<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Table</title>
</head>
<body>


		<h1>User Table</h1><br>
		<a href="addUser"> Add User </a><br><br>
	

			<table border="1">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Age</th>
						<th scope="col">Edit</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usr" items="${User}">
						<tr>
							<td class="table-plus">${usr.id}</td>
							<td>${usr.name}</td>
							<td>${usr.age}</td>
							<td><a href="editUser/${usr.id}">
									Edit </a></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
	
</body>
</html>