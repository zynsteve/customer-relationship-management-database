package webapp.service;

import java.util.List;

import webapp.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
