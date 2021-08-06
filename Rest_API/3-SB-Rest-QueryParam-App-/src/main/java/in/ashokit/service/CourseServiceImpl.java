package in.ashokit.service;

import org.springframework.stereotype.Component;

@Component
public class CourseServiceImpl implements CourseService {

	public String getCourseInformation(String name) {
		
		String msg = "";

		if ("SBMS".equals(name)) {
			msg = "New Batch for SBMS Starts from 11-July @ 7:30AM";

		} else if ("JRTP".equals(name)) {
			msg = "New Batch for JRTP Starts from 19-July @ 9:30AM";

		} else if ("AWS".equals(name)) {
			msg = "New Batch for AWS Starts from 11-July @ 4:30AM";
			return msg;

		} else {
			msg = "Please visit www.ashokit.com  KKKKKKKKKKKK";

		}
		return msg;

	}

}
