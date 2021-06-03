<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@  page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Menu Home Page</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/hotelMgmt.css">
</head>

<body>
	<div class="header">		
		<img src="<%=request.getContextPath()%>/Images/logo.png"  alt="hotellogo"/>
		<h1>Online Hotel Management System</h1>
	</div>
	<hr>
	<div class="content">
		<a class="button1"  href="<%=request.getContextPath()%>/MenuViewController">View Menu</a>
	</div>
	<hr>
	<div class="footer">
		<h4>Copyright &copy; 2021 Hotel Management</h4>
	</div>
</body>

</html>