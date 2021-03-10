<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<script language="javascript">
			function getStudentByClass(selectedClass) {
				
			
				window.location.href = '/getStudentByClass?Classid='+ selectedClass;
			}
		</script>
<body>
<div align="center" class="container">

 <div class="form-group form-check">
			<label class="form-check-label" >Select class</label>
		 
		 <select name="studentClass" id="studentClass" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" onchange="getStudentByClass(this.value)">
		 <option value="" >select the class
			<c:forEach var="class1" items="${ClassList}">	
				<option value="${class1.classId}">${class1.classSection}</option>
			</c:forEach>
		</select><br><br>
		</div>


<table class="table table-dark table-striped">

<tr>
<th>studentId</th><th>studentName</th><th>studentDateOfBirth</th><th>studentAge</th><th>studentClass</th>

</tr>
<c:forEach var="pro" items="${studentList}">
<tr>
<td>${pro.studentId}</td>
<td>${pro.studentName}</td>
<td>${pro.studentDateOfBirth} </td>
<td>${pro.studentAge} </td>
<td>${pro.studentClass.classSection} </td>



</tr>
    </c:forEach> 
  </table>
</div>

  </body>
  
</html>
