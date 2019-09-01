package com.springsecurity.app.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.app.springsecurity.dto.AppUserDTO;

@Repository
public interface AppUserRepository extends CrudRepository<AppUserDTO, Long> {

}
