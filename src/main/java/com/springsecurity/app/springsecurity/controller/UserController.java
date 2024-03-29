package com.springsecurity.app.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping("/{userName}")
	public String helloUser(@PathVariable String userName) {
		return "Welcome User" + userName;
	}
}
