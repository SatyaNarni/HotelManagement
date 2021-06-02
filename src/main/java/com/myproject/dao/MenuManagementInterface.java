package com.myproject.dao;

import java.util.List;

import com.myproject.bean.Menu;

public interface MenuManagementInterface {
	List<Menu> viewMenu() throws Exception;

	boolean deleteMenuItem(String menuId) throws Exception;

	boolean addMenuItem(Menu menu) throws Exception;
}
