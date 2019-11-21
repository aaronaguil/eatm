package dao;

import java.util.ArrayList;
import java.util.List;

import com.eatm.domain.Menu;
import com.eatm.domain.MenuItem;
import com.eatm.domain.Vendor;

public class VendorDAO {
	
	List<Vendor> vendors;

	public VendorDAO() {
		vendors = new ArrayList<Vendor>();
		Vendor vendor1 = new Vendor("Chans Chinese", "Oakland");
		Vendor vendor2 = new Vendor("Romanos Pizza", "Oakland");
		Vendor vendor3 = new Vendor("Teddys Burger", "Oakland");
		
		MenuItem chansItem1 = new MenuItem("General Tso's Chicken");
		MenuItem chansItem2 = new MenuItem("Fried Rice");
		MenuItem chansItem3 = new MenuItem("Orange chicken");
		MenuItem romanosItem1 = new MenuItem("Pepperoni Pizza");
		MenuItem romanosItem2 = new MenuItem("Garlic Bread");
		MenuItem romanosItem3 = new MenuItem("Hot Wings");
		MenuItem teddysItem1 = new MenuItem("French Fries");
		MenuItem teddysItem2 = new MenuItem("Mushroom Burger");
		MenuItem teddysItem3 = new MenuItem("Nachos");
		
		Menu chansMenu = new Menu();
		chansMenu.addMenuItem(chansItem1);
		chansMenu.addMenuItem(chansItem2);
		chansMenu.addMenuItem(chansItem3);
		Menu romanosMenu = new Menu();
		romanosMenu.addMenuItem(romanosItem1);
		romanosMenu.addMenuItem(romanosItem2);
		romanosMenu.addMenuItem(romanosItem3);
		Menu teddysMenu = new Menu();
		teddysMenu.addMenuItem(teddysItem1);
		teddysMenu.addMenuItem(teddysItem2);
		teddysMenu.addMenuItem(teddysItem3);
		
		vendor1.addMenu(chansMenu);
		vendor2.addMenu(chansMenu);
		vendor3.addMenu(chansMenu);
		
		vendors.add(vendor1);
		vendors.add(vendor2);
		vendors.add(vendor3);
		
	}
	
	public Vendor getVendorByName(Vendor vendor) {
		Vendor vendorInfo = null;
		if(vendor==null) {
			return vendorInfo;
		}
		for(Vendor vendorInfoList :vendors) {
			if(vendorInfoList.getCompanyName().equals(vendorInfoList.getCompanyName())) {
				vendorInfo = vendorInfoList; 
			}
		}
		
		return vendorInfo;
	}
	
	public List<Vendor> getVendors(){
		return this.vendors;
	}

}
