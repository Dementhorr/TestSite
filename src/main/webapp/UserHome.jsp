<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link type="text/css" rel="stylesheet"
	href="bootstrap/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="/css/getcourse-theme.css">
</head>
<body>

	<nav class="navbar gc__navbar" role="navigation">
		<div class="container">
			<div class="navbar-header">
			<ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/LogOut">LogOut</a></li>
               </ul>
				
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li>${loginedUser.name}</li>
				</ul>
			</div>
		</div>
	</nav>
	<div id="gc__lcourse-form">
		<label>Hello ${loginedUser.name}</label><br>
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-lg-6 col-lg-offset-3">
					<h3>Select course:</h3>
					<form action="HomeService">
						<div class="form-group">
							<label><input type="radio" name="course" value="1">
								C# course</label>
						</div>

						<div class="form-group">
							<label><input type="radio" name="course" value="2">
								Java course</label>
						</div>

						<div class="form-group">
							<label><input type="radio" name="course" value="3">
								JS</label>
						</div>

						<div class="form-group">
							<label><input type="radio" name="course" value="4">
								C++</label>
						</div>

						<div class="form-group">
							<label><input type="radio" name="course" value="5">
								Swift</label>
						</div>
						
						<div class="form-group">
							<input type="submit" class="btn btn-success" value="submit">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	${UserCourse}
</body>
</html>