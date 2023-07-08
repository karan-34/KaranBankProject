<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	>
</head>
<body style="background: #e2e2e2;">

<div class="container mt-4 ">
<div class="row">
<div class="col-sm-6 offset-md-3">
<div class="card">
<div class="card-body">
<h3 class="text-center"> Login</h3>
<% if(request.getAttribute("message")!=null){ %>
<p style="color: green"> <%=request.getAttribute("message") %></p>
<%} %>

<%-- <img style="height: 30px;width: 30px" alt="" src='<c:url value="/resources/img/IMG_20210910_160331.jpg" />'> --%>

<form action="userlogin" method="post">


	<div class="form-group">
			<label >Enter Your Email</label> <input
				type="email" class="form-control" name="email"
				placeholder="Enter your email" required="required">
		</div>
		<div class="form-group">
			<label >Enter Your Password</label> <input
				type="text" class="form-control" name="password"
				placeholder="Enter your password" required="required" minlength="8">
		</div>
		
		
		<!-- <div class="form-group">
			<label >Type of User</label> <select  class="form-control"
				name="type" required="required">
				<option>Receiver</option>
				<option>Donor</option> type user k liye hai yeh
			</select>
		</div> -->
		
		
		<div class="text-center form-group">
			<input type="submit" value="submit"/>
		</div>
		
		<div class="text-right form-group">
			<a href="forgotpasswordrequest">forgot password?</a>
		</div>

</form>
</div>
</div>
</div>
</div>
</div>
</body>




<%-- <%if(request.getAttribute("message1")!=null) {%>

<p style="color: red;"><%=request.getAttribute("message1")  %></p> 
<%} %>


<div align="center">

<form action="userlogin" method="post">

Enter Email: <input type="email" placeholder="enter email" name="email">
<br>
Enter password :<input type="password" placeholder="enter password" name="password">
<br>
<input type="submit" value="Log in">

</form>

<a href="forgotpassword">forgotpassword???</a>
</div> --%>

</html>