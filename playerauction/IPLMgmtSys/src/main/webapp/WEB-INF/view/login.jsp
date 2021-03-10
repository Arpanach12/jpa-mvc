<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">


<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
   
  <script>
$(document).ready(function()
{
	debugger;
$('#button').click(function()
{
	if($('#userEmail').val()==0)
	{
	alert("email field is empty")
	return false;
	}
var email_pattern=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(!($('#userEmail').val().match(email_pattern)))
{
  alert("invalid email");
   return false;
}
	
 var pass_regex=/^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%*&~])[A-Za-z0-9!@~#$%^*]{7,15}$/;
var conpass=$('#userpassword').val();
var validPass=pass_regex.test(conpass);

if(!validPass)
{
  alert("Password is not valid");
  return false;
 
}
	 

/* var pass_regex=/^[ A-Za-z0-9_@./#&+-]*$/;
 if($('#userpassword').val().match(pass_regex))
{
	 
    if($('#userpassword').val().length<8 && $('#userpassword').val().length>15)
    {
        alert("password length is not appropriate")
        return false;
    }
}
 else
 {
     alert("invalid string");
     return false;
 } */


 return true;
});
});

</script>
  
  
  
  
<title>Insert title here</title>

 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
</head>
<body>
<h1 align="center" >Welcome to Home Page</h1>
<div class="container">
 
  <form action="GotoOption">
    <div class="form-group">
      <label for="userEmail">Email:</label>
      <input type="text" class="form-control" id="userEmail" placeholder="Enter Email" name="userEmail" required="required">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="userpassword" placeholder="Enter password" name="userpassword" required="required">
    </div>
    
 
    <button type="submit" class="btn btn-primary" id="button" value="return validate()">Submit</button>
  </form>
</div>
</body>
</html>






