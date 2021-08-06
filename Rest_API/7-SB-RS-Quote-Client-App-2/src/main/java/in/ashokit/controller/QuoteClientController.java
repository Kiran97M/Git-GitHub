package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ashokit.client.QuoteClient;

@RestController
public class QuoteClientController {

	@Autowired
	private QuoteClient client;
	
	@GetMapping("/home")
	public String getClientInt() {
		
		return client.invokeRandomMethodApi();
	}
	
}
