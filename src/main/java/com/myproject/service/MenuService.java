package com.myproject.service;

import java.sql.SQLException;
import java.util.List;

import com.myproject.bean.Menu;
import com.myproject.dao.MenuManagementDAO;

public class MenuService {
	public List<Menu> viewMenu() throws ClassNotFoundException, SQLException{
		MenuManagementDAO menuDAO = new MenuManagementDAO();
		return menuDAO.viewMenu();
	}
	
	public boolean deleteMenuItem(String menuId) throws ClassNotFoundException, SQLException{
		MenuManagementDAO menuDAO = new MenuManagementDAO();
		return menuDAO.deleteMenuItem(menuId);
	}
	
	public boolean addMenuItem(Menu menu) throws ClassNotFoundException, SQLException{
		MenuManagementDAO menuDAO = new MenuManagementDAO();
		return menuDAO.addMenuItem(menu);
	}
}
