<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Project</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


  
</head>
<body>
<div class="container">
  <h2>Add Class</h2>
  <form action="/addclass"  method="post">
 
    <div class="form-group">
      <label for="classSection">Class Section:</label>
      <input type="text" class="form-control" id="classSection" placeholder="Enter classSection" name="classSection" >
      
    </div>
   
     <div class="form-group">
      <label for="classTeacherName">Class Teacher Name:</label>
      <input type="text" class="form-control" id="classTeacherName" placeholder="Enter classTeacherName" name="classTeacherName" >
      
    </div>
    
   
 <div class="form-group">
      <label for="classNumOfStudents">Number Of Students:</label>
      <input type="number" class="form-control" id="classNumOfStudents" placeholder="Enter classNumOfStudents" name="classNumOfStudents" >
      
    </div>
   

    <button type="submit" class="btn btn-primary">Submit</button>
  </form>

</div>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
    integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo=" crossorigin="anonymous"></script>


<script>
$("form").validate({
	rules: {
		classSection: {
			required: true,
			minlength: 1,
			maxlength:1,
			lettersonly: true
		},
       
		classNumOfStudents: {
			required: true,
			number:true
		},
		
		classTeacherName: {
			required: true,
			lettersonly: true
			
		}
	}
})
	</script>
