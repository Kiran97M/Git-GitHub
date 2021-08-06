package in.ashokit.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Customer;

@RestController
	

public class CustomerRestController {
	@GetMapping (value= "/customer",  produces = {"application/Json", "application/Xml"})
   public Customer getCustomerData() {
		Customer customer= new Customer();
		
		customer.setCustomerId(101);
		
		customer.setCustomerName("kiran kumar");
		customer.setCustomerPhno(1234561111);
		
		 return customer;
	}
	
	}


