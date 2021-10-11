<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Register here</title>
<style type="text/css">
  	.logbut{
  		background-color: #2977c9;
  		color: white;
  		padding : 10px 20px;
  		font-size: 120%;
  		border-radius: 10px;
  	}
  	.logbut:hover {
		color:white;
		padding : 12px 22px;
    }
  </style>
</head>
<body>
<%@ include file = "headnew.jsp" %><br><br><br><br>
<div class="container">
<s:if test="ctr>0">
		<h1><s:property value="msg"/> <s:property value="firstname"/> <s:property value="lastname"/> for registering with us</h1>
		<h2>To open your account please,</h2><br>
		<a href="login.jsp" class="logbut" style="text-decoration: none">Login</a>
	</s:if>
	<s:else>
		<h1><s:property value="msg"/></h1>
		<h2>Please try again</h2><br>
		<a href="register.jsp" class="logbut" style="text-decoration: none">Register</a>
	</s:else>
</div>
</body>
</html>