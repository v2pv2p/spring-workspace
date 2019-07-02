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
	<h1>특정부서에 소속된사원</h1>
	
	<ul>
		<c:forEach var="emp" items="${emps }">
			<li>부서번호 : ${emp.departmentId}</li>
			<li>사원번호 : ${emp.employeeId}</li>
			<li>사원이름 : <a href="employee.do?id=${emp.employeeId}">${emp.firstName} ${emp.lastName}</a></li>
		</c:forEach>
	</ul>
</body>
</html>