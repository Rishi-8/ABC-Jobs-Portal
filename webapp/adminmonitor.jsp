<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.button{
		border:1px solid black;
		font-size:20px;
		font-family:sans-serif;
		padding:5px;
		margin:5px;
		text-decoration: none;
		color:white;
		background-color: #065683;
	}
	
</style>
</head>
<body>
	<s:if test="noData==true">
		<table style="margin-bottom: 10px">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Gender</th>
					<th>Country</th>
					<th>City</th>
					<th>Company</th>
					<th>Delete</th>
				</tr>
			</thead>
			<s:iterator value="beanList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="firstname"/> <s:property value="lastname"/></td>
					<td><s:property value="email"/></td>
					<td><s:property value="gender"/></td>
					<td><s:property value="country"/></td>
					<td><s:property value="city"/></td>
					<td><s:property value="company"/></td>
					<td><a href="deleteuser.action?id=<s:property value="id"/>">Delete</a></td>
				</tr>
			</s:iterator>
		</table>
		<a href="index.html" class="button">Log out</a>
	</s:if>
	<s:else>
		<div style="color: red;">No Data Found.</div>
	</s:else>
</body>
</html>