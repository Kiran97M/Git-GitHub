package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.PassengerRequest;
import in.ashokit.bindings.TicketResponse;

@Service
public class TicketService {

	
	public TicketResponse initiateTickeBookProcess(PassengerRequest requestData) {
		
		String endpointUrl = "http://localhost:9090/bookTicket";
		  
		RestTemplate rt =new RestTemplate();
		
	ResponseEntity <TicketResponse> postForEntity =	rt.postForEntity(endpointUrl,requestData,TicketResponse.class);
		
		TicketResponse body = postForEntity.getBody();
		
		return body;
		
	}
}
