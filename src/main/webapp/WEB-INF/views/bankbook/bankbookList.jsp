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
	
	<div class = "container">
		<table class="table table-hover">
			<tr>
				<th>BookNumber</th>
				<th>BookName</th>
				<th>BookRate</th>
				<th>BookUse</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.bookNumber}</td>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookUse}</td>
			</tr>
			</c:forEach>
			
	
		</table>
		
		<!-- Paging -->
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item">
		      <a class="page-link" href="./bankbookList" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    
		    <li class="page-item">
		      <a class="page-link" href="./bankbookList?pn=${pager.startNum-1}" aria-label="Previous">
		        <span aria-hidden="true">&lt;</span>
		      </a>
		    </li>
		    
		    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
				<li class="page-item">
					<a class="page-link" href="./bankbookList?pn=${n}">
						${n}
					</a>
				</li>
			</c:forEach>
			
			<li class="page-item">
		      <a class="page-link" href="./bankbookList?pn=${pager.lastNum+1}" aria-label="Next">
		        <span aria-hidden="true">&gt;</span>
		      </a>
		    </li>
		    
		    <li class="page-item">
		      <a class="page-link" href="./bankbookList?pn=${pager.totalPage}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		</nav>
			
		<a href="./bankbookInsert" class="btn btn-secondary">ADD</a>
	</div>

</body>
</html>