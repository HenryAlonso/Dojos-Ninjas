<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This Dojo's Ninja's</title>
<link rel="stylesheet" type ="text/css" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
	<table class="table table-dark table-striped">
		  		<thead>
			    	<tr class="table table-dark">
				      	<th scope="col">First Name</th>
				      	<th scope="col">Last Name</th>
				      	<th scope="col">Age</th>
			    	</tr>
			  	</thead>
			  	<tbody>
			  		<c:forEach var="oneNinja" items="${dojo.ninjas}">
				    	<tr>
				    		<td>
				    			<c:out value="${oneNinja.firstName}"></c:out>
				    		</td>
				    		<td>
				    			<c:out value="${oneNinja.lastName}"></c:out>
				    		</td>
				    		<td>
								<c:out value="${oneNinja.age}"></c:out>		
				    		</td>
				    	</tr>
			  		</c:forEach>
				</tbody>
			</table>
			<a href="/"><button>Go Back</button></a>
			<a href="/ninjas/new"><button class="button">Create a new Ninja!</button></a>
			
</body>
</html>