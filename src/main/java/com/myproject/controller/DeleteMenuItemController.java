package com.myproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.service.MenuService;

/**
 * Servlet implementation class DeleteMenuItemController
 */
@WebServlet("/DeleteMenuItemController")
public class DeleteMenuItemController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menuId = request.getParameter("delMenuId");
		System.out.println("In delete controller " + menuId);
		MenuService menuService = new MenuService();
		try {
			if(menuService.deleteMenuItem(menuId)){
				
				request.setAttribute("Message", "Delete operation Successfull. "+" Item with menuId "+ menuId + " is deleted");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/success.jsp");
				rd.forward(request, response);
			}else{
				
				request.setAttribute("Message", "OOPS..! + Something Went Wrong " + " Delete operation is not Successfull");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/failure.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			
			request.setAttribute("Message", "OOPS..! + Something Went Wrong  " + e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/failure.jsp");
			rd.forward(request, response);
		}
	}

}
