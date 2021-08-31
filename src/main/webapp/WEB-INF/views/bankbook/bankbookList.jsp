<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

	<title>BankBook List</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>BankBook List Page Renewal</h1>
	
	<div class="container-fluid">
		<div class="col-md-8  mx-auto my-0">
			<table class="table table-striped table-hover">
				<tr>
					<th>Number</th><th>Name</th><th>Rate</th><th>Use</th>
				</tr>
				<c:forEach items="${list}" var="dto">
				<tr>
						<td>${dto.bookNumber}</td>
						<td>${dto.bookName}</td>
						<td>${dto.bookRate}</td>
						<td>${dto.bookUse}</td>
				</tr>	
				</c:forEach>
		
			</table>
		</div>
	</div>

	

</body>
</html>