<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="java.util.*" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.bean.product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj1" class="com.bean.product" scope="session"></jsp:useBean>
<%   
int id=Integer.parseInt(request.getParameter("id"));  
String name=request.getParameter("name");  
int price=Integer.parseInt(request.getParameter("price"));   

product p=new product();
p.setId(id);
p.setName(name);
p.setPrice(price);
request.getSession(true);
Object obj2=session.getAttribute("obj2");
ArrayList<product> list;
if(obj2==null){ 
	list = new ArrayList<product>();
	list.add(p);
	session.setAttribute("obj2", list);
}
else{
	list=(ArrayList<product>)session.getAttribute("obj2");
	list.add(p);
	session.setAttribute("obj2", list);
}


Iterator<product> li = list.iterator();
while(li.hasNext()){
	product pr = li.next();
	out.print(pr+ "<br>");
}
%>  
<%@include file="index.jsp" %>
</body>
</html>