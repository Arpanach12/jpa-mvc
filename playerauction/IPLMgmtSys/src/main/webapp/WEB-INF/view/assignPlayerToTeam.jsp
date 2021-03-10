<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="options.jsp"></jsp:include>
<form action="setAPlayers">
<div class="form-group">
			<label >Select Team</label>
		 
		 <select name="teamId" id="teamId" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" 
		 size="1" onchange ="getpackage(this.value)">
		 <option value="" >select the Team
			<c:forEach var="team" items="${teams}">
				
				<option value="${team.teamId}">${team.teamName}

				</option>
			</c:forEach>
		</select><br><br>
		</div>
	<div>
	Select Player <select name="playerId" id="playerId"  class="btn btn-primary dropdown-toggle" 
	
	data-toggle="dropdown" multiple="multiple">
			<c:forEach var="pack" items="${playerlist}">
			
				<option value="${pack.playerId}">${pack.playerName}

				</option>
			
			</c:forEach>
		</select><br><br>

		</div>
		<input type="submit">
			</form>	
			<a href="options"><button>Back</button></a>
</body>
</html>