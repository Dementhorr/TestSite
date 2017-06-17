<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Login">
		<label>login<input type="text" name="log" value="${user}"></label>
		<label>password<input type="password" name="pw" />
		</label> <input type="submit" value="submit">
	</form>
	<p>${errorString}</p>
</body>
</html>