<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
<style type="text/css">
	.navbar{
		padding-left: 110px;
		padding-right: 110px;
		border-bottom: 1px solid #D6D8DA;
		box-shadow: 2px 2px 4px rgba(0,0,0,0.5);
	}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm" style="">
		<div class="navbar-brand">
			<a href ="Home" style="text-decoration: none;color:#5ab9ea;font-size: 130%" class="font-weight-bold"><img src="images/com.png" height="10%" width="10%">ABC JOBS</a>
		</div>
		<form class="form-inline" action="Search" style="width:450px">
    		<input class="form-control mr-sm-2" name="request" type="text" placeholder="Search" style="width:315px" required>
    		<input type ="submit" value="Search" class="btn btn-primary" style="padding:5px">
  		</form>
	  	<ul class="navbar-nav ml-auto">
	    	<li class="nav-item">
	      		<a href="Profile"><button type="button" class="btn btn-secondary mr-4"><i class="fas fa-address-card"></i> Profile</button></a>
	    	</li>
	    	<li class="nav-item">
	      		<a href="logout"><button type="button" class="btn btn-secondary "><i class="fas fa-ban"></i> Log out</button></a>
	    	</li>
	  	</ul>
	</nav>
</body>
</html>