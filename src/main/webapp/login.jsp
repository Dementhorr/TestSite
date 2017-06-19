<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
   <link type="text/css" rel="stylesheet" href="/css/getcourse-theme.css">
</head>
<body>
<nav class="navbar gc__navbar" role="navigation">
        <div class="container">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav navbar-right">
                <li><a href="http://localhost:8082/Test3/registration.jsp">Registration</a></li>
               </ul>
            </div>
        </div>
    </nav>
	<br>
	<div class="container">
		<div class="form-group">
			<div class="col-md-8 col-md-offset-2">
				<form action="Login" >
				<div class="form-group">
                          <label for="usr">Login:</label>
                          <input type="text" name="log" value="${user}" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="pwd">Password:</label>
                          <input type="password" name="pw" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-success" value="submit">
                            or <a href="http://localhost:8082/Test3/registration.jsp">Registration</a>
                        </div>
					<p>${errorString}</p>
				</form>
			</div>
		</div>
	</div>
	  <script src="/src/main/webapp/bootstrap/js/jquery.min.js"></script>
    <script src="/src/main/webapp/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>