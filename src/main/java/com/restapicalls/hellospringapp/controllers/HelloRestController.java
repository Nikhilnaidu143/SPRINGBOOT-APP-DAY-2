package com.restapicalls.hellospringapp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapicalls.hellospringapp.models.User;

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

	/***
	 * UC-2:- Make REST Call to show Hello Mark from BridgeLabz .
	 * 
	 * --> curl localhost:8080/hello/query?name=Mark -w "\n"
	 ***/
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " from BridgeLabz...!";
	}

	/***
	 * UC-3:- Make REST Call to show Hello Mark from BridgeLabz.
	 * 
	 * --> curl localhost:8080/hello/param/Mark -w "\n"
	 ***/
	@RequestMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + " from BridgeLabz...!";
	}

	/***
	 * UC-4:- Make REST Call to show Hello Mark Taylor from BridgeLabz.
	 * 
	 * --> curl -X POST -H "Content-Type: application/json" -d '{"firstName":
	 * "Mark","lastName": "Taylor"}' "http://localhost:8080/hello/post" -w "\n"
	 ***/
	@RequestMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz...!";
	}

	/***
	 * UC-5:- Make REST Call to show Hello Mark Taylor from BridgeLabz. ==>Use PUT
	 * Request Method and pass first name as Path Variable and last name as Query
	 * Parameter.
	 * 
	 * --> curl -x PUT localhost:8080/hello/put/Mark/?lastName=Tayler -w "\n"
	 ***/
	@RequestMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName , @RequestParam(value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + " from BridgeLabz...!";
	}
}
