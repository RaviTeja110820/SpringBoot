<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//String Name = (String) request.getAttribute("Name");
//String Company = (String) request.getAttribute("Company");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Employee Details</title>
</head>
<body bgcolor="orange">
	<table border="1">
		<tbody>
			<tr>
				<th>Name</th>
				<th>Company</th>
			</tr>
			<tr>
				<td><%= request.getAttribute("Name") %></td>
				<td><%= request.getAttribute("Company") %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
