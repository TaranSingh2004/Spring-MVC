<%@ page language= "java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> About Page </title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<h1 style="color:green">${msg}</h1>

<hr>
    <h1> success </h1>
    <h1> welcome ${user.name } </h1>
    <h1> Your email is ${user.email } </h1>
</body>
</html>