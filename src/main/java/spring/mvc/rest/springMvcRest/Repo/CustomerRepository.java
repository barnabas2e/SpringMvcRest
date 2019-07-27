package spring.mvc.rest.springMvcRest.Repo;

import org.springframework.data.repository.CrudRepository;
import spring.mvc.rest.springMvcRest.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}	
