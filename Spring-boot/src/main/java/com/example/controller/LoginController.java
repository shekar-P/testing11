package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {
	@GetMapping("/")
	public String homePage() {
		return "login.html";
	}
	//shekar-p editing
	@GetMapping("/")
	public String homePage1() {
		return "login1.html";
	}
}
