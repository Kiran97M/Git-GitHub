package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable {
  @GetMapping(value="/course/{name}/trainer.{tname}")
	public String getCourseDetails(@PathVarible String cname,@PathVariable String tname) {
	 String msg=cname+"by"+ tname+ "Starting from 7:30 AM";
	 return msg;
	 
}
}