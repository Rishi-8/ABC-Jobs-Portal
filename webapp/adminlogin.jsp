<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
  <style>
  .forml{
 		padding:60px;
 		border: 1px solid #E8E8E8;
 		box-shadow: 0 2px 5px rgba(0, 0, 0, 0.16);
 		width: 40%
 	}
 	.label{
 		margin-bottom: 20px;
 		width:100%;
 	}
 	.form-control{
 		margin-bottom: 20px;
 	}
 	.tdLabel{
 		width: 50px;
 	}
 	.wwFormTable{
 		width: 100%
 	}
 </style>
</head>
<body>
<%@ include file = "headnew.jsp" %><br><br><br><br>
<div class="forml mx-auto">
	<h2>Admin's login</h2>
		<h3 style="margin-bottom: 20px;color: #065683">Login to ABC JOBS</h3><hr>
		<p style="font-size: 20px;">If you are not an Admin <a href="login.jsp">Login here.</a></p>
		 <s:form action="adminlogin">
			<s:textfield name="email" type="email" label="Email Id" placeholder="Email" cssClass="form-control" required="true"/>
			<s:password name="password" label="Password" placeholder="Password" cssClass="form-control" required="true"/>
			<s:submit value="Login" cssClass="btn btn-primary btn-lg"></s:submit>
			<span style="color:red"><s:property value="message"/></span>
		 </s:form>
	</div>
	
</body>
</html>