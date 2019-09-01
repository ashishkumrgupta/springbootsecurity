package com.springsecurity.app.springsecurity.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUserDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String password;
	private String roles = "";
	private String authorities = "";

	protected AppUserDTO() {
		super();
	}

	public AppUserDTO(String userName, String password, String roles, String authorities) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
		this.authorities = authorities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public List<String> getRolesAsList() {
		String rolesInarray[] = roles.split(",");
		if (rolesInarray.length > 0)
			return Arrays.asList(rolesInarray);
		else
			return new ArrayList<>();
	}

	public List<String> getAuthoritiesAsList() {
		String authorityInarray[] = roles.split(",");
		if (authorityInarray.length > 0)
			return Arrays.asList(authorityInarray);
		else
			return new ArrayList<>();
	}

}
