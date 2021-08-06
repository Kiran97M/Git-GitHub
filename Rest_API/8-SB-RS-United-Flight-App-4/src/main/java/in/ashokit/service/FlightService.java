package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FlightService {

	public String invokeUnitedFlightApi() {
		
		String endpointUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";
		
		RestTemplate rt = new RestTemplate();
		
		
		ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl,String.class);
		
		String body = responseEntity.getBody();
		
		return body;
	}
	
	
}
