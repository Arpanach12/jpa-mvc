<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
   
<style>
* {
  text-align: center;
  color: blue;
  background-color: pink;
}
h1.center {
  text-align: center;
  color: red;
}
</style>
<body>
<h1>ApplicationName: ${ApplicationName}</h1>
<h1>Status: ${Status}</h1>
<h1>ErrorMessage: ${ErrorMessage}</h1>
<h1>TimeStamp: ${TimeStamp}</h1>
</body>
</html>