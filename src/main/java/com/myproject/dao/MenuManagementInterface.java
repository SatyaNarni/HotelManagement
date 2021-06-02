package com.myproject.dao;

import java.util.List;

import com.myproject.bean.Menu;

public interface MenuManagementInterface {
	List<Menu> viewMenu() throws Exception;

	boolean deleteMenuItem(String menuId);

	boolean addMenuItem(Menu menu);
}
