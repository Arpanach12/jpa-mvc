<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<%-- <jsp:include page="options.jsp"></jsp:include> --%>
<div align="center" class="form">
<h1>update the base price</h1>
<form action="/update" >
<div class="container">

Previous price of player:<input type="text" name="preprice" id="preprice" value="${previousprice}" disabled="disabled"><br>
</div>
<div class="container">

Enter the updated price:<input type="text" name="updateprice" id="updateprice" ><br>
</div>
<div class="container">

<input type="hidden" name="playerid" value="${playerid}" ><br>
</div>
<input type ="submit" value="update">
</form><br>


</div>
</body>
</html>