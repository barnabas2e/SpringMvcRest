package spring.mvc.rest.springMvcRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import spring.mvc.rest.springMvcRest.model.Customer;
import spring.mvc.rest.springMvcRest.service.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_RESOURCE_URL)
public class CustomerController {

	public static final String BASE_RESOURCE_URL = "api/v1/customers";
	
	public CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/{id}")
	Optional<Customer> getCutomerById(@PathVariable Long id) {
		return customerService.findCustomerById(id);	
	}
	
	@GetMapping
	List<Customer> getAllCustomers() {
		return customerService.findAllCustomers();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Customer saveCustomer(@RequestBody Customer pCustomer) {
		return customerService.saveCustomer(pCustomer);
	}
}
