<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>${Header}</h1>
    <h5>${Desc}</h5>
    <h4 style="color: green">${msg}</h4>
    <hr>
      <h3>Welcome, ${user.userName }</h3>
      <h3>Your email Address is ${user.email }</h3>
      <h3>Your password is ${user.password }</h3>
</body>
</html>