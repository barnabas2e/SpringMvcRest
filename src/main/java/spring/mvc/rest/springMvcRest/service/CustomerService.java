package spring.mvc.rest.springMvcRest.service;

import java.util.List;
import java.util.Optional;

import spring.mvc.rest.springMvcRest.model.Customer;

public interface CustomerService {
	
	public Optional<Customer>  findCustomerById(Long id);
	
	public List<Customer> findAllCustomers();	
	
	public Customer saveCustomer(Customer pCustomer);
		
}
