<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
    
    <h1>This is Help Page</h1>
    
    <%
      /*  String name = (String) request.getAttribute("name");
       Integer rollno = (Integer) request.getAttribute("rollno");
       LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
    %>
    
    <h2>Hello my name is : <%-- <%=name %> --%> ${name } </h2>
    <h2>My Roll Number is : <%-- <%=rollno %> --%> ${rollno } </h2>
    <h2>Data and Time is : <%-- <%= time %> --%> ${time} </h2>
    <hr>
    
    <c:forEach var="item" items="${marks}">
          <h3>${item}</h3>
          <h4><c:out value="${item}"></c:out></h4>
    </c:forEach>

</body>
</html>