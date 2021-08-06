package com.example.it;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
     

	
	
	
	  @GetMapping("/welcome")
	 
	  public String welcome() {
		   
		  return "Welcome Kiran Kumar";
		  
		  
	  }
	
}
