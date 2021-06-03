<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/hotelMgmt.css">
</head>
<body>
<div class="header">		
		<img src="<%=request.getContextPath()%>/Images/logo.png"  alt="hotellogo"/>
		<h1>Online Hotel Management System</h1>
	</div>
<h1 align="center">Acknowledgement</h1>
<br><br>
<p align="center">
<font color="red"><%=request.getAttribute("Message") %></font>
</p>
<br><br>
<center>
<a class="button" href="<%=request.getContextPath()%>/JSP/menuHome.jsp">Home</a>
</center>
&nbsp;
&nbsp;
&nbsp;
&nbsp;
&nbsp;
<div class="footer">
		<h4>Copyright &copy; 2021 Hotel Management</h4>
	</div>
</body>
</html>