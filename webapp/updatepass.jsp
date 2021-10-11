<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC JOBS - Update password</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
  	.forml{
 		padding:20px;
 		width:40%;
 	}
 	.wwFormTable{
 		width: 100%;
 	}
 	.tdLabel{
 		width: 140px;
 	}
 	.input{
 		width:100%;
 		margin-bottom: 20px;
 	}
 	.label{
 	 	margin-bottom: 20px; 
 	}
  </style>
</head>
<body>
<div style="text-align:center">
<img src="images/com.png" height="8%" width="8%">
</div><br><br><br><br>
<div class="forml mx-auto">
<p style="font-size: 24px;color: #065683;">Update your password</p>
	<s:form action="change">
		<s:textfield name="email" label="Email Id" class="input" required="true"></s:textfield>
		<s:password name="password" label="New Password" class="input" required="true"/>
		<s:password label="Confirm Password" class="input" required="true"/>
		<s:submit value="Reset my password" class="btn btn-primary btn-lg"/>
	</s:form>
</div>
</body>
</html>