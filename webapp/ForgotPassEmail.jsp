<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC JOBS - password recovery</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
  	.forml{
 		padding:20px;
 		width:40%
 	}
 	.wwFormTable{
 		width:100%
 	}
 	.tdLabel{
 		width:70px;
 	}
 	.form-control{	
 		margin-bottom: 20px
 	}
 	.label{
 		margin-bottom: 20px;
 	}
  </style>
</head>
<body>
	<%@ include file = "headnew.jsp" %><br><br>
	<div class="forml mx-auto">
	<p style="font-size: 24px;color: #065683;">Password recovery</p>
	<p>Please enter your log-in email and we will send an email to update your password</p>
	<s:form action="ForgotPassEmail">
	<div class="form-group">
		<s:textfield label="Email Id" name="email" class="form-control" required="true"/>
	</div>
		<s:submit value="Recover my password" cssClass="btn btn-primary btn-lg"/>
	</s:form>
	<div style="color: red;"><s:property value="msg" /></div>
	</div>
</body>
</html>