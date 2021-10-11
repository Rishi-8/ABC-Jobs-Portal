<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<title>Insert title here</title>
  
  <style>
  	.but:hover{
  		border: #EBEBEB 1px solid;
  		color:black;
  		background-color: white;
  		box-shadow:1px 2px 5px rgba(0,0,0,0.50);
  	}
  	.but{
  		background-color: white;
  		border: #EBEBEB 1px solid;
  		box-shadow:0 1px 2px rgba(0,0,0,0.18);
  		color:black;
  		border-radius: 22px;
  		font-weight:600;
  		padding :8px 20px;
  	}
  	.btn-light{
  		background-color: white;
  		border-radius: 22px;
  		font-weight:600;
  		padding :8px 20px;
  		border: none;
  	}
  	.btn:focus, .btn:active {
    	outline: none !important;
    	box-shadow: none !important;
    }
  </style>
</head>
<body>
	<nav class="navbar navbar-expand-sm ">
		<div class="navbar-brand text-center">
			<a href ="index.html" style="text-decoration: none;color:#5ab9ea;font-size: 130%" class="font-weight-bold"><img src="images/com.png" height="10%" width="10%">ABC JOBS</a>
		</div>
	  	<ul class="navbar-nav ml-auto col-md-4">
	    	<li class="nav-item">
	      		<a href="login.jsp"><button type="button" class="btn btn-light mr-1">Log in</button></a>
	    	</li>
	    	<li class="nav-item">
	      		<a href="adminlogin.jsp"><button type="button" class="btn btn-light ">Admin Log in</button></a>
	    	</li>
	    	<li class="nav-item ml-3">
	     		<a href="register.jsp"><button type="button" class="btn but ">Register</button></a>
	    	</li>
	  	</ul>
	</nav>
</body>
</html>