package com.eatm.domain;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
	
	private String menuItemNameName;
	private List<Review> reviews;
	
	public MenuItem(String menuItemName) {
		this.setMenuItemNameName(menuItemName);
	}

	public String getMenuItemNameName() {
		return menuItemNameName;
	}

	public void setMenuItemNameName(String menuItemNameName) {
		this.menuItemNameName = menuItemNameName;
	}
	
	public void addReview(Review review) {
		if(this.reviews==null) {
			this.reviews = new ArrayList<Review>();
		}
		this.reviews.add(review);
	}
	
	public void deleteReview(Review review) {
		this.reviews.remove(review);
	}
	
	
	

}
