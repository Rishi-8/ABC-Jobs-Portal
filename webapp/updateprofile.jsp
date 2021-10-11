<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Jobs - Update profile</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
  	.forml{
 		padding:60px;
 		border: 1px solid black;
 		width: 60%
 	}
 	label{
 		font-size: 20px;
 	}
 	.finput{
 		width:100%;
 		padding:5px;
 	}
  </style>
</head>
<body>
	<%@ include file = "header.jsp" %><br><br>
	<div class="container">
	<div class="forml mx-auto">
    <h3 style="margin-bottom: 20px;color: #065683">Update Your Profile</h3><hr>
    <s:iterator value="beanList">
     <form action="Update" method="post">
     	<label>Firstname:</label><br>
     	<input type="text" class="finput" name="firstname" value="<s:property value='firstname'/>"/><br>
     	<label>Lastname:</label>
     	<input type="text" class="finput" name="lastname" value="<s:property value='lastname'/>"/><br>
     	<label>Country :</label>
     	<input type="text" class="finput" name="country" value="<s:property value='country'/>"/><br>
     	<label>City :</label>
     	<input type="text" class="finput" name="city" value="<s:property value='city'/>"/><br>
     	<label>Company :</label>
     	<input type="text" class="finput" name="company" value="<s:property value='company'/>"/><br><br>
     	<input type="submit" class="btn btn-lg btn-primary" value="update">
     </form>
     </s:iterator>
     </div>
     </div>
    <br><br><br><br>
</body>
</html>