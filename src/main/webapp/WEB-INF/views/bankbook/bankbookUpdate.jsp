<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Bankbook Update</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>BankBook Update Page</h1>
	
	<div class="container-fluid">
		<form class="col-md-5 mx-auto" action="./bankbookUpdate" method="post">
			<input type="text" readonly="readonly" value="${dto.bookNumber}" name="bookNumber">
			<!-- ↑ type="hidden" 숨겨주는 역할, value = 값을 넣어주는 것, name = 파라미터 이름 그대로 적어주기 -->
			
			<div class="mb-3">
			  <label for="bookName" class="form-label">BookName</label>
			  <input type="text" class="form-control" value="${dto.bookName}" name="bookName" id="bookName" placeholder="주택청약, 자유입출금, ..">
			</div>
			<div class="mb-3">
			  <label for="bookRate" class="form-label">BookRate</label>
			  <input type="text" class="form-control" value="${dto.bookRate}" name="bookRate" id="bookRate" placeholder="0.00, ..">
			</div>
			
			<c:choose>
				<c:when test="${dto.bookUse eq 1}">
					<div class="form-check">
					  	<input class="form-check-input" type="radio" name="bookUse" value="1" id="flexRadioDefault1" checked = "checked">
					  	<label class="form-check-label" for="bookUse">
					    	Use
					 	 </label>
					</div>
					<div class="form-check">
					  <input class="form-check-input" type="radio" name="bookUse" value="0" id="flexRadioDefault2">
					  <label class="form-check-label" for="bookUse">
					    Not Use
					  </label>
					</div>
				</c:when>
				<c:otherwise>
					<div class="form-check">
					  	<input class="form-check-input" type="radio" name="bookUse" value="1" id="flexRadioDefault1">
					  	<label class="form-check-label" for="bookUse">
					    	Use
					 	 </label>
					</div>
					<div class="form-check">
					  <input class="form-check-input" type="radio" name="bookUse" value="0" id="flexRadioDefault2"  checked = "checked">
					  <label class="form-check-label" for="bookUse">
					    Not Use
					  </label>
					</div>
				</c:otherwise>
			</c:choose>
			
			
			<%-- <c:if test="${dto.bookUse eq 1}">
				<div class="form-check">
				  	<input class="form-check-input" type="radio" name="bookUse" value="1" id="flexRadioDefault1" checked = "checked">
				  	<label class="form-check-label" for="bookUse">
				    	Use
				 	 </label>
				</div>
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="bookUse" value="0" id="flexRadioDefault2">
				  <label class="form-check-label" for="bookUse">
				    Not Use
				  </label>
				</div>
			</c:if>
			
			<c:if test="${dto.bookUse eq 0}">
				<div class="form-check">
				  	<input class="form-check-input" type="radio" name="bookUse" value="1" id="flexRadioDefault1">
				  	<label class="form-check-label" for="bookUse">
				    	Use
				 	 </label>
				</div>
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="bookUse" value="0" id="flexRadioDefault2"  checked = "checked">
				  <label class="form-check-label" for="bookUse">
				    Not Use
				  </label>
				</div>
			</c:if> --%>
			
			<div class="mt-3">
				<button type="submit" class="btn btn-success">Update</button>
			</div>
			
		</form>
	</div>
</body>
</html>