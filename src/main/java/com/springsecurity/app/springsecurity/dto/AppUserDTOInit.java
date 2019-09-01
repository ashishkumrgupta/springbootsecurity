package com.springsecurity.app.springsecurity.dto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.springsecurity.app.springsecurity.repository.AppUserRepository;

@Service
public class AppUserDTOInit implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public void run(String... args) throws Exception {
		AppUserDTO aud1 = new AppUserDTO("test", "test123", "USER", "READ");
		AppUserDTO aud2 = new AppUserDTO("admin", "admin123", "ADMIN", "READ, WRITE, DELETE, EDIT");

		appUserRepository.saveAll(Arrays.asList(aud1, aud2));
	}

}
