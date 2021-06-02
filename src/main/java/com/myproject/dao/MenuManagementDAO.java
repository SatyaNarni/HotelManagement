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

public class MenuManagementDAO implements MenuManagementInterface {

	public List<Menu> viewMenu() throws ClassNotFoundException, SQLException {
		List<Menu> menuList = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from MENU");
		ResultSet rs= pst.executeQuery();
		Optional<List<Menu>> optionalList = Optional.of(menuList);
		while(rs.next()){
			if(!optionalList.isPresent()){
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

	public boolean deleteMenuItem(String menuId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		Connection con = DBUtil.getConnection();
		Optional<String> isNull = Optional.ofNullable(menuId);
		PreparedStatement pst = con.prepareStatement("delete from MENU where menuId=? ");
		if(isNull.isPresent()){
			pst.setString(1, menuId);
			result = pst.executeUpdate()>0 ? true : false;
		}
		
		DBUtil.closeConnection(con);
		
		return result;
	}

	public boolean addMenuItem(Menu menu) throws SQLException, ClassNotFoundException {
		
		boolean result = false;
		Connection con = DBUtil.getConnection();
		Optional<Menu> isNull = Optional.ofNullable(menu);
		PreparedStatement pst = con.prepareStatement("insert into MENU values(?,?,?,?,?,?)");
		
		if(isNull.isPresent()){
			pst.setString(1, menu.getMenuId());
			pst.setString(2, menu.getMenuName());
			pst.setString(3, menu.getCategory());
			pst.setString(4, menu.getType());
			pst.setDouble(5, menu.getCost());
			pst.setString(6, menu.getStatus());	
			
			result = pst.executeUpdate() > 1 ? true : false;
		}
		
		DBUtil.closeConnection(con);
		
		return result;
	}

}
