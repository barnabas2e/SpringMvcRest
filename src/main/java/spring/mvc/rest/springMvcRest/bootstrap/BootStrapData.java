package spring.mvc.rest.springMvcRest.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import spring.mvc.rest.springMvcRest.Repo.CustomerRepository;
import spring.mvc.rest.springMvcRest.model.Customer;

@Component
public class BootStrapData implements ApplicationListener<ContextRefreshedEvent> {

	private final CustomerRepository customerRepository;
		
	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
	
	public void initData() {
		System.out.println("BootStrapData loading data....");
		
		Customer c1 = new Customer("Greg", "Moore");
		//c1.setFirstName("Greg");
		//c1.setLastName("Moore");
		Customer c2 = new Customer("Jessy", "Brown");
		Customer c3 = new Customer("Kingsley", "Joe");
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		
		
		System.out.println("Customer(s) saved ...... ");
	}
}
