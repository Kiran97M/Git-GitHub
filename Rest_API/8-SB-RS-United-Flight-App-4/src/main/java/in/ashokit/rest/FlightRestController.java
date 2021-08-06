package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.FlightService;



@RestController
public class FlightRestController {

	
@Autowired
private FlightService flightService	;

	@GetMapping("/flights")
public String getFlights() {
	
	return flightService.invokeUnitedFlightApi();
	
}

}
