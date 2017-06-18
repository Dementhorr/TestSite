<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="HomeService">
<label>Hello ${loginedUser.name}</label><br>
<label>Choose a course</label><br>
<label>C# course <input type="radio" name="course" value="1" > </label><br>
<label>Java course <input type="radio"name="course" value="2"  ></label>
<input type="submit" value="submit">
</form>
</body>
</html>