<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="options.jsp"></jsp:include>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <script>
			function getgrounds(selectedground) {
				
			
				window.location.href = '/getallground?loactionid='+ selectedground;
			}
		</script>
		 -->
		 <script type="text/javascript">
	   
         $(document).ready(function(){
        	 $('#locationId').change(function(){
debugger;
var locationId=$(this).val();
$.ajax({
 type:'GET',
 url:window.location.origin+'/rest/loadground/'+locationId,
 success:function(result){

   var s='';
   s+='<Option>Select The Item</Option>';
   for(var i=0;i<result.length;i++){
     s+='<option value="'+result[i].groundId+'">'+result[i].groundName+'</option>'
   }
   $('#groundId').html(s);
 }
});
   });
         });
         
       
		 </script>

</head>
<body>
<form action="setTeamForTheGround">
<div class="form-group">
			<label >Select Location</label>
		 
	<select name="groundLocation" id="locationId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
	>
	<!--  onchange ="getgrounds(this.value)"> -->
	  <option value="" >select the locations
			<c:forEach var="loc" items="${locations}" >
				<option value="${loc.locationId}">${loc.locationName}
				</option>
			</c:forEach>
		</select><br><br>
		</div>
		
		<div class="form-group">
			<label >Select Ground</label>
		 
		 <%-- <select name="groundId" id="groundId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" >
		 <option value="" >select the ground for team
			<c:forEach var="gro" items="${grounds}">
				
				<option value="${gro.groundId}">${gro.groundName}

				</option>
			</c:forEach>
		</select><br><br> --%>
		<select name="groundId" id="groundId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" >
		<option value="" >select the ground for team
		</select><br><br>
		
		</div>
		
	
	
<div class="form-group">
			<label >Select Team</label>
		 
		 <select name="teamId" id="teamId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" >
		 <option value="" >select the Team
			<c:forEach var="team" items="${teams}">
				
				<option value="${team.teamId}">${team.teamName}

				</option>
			</c:forEach>
		</select><br><br>
		</div>
		<input type="submit">
	</form>	

</body>
</html>