package com.myproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.bean.Menu;
import com.myproject.service.MenuService;

/**
 * Servlet implementation class AddMenuItemController
 */
@WebServlet("/AddMenuItemController")
public class AddMenuItemController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menuid=request.getParameter("id");
		String menuname=request.getParameter("name");
		String type=request.getParameter("type");
		String cat=request.getParameter("cat");
		String cost=request.getParameter("cost");
		String status=request.getParameter("status");
		double costy=0;
		if(cost!=null) {
			costy=Double.parseDouble(cost);
		}
		Menu menu=new Menu(menuid,menuname,cat,type,costy,status);
		MenuService menuService = new MenuService();
		try {
			if(menuService.addMenuItem(menu)){	
				request.setAttribute("Message", "Delete operation Successfull " + " Item "+ menu + " is added");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/success.jsp");
				rd.forward(request, response);
			}else{
				request.setAttribute("Message", "OOPS..! + Something Went Wrong " + " AddItem operation is not Successfull");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/failure.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {			
			request.setAttribute("Message", "OOPS..! + Something Went Wrong " + e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/failure.jsp");
			rd.forward(request, response);
		} 
	}
}
