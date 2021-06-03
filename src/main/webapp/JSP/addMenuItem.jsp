<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Menu Item Page</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/hotelMgmt.css">
	<script src="<%=request.getContextPath()%>/JS/hotelMgmt.js"></script>
	<title>Menu View Page</title>
</head>
<body>
<div class="header">		
		<img src="<%=request.getContextPath()%>/Images/logo.png"  alt="hotellogo"/>
		<h1>Online Hotel Management System</h1>
	</div>
<form name="addform" method="get" action="<%=request.getContextPath()%>/AddMenuItemController">
<table>
<tr><th>Menu Id</th><td><input type="text" id="id" name="id"></td></tr>
<tr><th>Name</th><td><input type="text" id="name" name="name"></td></tr>
<tr>
<th>Type</th>
<td>
<select id="type" name="type">
<option value="Veg">Veg</option>
<option value="NonVeg">NonVeg</option>
</select>
</td>
</tr>
<tr>
<th>Category</th>
<td>
<select id="cat" name="cat">
<option value="Breakfast">Breakfast</option>
<option value="Lunch">Lunch</option>
<option value="Snacks">Snacks</option>
<option value="Dinner">Dinner</option>
</select>
</td>
</tr>
<tr><th>Cost/Menu(INR)</th><td><input type="text" id="cost" name="cost"></td></tr>
<tr>
<th>Status</th>
<td>
<select id="status" name="status">
<option value="Available">Available</option>
<option value="NotAvailable">NotAvailable</option>
</select>
</td>
</tr>
</table>
<br>

<input type="submit" name="action"  onclick="return validateAdd();"/>
&nbsp;
&nbsp;
&nbsp;
<input type="reset"  value="clear" >
</form>
&nbsp;
&nbsp;
&nbsp;
<a class="button" href="<%=request.getContextPath()%>/JSP/menuHome.jsp">Home</a>
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