package com.eatm.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	List<MenuItem> menuItems;
	
	public void addMenuItem(MenuItem menuItem) {
		if(menuItems==null) {
			this.menuItems = new ArrayList<MenuItem>();
		}
		this.menuItems.add(menuItem);
	}
	
	public void deleteMenuItem(MenuItem menuItem) {
		this.menuItems.remove(menuItem);
	}

}
