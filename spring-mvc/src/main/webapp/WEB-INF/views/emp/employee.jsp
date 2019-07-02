<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보</h1>
	
	<ul>
		<li> : ${employee.employeeId}</li>
		<li> : ${employee.firstName} ${employee.lastName}</li>
		<li> : ${employee.email}</li>
		<li> : ${employee.phoneNumber}</li>
		<li> : ${employee.hireDate}</li>
		<li> : ${employee.jobId}</li>
		<li> : ${employee.salary}</li>
		<li> : ${employee.managerId}</li>
		<li> : ${employee.departmentId}</li>
	</ul>
</body>
</html>