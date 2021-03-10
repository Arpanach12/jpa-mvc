<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="options.jsp"></jsp:include>
<div align="center" class="form">
<h1>Teams</h1>
<form action="addteam" method="post">
Enter the Team name:<input type="text" name="teamName" id="teamName"><br>
Enter the Manager Name:<input type="text" name="teamManager" id="teamManager"><br>
Enter Team Budget:<input type="text" name="teamBudget" id="teamBudget"><br>

<input type ="submit">
</form><br>
<a href="options"><button>Back</button></a>

</div>
</body>
</html>
