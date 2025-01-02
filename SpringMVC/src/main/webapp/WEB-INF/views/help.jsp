<%@ page language= "java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> About Page </title>
</head>
<body>



<h1> hello my name is taran </h1>
<h1> this is help page </h1>

<h1>Hello, my name is ${name}</h1>
<h1>My ID is ${id}</h1>
<h1>Current Date and Time: ${time}</h1>

<c:forEach var="item" items="${marks }">
<h1><c:out value="${item }"></c:out></h1>

</c:forEach>


</body>
</html>