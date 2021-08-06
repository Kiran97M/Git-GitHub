package in.ashokit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserRest {
	
	

	   @PutMapping(value ="/update",consumes = {"application/json"}) 
		public ResponseEntity<String> updatCustomer(User user){
			
			return new ResponseEntity<String>("Update successfully",HttpStatus.OK);
			
			
			
			
			
			
			
		}
		
		
	
}



