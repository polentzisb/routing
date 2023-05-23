package com.polentzi.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(RoutingApplication.class, args);
	}
	@RequestMapping("")
	public String CodingController1() {
		return "Hola Coding Dojo";
	}
	@RequestMapping("/python")
	public String CodingController2() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("/java")
	public String CodingController3() {
		return "¡Java/Spring es mejor!";
	}	
}