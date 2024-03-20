package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;

@SpringBootApplication
public class SpringTaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTaskApplication.class, args)
		.getBean(SpringTaskApplication.class).execute();
	}
	
	@Autowired
	UserServiceImpl service;
	
	private void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Iterable<User> users = service.selectAll();
		for(User user : users) {
			System.out.println(user);
		}
	}
}
