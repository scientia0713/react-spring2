package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

	Iterable<User> selectAll();
	
	void insertUser(User user);
	
	void updateUser(User user);
}
