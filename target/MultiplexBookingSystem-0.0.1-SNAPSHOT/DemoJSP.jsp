<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
<h1>Demo JSP</h1>

<% System.out.println("This will be printed in Console"); %>
<% out.println("This will be printed on Browser2"); %>

<h1>${requestScope.name}</h1>
<h1>${sessionScope.sessionName}</h1>
<h1>${applicationScope.contextName}</h1>


</body>
</html>