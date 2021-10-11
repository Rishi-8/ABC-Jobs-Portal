<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
    .profile{
    	border: 1px solid black;
    	padding :80px;
    }
</style>
</head>
<body>
<%@ include file = "header.jsp" %><br><br>
<div class="container">
	<div class="profile">
		<div class="row">
		<div class="col-md-3">
		<img src="images/profileimg.jpg" width="80%">
		</div>
		<div class="col-md-9" >
		<p style="font-size:200%"><s:property value="firstname"/>  
		<s:property value="lastname"/></p>
		<p>Lives in <s:property value="country"/>, <s:property value="city"/></p>
		<p>Gender: <s:property value="gender"/></p>
		</div>
		</div>
		<hr>
		<p style="font-size:200%">Works for <s:property value="company"/></p>
		<p style="font-size:200%">Email: <s:property value="email"/></p>
	</div>	
	<br><br><br><br><br>
</div>	
</body>
</html>