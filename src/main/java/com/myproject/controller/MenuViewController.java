package com.myproject.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.bean.Menu;
import com.myproject.service.MenuService;

/**
 * Servlet implementation class MenuViewController
 */
@WebServlet("/MenuViewController")
public class MenuViewController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenuService menuService = new MenuService();	
		try {
			List<Menu> menuList = menuService.viewMenu();
			request.setAttribute("menuList", menuList);
			for(Menu m: menuList){
				System.out.println("In viewww" + m);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/viewMenu.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/failure.jsp");
			request.setAttribute("Message", "OOPS..! + Something Went Wrong " +"/n"+ e.getMessage());
			rd.forward(request, response);
		} 
		
	}

}
