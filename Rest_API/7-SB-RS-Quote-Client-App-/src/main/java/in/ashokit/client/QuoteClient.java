package in.ashokit.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

		
	public void invokeRandomMethodApi() {
		
		String apiUrl="https://quoters.apps.pcfone.io/api/random";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl, String.class);
		
		int statusCode = responseEntity.getStatusCodeValue();
		
		if (statusCode == 200) {
			
			String  body = responseEntity.getBody();
			
			System.out.println(body);
			
		}
		
	
		
	}
	
}
