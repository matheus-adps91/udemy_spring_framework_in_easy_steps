<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.neptum.spring.springmvc.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> emps = (List<Employee>) request.getAttribute("employees");
		for(Employee emp : emps){
			out.println(emp);
		}
	%>

</body>
</html>