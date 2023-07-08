<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<h1> welcome to home page in jsp</h1>


<body>
  <%if(request.getAttribute("message2")!=null) {%>

<h2 style="color: green;"><%=request.getAttribute("message2") %></h2>

<%} %>

</body>
</html>