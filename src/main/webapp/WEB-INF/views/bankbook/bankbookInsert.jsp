<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Bankbook Insert</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>BankBook Insert Page</h1>
	
	<div class="container-fluid">
		<form class="col-md-5 mx-auto" action="./bankbookInsert" method="post">
			<div class="mb-3">
			  <label for="bookName" class="form-label">BookName</label>
			  <input type="text" class="form-control" name="bookName" id="bookName" placeholder="주택청약, 자유입출금, ..">
			</div>
			<div class="mb-3">
			  <label for="bookRate" class="form-label">BookRate</label>
			  <input type="text" class="form-control" name="bookRate" id="bookRate" placeholder="0.00, ..">
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="bookUse" value="1" id="flexRadioDefault1">
			  <label class="form-check-label" for="bookUse">
			    Use
			  </label>
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="bookUse" value="0" id="flexRadioDefault2" checked>
			  <label class="form-check-label" for="bookUse">
			    Not Use
			  </label>
			</div>
			<div class="mt-3">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
			
		</form>
	</div>
</body>
</html>