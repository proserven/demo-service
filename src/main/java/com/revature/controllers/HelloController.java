package com.revature.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	static final String SERVER_PORT = "local.server.port";

	@Autowired
	private Environment env;

	//localhost:8080/hello
	@GetMapping("/hello")
	public String sayHello() throws UnknownHostException {
		return String.format("Hello from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty(SERVER_PORT));
	}

	@GetMapping("/hi")
	public String sayHi() throws UnknownHostException {
		return String.format("Hello Luis looks for the info:  %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty(SERVER_PORT));
	}

	@GetMapping("/howdy")
	public String howdy() throws UnknownHostException {
		return String.format("Hello Luis looks for the info:  %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty(SERVER_PORT));
	}
}
