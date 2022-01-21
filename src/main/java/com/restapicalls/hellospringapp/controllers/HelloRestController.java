package com.restapicalls.hellospringapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	/*** UC-2:- Make REST Call to show Hello Mark from BridgeLabz . 
	 * 
	 * 	--> curl localhost:8080/hello/query?name=Mark -w "\n"
	 * ***/
	@RequestMapping(value = {"/query"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " from BridgeLabz.";
	}
}
	

