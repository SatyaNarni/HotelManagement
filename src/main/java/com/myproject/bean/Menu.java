package com.myproject.bean;

public class Menu {
	String menuId;
	String menuName;
	String category;
	String type;
	double cost;
	String status;
	public Menu() {
		super();
	}
	public Menu(String menuId, String menuName, String category, String type, double cost, String status) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.category = category;
		this.type = type;
		this.cost = cost;
		this.status = status;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "\nMenu [menuId=" + menuId + ", menuName=" + menuName + ", category=" + category + ", type=" + type
				+ ", cost=" + cost + ", status=" + status + "]";
	}
	
	
}
