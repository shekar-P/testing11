package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String homePage() {
		return "home.html";
	}
	@GetMapping("/")
	public String dashboard() {
		return "dashboard.html";
	}
}
