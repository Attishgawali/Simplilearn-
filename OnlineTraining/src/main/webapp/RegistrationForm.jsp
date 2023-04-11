<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to simplilearn</h1>
	<form action="<%= request.getContextPath() %>/training" method= "POST">
	
		First Name : <input type="text" name="firstname"/><br></br>
		last Name : <input type="text" name="lastname"/><br></br>
		Email Id : <input type="email" name="emailid"/><br></br>
		Password : <input type="password" name="password"/><br></br>
		Number 1 : <input type="text" name="num1"/><br></br>
		Number 2 : <input type="text" name="num2"/><br></br>
	f
		
		<input type="submit" value = "Become our Student"/>
		
		
	</form>
</body>
</html>