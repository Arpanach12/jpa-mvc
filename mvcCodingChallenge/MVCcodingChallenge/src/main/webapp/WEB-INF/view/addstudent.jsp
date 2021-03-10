<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Add Students</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>


  
</head>
<body>

<div class="container">
  <h2>Add Student</h2>
  <form action="/addstudent"  method="post">
 
 
 
    <div class="form-group">
      <label for="studentName" class="form-check-label">Student Name:</label>
      <input type="text" class="form-control" id="studentName" placeholder="Enter studentName" name="studentName" >
    </div>
   
    <div class="form-group">
        <label for="studentDateOfBirth" class="form-check-label">Student Date Of Birth:</label>
            <input type="date" class="form-control" id="studentDateOfBirth" 
                name="studentDateOfBirth">
    </div>
    
  <div class="form-group">
      <label for="studentAge" class="form-check-label">Student Age:</label>
      <input type="number" class="form-control" id="studentAge" placeholder="Enter studentAge" name="studentAge" >
    </div>
<div class="form-group form-check">
			<label class="form-check-label" >Select Section</label>
		 
		 <select name="studentClass" id="studentClass" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" >
		 <option value="" >select the Section
			<c:forEach var="class1" items="${ClassList}">	
				<option value="${class1.classId}">${class1.classSection}</option>
			</c:forEach>
		</select><br><br>
		</div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>






<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
    integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo=" crossorigin="anonymous"></script>


<script>
$.validator.addMethod("datavalida", function (value, element) {
	var curDate = new Date();
	var inputDate = new Date($('#studentDateOfBirth').val());
	if (inputDate <= curDate) {
		return true;
	} else {
		return false;
	}
}, "should not enter more than present date...!");
$.validator.addMethod("checkfirstcase", function (value, element) {
	var word = $('#studentName').val();
	if( word[0] == word[0].toUpperCase() )
	{
		return true;
	}
	else {
		return false;
	}
}, "first case should be capital..!");

$("form").validate({
	rules: {
		studentName:{
			required: true,
			lettersonly: true,
			checkfirstcase:true
		},
		
		studentDateOfBirth: {
			required: true,
			datavalida: true

		},
		
		studentAge: {
			required: true,
			minlength: 2,
			maxlength:2,
			number:true
		},
		studentClass: {
			required: true,
			
		}
	}
})
	</script>
