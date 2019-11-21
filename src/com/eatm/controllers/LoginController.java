package com.eatm.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eatm.domain.Vendor;
import com.google.gson.Gson;

import dao.VendorDAO;


@Controller
//@SessionAttributes("sessionUser")
public class LoginController {
	
	
//	@ModelAttribute("sessionUser")
//	public Customer user() {
//		return new Customer();
//	}

	
	@ResponseBody
	@RequestMapping("customerLogin")
	public String customerLogin(){
		 String json = new Gson().toJson(new VendorDAO().getVendors());

		return json;
	}
	
	@ResponseBody
	@RequestMapping("vendor-login")
	public Vendor vendorLogin(@RequestBody Vendor vendor){
		Vendor vendorInfo = new VendorDAO().getVendorByName(vendor);
		return vendorInfo;
	}
	
}
