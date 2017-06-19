<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
   <link type="text/css" rel="stylesheet" href="/css/getcourse-theme.css">
</head>
<body>

<nav class="navbar gc__navbar" role="navigation">
        <div class="container">
      
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav navbar-right">
                <li><a href="http://localhost:8082/Test3/login.jsp">Login</a></li>
               </ul>
            </div>
        </div>
    </nav>
    <div id="gc__reg-form">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-lg-6 col-lg-offset-3">
                    <h3>Register</h3>
	<form action="DoRegistration">
	<div class="form-group">
                          <label for="usr">Name:</label>
                          <input type="text" name="fname" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="Age">Age:</label>
                          <input type="number" min="5" max="99" name="age" required value="${age}" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="usr">E-mail:</label>
                          <input type="email" name="email" value="${email}" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="usr">Login:</label>
                          <input type="text" name="log" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="pwd">Password:</label>
                          <input type="password" name="pwd" class="form-control">
                        </div>
                        
                        <div class="form-group">
                        <p>${errorString} </p>
                            <input type="submit" class="btn btn-success" value="submit">
                            or <a href="http://localhost:8082/Test3/login.jsp">Login</a>
                        </div>
                       
                    </form>
                </div>
            </div>
        </div>
    </div>
		<!--  <label>name<input type="text" name="fname" value="${name}" /><br />
		<br /></label> <label>age<input type="number" min="5" max="99" name="age" required value="${age}"/><br />
		<br /></label> <label>email<input type="email" name="email" value="${email}" /><br />
		<br /></label> <label>login<input type="text" name="log" id="login"/><br />
		
		<br /></label> <p id="error_login"></p> <label>password<input type="password" name="pwd" /><br />
		<br /></label> 
			<p>${errorString} </p>
		<br /> <input type="submit" value="submit" onclick="registr()"/><br>
		-->
	</form>

	<script type="text/javascript">
	function registr() {
	    var login, text;
	    login = document.getElementById("login").value;

	    
	    if (isNaN(login) || login.length < 4 || login.length > 30) {
	        text = "Input not valid";
	    } else {
	        text = "Input OK";
	    }
	    document.getElementById("error_login").innerHTML = text;
	    return false;
	}
	</script>
	

</body>
</html>