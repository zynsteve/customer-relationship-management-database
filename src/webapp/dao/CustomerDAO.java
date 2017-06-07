package webapp.dao;

import java.util.List;

import webapp.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
