<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="passwordupdated" method="post">

Enter UserEmail: <input type="text" value="<%=request.getAttribute("usermail")%>" readonly="readonly" name="usermail"/>
<br>
Enter new passWord: <input type="password" name="userpassword"/>
<br>

<input type="submit" value="reset Password"/>
</form>
</body>
</html>