package dao;

import java.util.List;

import com.eatm.domain.Customer;

public class CustomerDAO {
	
	List<Customer> customers;
	
	public Customer getCustomerByName(Customer customer) {
		Customer customerInfo = null;
		if(customers==null) {
			return customerInfo;
		}
		for(Customer customerInList :customers) {
			if(customerInList.getFirstName().equals(customer.getFirstName()) &&
				customerInList.getLastName().equals(customer.getLastName())) {
				customerInfo = customerInList; 
			}
		}
		
		return customerInfo;
	}

}
