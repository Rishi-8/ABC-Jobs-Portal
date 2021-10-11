<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
  	.search{
  		padding:5px 20px;
  		margin-top: 10px;
  		margin-bottom: 10px;
  	}
  	.searchmain{
  		width:70%;
  	}
  	.jumbotron{
  		padding:20px;
  	}
  </style>
</head>
<body>
	<div class="searchmain mx-auto">
   <form class="form-inline mx-auto" action="Search" style="width:1000px">
    		<input class="form-control mr-sm-2 search" name="request" type="text" placeholder="Search" style="width:900px" required>
    		<input type ="submit" value="Search" class="btn btn-primary" style="padding:5px">
  		</form>
	<s:if test="noData==true">
		<s:iterator value="beanList">
		<a href="searchuser.action?id=<s:property value="id"/>">
			<div class="jumbotron">
			<div class="row">
			<div class="col-md-2">
			<img src="images/profileimg.jpg" width="100%">
			</div>
			<div class="col-md-10">
				<p style="font-size:30px;"><s:property value="firstname"/> <s:property value="lastname"/></p>
					<s:property value="country"/>, <s:property value="city"/><br>
				Works at <s:property value="company"/>
			</div>
			</div>
			</div>
			</a>
		</s:iterator>
	</s:if>
	<s:else>
		<div style="color: red;">No Data Found.</div>
	</s:else>
	</div>
</body>
</html>