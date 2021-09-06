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
	
	<div class = "container-fluid">
		<div class="col-md-7 my-2 mx-auto">
		
			<!-- Search Form Start -->
			
			<form action="./bankbookList" method="get">
		
			 <div class="input-group mb-3">
			 
			 <select name="kind" class="form-select" aria-label="Default select example">
				 <option value="num">Num</option>
				 <option value="name">Name</option>
				 <option value="rate">Rate</option>
			 </select>
			  
			 <input type="text" name="search" class="form-control" aria-label="Text input with dropdown button">
			 <button type="submit" class="btn btn-outline-secondary">Search</button>
			</div>
				
			</form>
			
			<!-- Search Form Finish -->
		
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
			      <a class="page-link" href="./bankbookList?kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    
			    <li class="page-item">
			      <a class="page-link" href="./bankbookList?pn=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
			        <span aria-hidden="true">&lt;</span>
			      </a>
			    </li>
			    
			    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
					<li class="page-item">
						<a class="page-link" href="./bankbookList?pn=${n}&kind=${pager.kind}&search=${pager.search}">
							${n}
						</a>
					</li>
				</c:forEach>
				
				<li class="page-item">
			      <a class="page-link" href="./bankbookList?pn=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
			        <span aria-hidden="true">&gt;</span>
			      </a>
			    </li>
			    
			    <li class="page-item">
			      <a class="page-link" href="./bankbookList?pn=${pager.totalPage}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			  </ul>
			</nav>
				
			<a href="./bankbookInsert" class="btn btn-secondary">ADD</a>
		</div>
	</div>

</body>
</html>