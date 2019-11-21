package com.eatm.domain;

public class Vendor {
	
	private String companyName;
	private String location;
	private Menu menu;

	public Vendor() {};
	public Vendor(String companyName, String location) {
		this.setCompanyName(companyName);
		this.setLocation(location);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public void addMenu(Menu menu) {
		this.menu = menu;
	}
	

}
