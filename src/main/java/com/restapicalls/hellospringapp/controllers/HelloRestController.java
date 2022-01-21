package com.restapicalls.hellospringapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	/***
	 * UC-1:- Create a Rest Controller to demonstrate the various HTTP Methods and
	 * respond hello messages to the User. To begin with show Hello from BridgeLabz.
	 * 
	 * --> curl localhost:8080/hello -w "\n"
	 ***/
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello from BridgeLabz...!";
	}
}
