package com.myproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.myproject.bean.Menu;
import com.myproject.dbutil.DBUtil;

public class MenuManagement implements MenuManagementInterface {

	public List<Menu> viewMenu() throws ClassNotFoundException, SQLException {
		List<Menu> menuList = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from MENU");
		ResultSet rs= pst.executeQuery();
		Optional<List<Menu>> isEmpty = Optional.of(menuList);
		while(rs.next()){
			if(!isEmpty.isPresent()){
				menuList = new ArrayList<>();
			}
			Menu menu = new Menu(rs.getString(1),
								 rs.getString(2),
								 rs.getString(3),
								 rs.getString(4),
								 rs.getDouble(5),
								 rs.getString(6));
			menuList.add(menu);
		}
		DBUtil.closeConnection(con);
		return menuList;
	}

	public boolean deleteMenuItem(String menuId) {
		
		return false;
	}

	public boolean addMenuItem(Menu menu) {
		
		return false;
	}

}
