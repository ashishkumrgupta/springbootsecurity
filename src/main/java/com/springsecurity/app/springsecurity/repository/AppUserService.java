package com.springsecurity.app.springsecurity.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.app.springsecurity.dto.AppUserDTO;

@Service
public class AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	public List<AppUserDTO> getAppUsers() {
		return (List<AppUserDTO>) appUserRepository.findAll();
	}
}
