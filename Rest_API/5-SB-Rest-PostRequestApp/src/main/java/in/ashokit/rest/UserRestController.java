package in.ashokit.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.User;

@RestController


public class UserRestController {
   @PostMapping(value="/user" , consumes=" {application/json,application/xml}, produces = {plain/text}") 
	public String addUser(@RequestBody User user) {
		System.out.println(user);
		String msg="User Saved succefully";
		return msg;
		
	}
	
}
