package spring.mvc.rest.springMvcRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring.mvc.rest.springMvcRest.Repo.CustomerRepository;
import spring.mvc.rest.springMvcRest.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
 
	private final CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Optional<Customer> findCustomerById(Long id) {		
		return customerRepository.findById(id);
	}

	@Override
	public List<Customer> findAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer pCustomer) {
		return customerRepository.save(pCustomer);
	}

}
