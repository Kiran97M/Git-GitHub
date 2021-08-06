package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.PassengerRequest;
import in.ashokit.bindings.TicketResponse;
import in.ashokit.service.TicketService;

@RestController
public class TicketBookingRestController {

	
	@Autowired
	private TicketService ticketService;
	
	public TicketResponse bookTicket (@RequestBody PassengerRequest request) {
		
		return ticketService.initiateTickeBookProcess(request);
		
	}
}
