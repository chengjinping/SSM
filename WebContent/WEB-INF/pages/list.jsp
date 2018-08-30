<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">员工信息列表</h1>
<table align="center" width="60%" border="1px" cellspacing="0px">
<tr>
	<th>id</th>
	<th>lastName</th>
	<th>email</th>
	<th>gender</th>
	<th>deptNmae</th>
	<th>operation</th>
</tr>
<c:forEach items="${requestScope.allEmps}" var="emp">
<tr align="center">
	<td >${emp.id}</td>
	<td >${emp.lastName}</td>
	<td >${emp.email}</td>
	<td >${emp.gender}</td>
	<%-- <td >${emp.dept.departmentName}</td> --%>
	<td >
		<a href="#">DELETE</a>
		<a href="#">UPDATE</a>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>