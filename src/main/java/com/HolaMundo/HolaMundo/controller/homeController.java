package com.HolaMundo.HolaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
	@GetMapping("/")
	public String inicio() {
		return "Hola mundo desde Spring Boot.";
	}
}
