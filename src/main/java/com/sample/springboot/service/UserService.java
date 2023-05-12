package com.sample.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sample.springboot.model.User;
import com.sample.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
