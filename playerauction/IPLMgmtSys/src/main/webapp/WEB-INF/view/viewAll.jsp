<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="options.jsp"></jsp:include>
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
			function getPlayersByTeam(selectedteam) {
				
			
				window.location.href = '/getPlayersByTeamId?teamid='+ selectedteam;
			}
		</script>
<body>
<div align="center" class="container">

<div class="form-group">
			<label >Select Team</label>
		 
		 <select name="teamId" id="teamId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" onchange ="getPlayersByTeam(this.value)">
		 <option value="" >select the Team
			<c:forEach var="team" items="${teams}">
				
				<option value="${team.teamId}">${team.teamName}

				</option>
			</c:forEach>
		</select><br><br>
		</div>


<table class="table table-dark table-striped">

<tr>
<th>player Id</th><th>player Name</th><th>player Base price</th><th>update</th>
</tr>
<c:forEach var="pro" items="${playerList}">
<tr>
<td>${pro.playerId}</td>
<td>${pro.playerName}</td>
<td>${pro.playerBasePrice} </td>
<td><a href="/updateTheplayerPrice/${pro.playerId}"><button>update</button></a></td>
</tr>
    </c:forEach> 
  </table>
</div>
<h1><a href="exportInFile"><button>Serialize</button></a></h1>
  </body>
  
</html>
