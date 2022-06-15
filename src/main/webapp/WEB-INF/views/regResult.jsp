<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Registered</title>
	</head>
	
	<body>
			User registered successfully. User details are:<br />
			<%= request.getAttribute("user")%>
	</body>
</html>