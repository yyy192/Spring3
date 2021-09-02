<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BankBook Select</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>Bankbook Select Page</h1>
	<br>
	<div class = "container">
		<table class="table table-striped table-hover">
			<tr>
				<td>BookNumber</td>
				<td>${dtov.bookNumber}</td>
			</tr>
			<tr>
				<td>BookName</td>
				<td>${dtov.bookName}</td>
			</tr>
			<tr>
				<td>BookRate</td>
				<td>${dtov.bookRate}</td>
			</tr>
			<tr>
				<td>BookUse</td>
				<td>${dtov.bookUse}</td>
			</tr>
		</table>
		
		<a href="./bankbookDelete?bookNumber=${dtov.bookNumber}">Delete</a>
	</div>
	
</body>
</html>