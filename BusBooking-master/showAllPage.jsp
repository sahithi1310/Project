<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Athlete Registration System</title>
</head>
<body style="background-color: pink">
<c:choose>
<c:when test="${elist.size()>0 }">
  
<h2><center>Bus Registration System</center></h2>
<table border="2" align="center" bgcolor="cyan">
<tr>
		
		
		<td><b>name</b></td>
		<td><b>FROM</b></td>
		
		<td><b>TO</b></td>
		<td><b>DATE</b></td>
		
	</tr>
<c:forEach var="elist" items="${elist}">
<tr>
	<tr>
	
	<td>${elist.name}</td>
	<td>${elist.gender}</td>
	<td>${elist.bus}</td>
	
	<td>${elist.mobile}</td>
	
</tr>
</c:forEach>
</table>
<br>
</c:when>
<c:otherwise>
  <h3><center>No Data Found</center></h3>
</c:otherwise>
</c:choose>
<center><a href ="goHome.obj">Go Home</a></center><br><br>
</body>
</html>