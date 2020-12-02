<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
    
    <h1>This is Help Page</h1>
    
    <%
       String name = (String) request.getAttribute("name");
       Integer rollno = (Integer) request.getAttribute("rollno");
       LocalDateTime time = (LocalDateTime) request.getAttribute("time");
    %>
    
    <h2>Hello my name is : <%=name %> </h2>
    <h2>My Roll Number is : <%=rollno %></h2>
    <h2>Data and Time is : <%= time %></h2>

</body>
</html>