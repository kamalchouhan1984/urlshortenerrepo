package com.url.shortener.data.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.url.shortener.data.model.User;
import com.url.shortener.data.repository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void add(User user) {
		userRepository.save(user);
	}

}
