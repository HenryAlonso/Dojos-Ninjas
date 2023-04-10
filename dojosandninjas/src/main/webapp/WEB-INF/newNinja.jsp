<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja Form</title>
<link rel="stylesheet" type ="text/css" href="/css/style.css">
</head>
<body>

	<div class="form">
		<form:form action="/ninjas/new/process" method="post" modelAttribute="ninja">
			<form:label path="dojo">Please select a Dojo location: </form:label>
				<form:select path="dojo">
					<c:forEach var="oneDojo" items="${dojos}">
						<option value="${oneDojo.id}">
							<c:out value="${oneDojo.name}"/>
						</option>
					</c:forEach>
				</form:select>
		<div>
			<form:label path="firstName">First Name: </form:label>
			<form:input type="text" path="firstName"/>
		</div>		
			<form:label path="lastName">Last Name: </form:label>
			<form:input type="text" path="lastName"/>
		<div>			
			<form:label path="age">Age: </form:label>
			<form:input path="age"/>			
		</div>			
					
			<input type="submit" value="Create Ninja">
		</form:form>
	</div>
		<a href="/"><button>Go Back</button></a>

</body>
</html>