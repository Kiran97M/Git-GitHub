package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.CourseService;

@RestController
public class QueryParamController {

	@Autowired
	private  CourseService courseService;
	
	

	@GetMapping(value = "/course")
	public String getCourceDetails(@RequestParam("name") String name) {
		return courseService.getCourseInformation(name);
	}

}