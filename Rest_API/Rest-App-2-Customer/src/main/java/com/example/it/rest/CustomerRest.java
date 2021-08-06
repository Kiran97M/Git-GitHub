package com.example.it.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRest {

	@GetMapping  (value= "/customer",  produces = {"application/Json", "application/Xml"})
	   public Customer getCustomer() {
		
	      get CustomerId(101);
	      get CustomerId("Anil");
	      get CustomerPhno(101232323);
	       
}
}