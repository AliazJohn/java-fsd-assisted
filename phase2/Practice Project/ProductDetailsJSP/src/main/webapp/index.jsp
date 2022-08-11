<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.bean.product" scope="session"></jsp:useBean> 
	<form action="next.jsp" method="post">
	Enter id: <input type="text" name="id" placeholder="id"></input><br><br>
	Enter product name: <input type="text" name="name" placeholder="name"></input><br><br>
	Enter price: <input type="text" name="price" placeholder="price"></input><br><br>
	<input type="submit" name="submit"></input>
	
	</form>
</body>
</html>