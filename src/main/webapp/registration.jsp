<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="DoRegistration">
		<label>name<input type="text" name="fname" /><br />
		<br /></label> <label>age<input type="number" min="10" max="99" name="age" /><br />
		<br /></label> <label>email<input type="text" name="email" /><br />
		<br /></label> <label>login<input type="text" name="log" /><br />
		<br /></label> <label>password<input type="password" name="pwd" /><br />
		<br /></label> <br />
		<br /> <input type="submit" value="submit" />
	</form>

</body>
</html>