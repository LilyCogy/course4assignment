package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String sayHello() {
		String msg=  "<div style='color:red;background-color:yellow;font-size:40pt;'>"
				+ "Welcome to PETCO clinic. This application was developed using spring boot"
				+ "We developed an application using Spring, EC2, Docker and Jenkin"
				+ "</div>";
		return msg;
	}
}
