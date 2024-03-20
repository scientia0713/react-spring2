package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

	@Override
	public void insertUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(user);
		
	}

}
