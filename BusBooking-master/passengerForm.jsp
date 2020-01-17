<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Registration System</title>

</head>

<body style="background-color: pink">
	<h1>Bus Registration System</h1>
	<form:form action="submitPassenger.obj" method="post"
		modelAttribute="passenger">
		<table border="1">
			<tr>
				<td>Passenger Name</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>From</td>
				<td><form:input path="from" /></td>
			</tr>
			<tr>
				<td>To</td>
				<td><form:input path="to" /></td>
			</tr>

			<tr>
				<td>Mobile</td>
				<td><form:input path="mobile" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Book Ticket" /> <input
					type="reset" value="Cancel"></td>
				<td><a href="index.jsp">Go Home</a><br>
				<br></td>
			</tr>
		</table>
	</form:form>
</body>
</html>