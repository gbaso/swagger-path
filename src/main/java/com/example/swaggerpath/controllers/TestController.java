package com.example.swaggerpath.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
class TestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world!";
	}

}