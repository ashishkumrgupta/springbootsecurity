package com.springsecurity.app.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.app.springsecurity.dto.AppUserDTO;
import com.springsecurity.app.springsecurity.repository.AppUserService;

@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AppUserService appUserService;

	@GetMapping("/{adminName}")
	public String helloAdmin(@PathVariable String adminName) {
		return "Welcome Admin" + adminName;
	}

	@GetMapping("/getAllUSers")
	public List<AppUserDTO> getAllUsers() {
		return appUserService.getAppUsers();
	}
}
