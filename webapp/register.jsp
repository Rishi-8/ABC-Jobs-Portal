<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "/struts-tags" prefix ="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Jobs - Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
.forml{
 		padding:60px;
 		border: 1px solid #E8E8E8;
 		box-shadow: 0 2px 5px rgba(0, 0, 0, 0.16);
 		width: 60%
 	}
 	.label{
 		margin-bottom: 20px;
 		width:100%;
 	}
 	.form-control{
 		margin-bottom: 20px;
 	}
 	.tdLabel{
 		width: 90px;
 	}
 	.wwFormTable{
 		width: 100%
 	}
 	.formButton{
 		text-align: center
 	}
 	.btn-lg{
 		width:80%;
 	}
 	</style>
</head>
<body>
<%@ include file = "headnew.jsp" %><br>
<div class="container" >
	<div class="forml mx-auto">
	<p style="font-size: 20px;">Already have an ABC JOBS account? <a href="login.jsp">Log in</a></p>
	<h3 style="margin-bottom: 20px;color: #065683">Register with ABC JOBS</h3><hr>
	<s:form action="Register" onsubmit="return REGISTER()" method="post">
		<s:textfield name="firstname" label="First Name" cssClass="form-control" required="true"/>
		<s:textfield name="lastname" label="Last Name" cssClass="form-control" required="true"/>
		<s:textfield name="email" type="email" label="Email Id" cssClass="form-control" required="true"/>
		<s:radio name="gender" list="{'male','female'}" label="Gender" required="true"/>
		<s:password name="password" id="Pass" label="Password" cssClass="form-control" required="true"/>
		<s:password name="cpass" id="Cpass" label="Confirm Password" cssClass="form-control" required="true"/>
		<div class="text-center">
		<s:submit value="Submit" cssClass="btn btn-primary btn-lg"></s:submit>
		</div>
	</s:form>
	</div>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg"/></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg"/></span>
	</s:else>
</div>
	<script type="text/javascript">
		function REGISTER(){
			var pass = document.getElementById("Pass").value;
			var cpass = document.getElementById("Cpass").value;
			
			if (pass.length<8){
				window.alert("Password must be atleast 8 characters long")
				return false;
			}
			
			if(!(pass == cpass))
			{
				window.alert("Password and Confirm Password must be same");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>