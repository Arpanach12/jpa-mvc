<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>

<body>

	<h1>Registration Form</h1>
	<div class="container">
		<form action="addAuser" id="options" method="post" onsubmit="return validate()">
			<div class="form-group">
				<label for="userName" class="control-label col-sm-2">User Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="userName" placeholder="Enter Name" name="userName"
						required="required">
				</div>

			</div>
			<div class="form-group">
				<label for="MobileNum" class="control-label col-sm-2"> User Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="userpassword" placeholder="Enter Password"
					 name="userpassword"
						required="required">
				</div>

			</div>

<div class="form-group">
				<label for="conuserpassword" class="control-label col-sm-2">Confirm Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="conuserpassword" placeholder="Enter Password"
					 name="conuserpassword"
						required="required">
				</div>

			</div>
			
			<div class="form-group">
				<label for="userPhone" class="control-label col-sm-2">User Phone:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="userPhone" placeholder="Enter Phone Number" name="userPhone"
						required="required">
				</div>
			</div>
			
			<div class="form-group">
				<label for="userEmail" class="control-label col-sm-2">User Email:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="userEmail" placeholder="Enter Email" name="userEmail"
						required="required">
				</div>
			</div>
			
			<div class="form-group">
				<label for="userRegistration" class="control-label col-sm-2"> User Registration Date :</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="userRegistration" placeholder="Enter userCheckIn"
						name="userRegistration" required="required">
				</div>
			</div>
	<div>
		<input type="checkbox" name="terms" id="terms" >Agreed Terms & Conditions
	</div>

		<div >
			<input type="submit"  value="register">
		</div>


	
	</form>
	</div>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
		integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo=" crossorigin="anonymous"></script>

	<script>
		$.validator.addMethod("datavalida", function (value, element) {
			var curDate = new Date();
			var inputDate = new Date($('#userRegistration').val());
			if (inputDate > curDate) {
				return true;
			} else {
				return false;
			}
		}, "Enter present and future date only...!");
		
		
		$.validator.addMethod("passval", function (value, element) {
			
			 var pass_regex=/^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%*&~])[A-Za-z0-9!@~#$%^*]{7,15}$/;
			    var conpass=$('#userpassword').val();
			    var validPass=pass_regex.test(conpass);
			    
			    if(!validPass)
			    {
			      alert("Password is not valid");
			      return false;
			     
			    }
			return true;
		}, "Enter the valid password ");
		
		
		$.validator.addMethod("emailval", function (value, element) {
			
			var email_pattern=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!($('#userEmail').val().match(email_pattern)))
			{
			   return false;
			}
			return true;
		}, "Enter the valid email ");
		
		
$.validator.addMethod("confirmpassval", function (value, element) {		
	 var conpass=$('#userpassword').val();
	 var confpass=$('#conuserpassword').val();
	 if(confpass!=conpass)
     {
    return false;
     }
	 return true;
	 
		}, "password and confirm password is not matched");


		$("form").validate({
			rules: {
				userName: {
					required: true,
					minlength: 10,
					lettersonly: true
				},
				userPhone: {
					required: true,
					number: true,
					maxlength: 10,
					minlength:10

				},
				userEmail:{
					required: true,
					emailval:true
				},
				terms: {
					required: true
				},
				userRegistration: {
					required: true,
					datavalida: true

				},
				userpassword:{
					required:true,
					passval:true
				},
				conuserpassword:{
					required:true,
					confirmpassval:true
				}

			}
		})
	</script>




</body>

</html>