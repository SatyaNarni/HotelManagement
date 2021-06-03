<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.myproject.bean.Menu, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Menu Home Page</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/hotelMgmt.css">
	<title>Menu View Page</title>
</head>
<body>
<div class="header">
<img src="<%=request.getContextPath()%>/Images/logo.png"  alt="hotellogo"/>
<h1>Online Hotel Management System</h1>
</div>

<hr>
<h1>VIEW MENUS</h1>
<br>
<h2><u><i>MENUS TAGGED TO TYPE-VEG </i></u></h2>
<%
	List<Menu> menuList=(List<Menu>)request.getAttribute("menuList");
	if(menuList!=null) {
%>
<table>
<tr><th>Menu Id</th><th>Name</th><th>Category/Menu(INR)</th><th>Cost</th><th>Status</th><th>Action</th></tr>

<%
		for(Menu m:menuList) {
			if(m.getType().equals("Veg")){
%>
<tr>
<td><%=m.getMenuId() %></td>
<td><%=m.getMenuName() %></td>
<td><%=m.getCategory() %></td>
<td><%=m.getCost() %></td>
<td><%=m.getStatus()%></td>
<td>
<%if(m.getStatus().equals("NotAvailable")){ %>
<a href="<%=request.getContextPath()%>/DeleteMenuItemController?delMenuId=<%=m.getMenuId() %>">Delete</a>
<%}else{ %>
NA</td>
<%} %>
</tr>
<%}%>
<%}%>
</table>
<%}%>
<br>
<br>
<a class="button" href="<%=request.getContextPath()%>/JSP/addMenuItem.jsp">Add Menu</a>
<br>
<br>
<br>
<h2><u><i>MENUS TAGGED TO TYPE-NON VEG </i></u></h2>
<%
	List<Menu> menuList1=(List<Menu>) request.getAttribute("menuList");
	if(menuList1!=null) {
%>
<table>
<tr><th>Menu Id</th><th>Name</th><th>Category/Menu(INR)</th><th>Cost</th><th>Status</th><th>Action</th></tr>

<%
		for(Menu m:menuList1) {
			if(m.getType().equals("NonVeg")){
%>
<tr>
<td><%=m.getMenuId() %></td>
<td><%=m.getMenuName() %></td>
<td><%=m.getCategory() %></td>
<td><%=m.getCost() %></td>
<td><%=m.getStatus()%></td>
<td>
<%if(m.getStatus().equals("NotAvailable")){ %>
<a href="<%=request.getContextPath()%>/DeleteMenuItemController?delMenuId=<%=m.getMenuId()%>">Delete</a>
<%}else{ %>
NA</td>
<%} %>
</tr>
<%}%>
<%}%>
</table>
<%} %>
<br>
<br>
<a class="button" href="<%=request.getContextPath()%>/JSP/addMenuItem.jsp">Add Menu</a>
<br>
<br>
<center>
<a class="button" href="<%=request.getContextPath()%>/JSP/menuHome.jsp">Home</a>
</center>

<hr>
<div class="footer">
<h4>Copyright &copy; 2021 Hotel Management</h4>
</div>
</body>
</body>
</html>