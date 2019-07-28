package spring.mvc.rest.springMvcRest.customerController;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import spring.mvc.rest.springMvcRest.Repo.CustomerRepository;
import spring.mvc.rest.springMvcRest.model.Customer;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerControllerTest {
	//@Autowired
	//private CustomerService customerService;
	@Autowired
	private CustomerRepository customerRepository;
	
	@Before
	public void setUp() throws Exception {			
	}
	
	@Test
	public void findAllCustomers() throws Exception {
		Optional<Customer>  customers =  customerRepository.findById((long) 1);
		
		assertTrue(customers.get().getId() == 1);
	}
}
