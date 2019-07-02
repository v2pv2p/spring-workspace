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
	<h1>부서 리스트</h1>
	
	<ul>
		<c:forEach var="dept" items="${depts }">
			<li><a href="employees.do?id=${dept.departmentId }">${dept.departmentName }</a></li>
		</c:forEach>
	</ul>
	<a href="form.do">등록</a>
</body>
</html>