<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="css/login.css" />
</head>
<body>
	<a href="http://localhost:8082/Test3/registration.jsp">Registration</a>
	<br>
	<div class="container">
		<div class="form-group">
			<div class="col-md-8 col-md-offset-2">
				<form action="Login" >
					<div class="row"><label>login<input type="text" name="log" value="${user}"></label></div>
					<div class="row"><label>password<input type="password" name="pw" ></label></div>
					<label> <input type="submit"class="btn btn-default" value="submit"></label>
				</form>
			</div>
		</div>
	</div>
	<p>${errorString}</p>
</body>
</html>