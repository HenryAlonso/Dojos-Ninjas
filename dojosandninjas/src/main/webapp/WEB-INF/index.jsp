<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Dojo's</title>
<link rel="stylesheet" type ="text/css" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="index">
		<div class="form">
			<h1>New Dojo</h1>
			
			<form:form action="/dojos/new/process" method="post" modelAttribute="dojo">
				<form:label path="name">Name: </form:label>
				<form:input type="text" path="name"/>
				
				<input type="submit" value="Create"/>
			</form:form>
		<a href="/ninjas/new"><button class="button">Create a new Ninja!</button></a>
		</div>
			
			
		<div class="dojos">
			<h2>All current Dojo locations are below: </h2>
			<c:forEach var="oneDojo" items="${dojos}">
				<ul class="list-group">
				    <a href="/dojos/${oneDojo.id}">
				    	<li class="list-group-item"><c:out value="${oneDojo.name}"/></li>
				    </a>
				</ul>
						</c:forEach>
		</div>
	</div>

</body>
</html>