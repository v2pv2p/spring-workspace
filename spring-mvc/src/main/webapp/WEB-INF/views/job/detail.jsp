<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직종 상세정보</h1>
	
	<p>직종 아이디 : ${job.id }</p>
	<p>직       종 : ${job.title }</p>
	<p>최 고 급 여 : ${job.maxSalary }</p>
	<p>최 저 급 여 : ${job.minSalary }</p>
</body>
</html>