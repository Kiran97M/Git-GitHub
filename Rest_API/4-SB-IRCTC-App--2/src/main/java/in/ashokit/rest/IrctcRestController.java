package in.ashokit.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@RestController
public class IrctcRestController { 

	@PostMapping(value="/bookticket", 
			
	consumes = {
			"application/xml",
			"application/json"
			},
			
	produces = {
			"application/xml", 
		   "application/json"	
	}
	
			)
	
	 public TicketResponse bookTicket (@RequestBody PassengerRequest request) {
		
		 TicketResponse response = new TicketResponse();
		 
		/* response.setName(request.getName());
		 response.setDob(request.getDob());
		 response.setGender(request.getGender());
		 response.setDoj(request.getDoj());
		 response.setFrom(request.getFrom());
		 response.setTo(request.getTo());
		 response.setTrain(request.getTrain());*/
		 
		 response.setStatus("CONFIRM");
		 response.setPrice(1600.00);
		 
		 BeanUtils.copyProperties(request, response);
		 
		 return response;
		 
	 }
}
