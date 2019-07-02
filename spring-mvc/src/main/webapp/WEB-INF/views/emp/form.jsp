<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직종 등록폼</h1>
	<form method="post" action="add.do">
		<p> : <input type="text" name="employeeId"></p>
		<p> : <input type="text" name="firstName"></p><input type="text" name="lastName"></p>
		<p> : <input type="text" name="email"></p>
		<p> : <input type="text" name="phoneNumber"></p>
		<p> : <input type="date" name="hireDate"></p>
		<p> : <input type="text" name="jobId"></p>
		<p> : <input type="text" name="salary"></p>
		<p> : <input type="text" name="managerId"></p>
		<p> : <input type="text" name="departmentId"></p>
		<button type="submit">등록</button>
	</form>
</body>
</html>