<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/LogOut">logout</a>
<form action="HomeService">
<label>Hello ${loginedUser.name}</label><br>
<label>Choose a course</label><br>
<label><input type="radio" name="course" value="1" >C# course</label><br>
<label> <input type="radio"name="course" value="2"  >Java course</label><br>
<label> <input type="radio"name="course" value="3"  >JS</label><br>
<label> <input type="radio"name="course" value="4"  >C++</label><br>
<label> <input type="radio"name="course" value="5"  >Swift</label><br>
<input type="submit" value="submit">

</form>
${UserCourse}
</body>
</html>