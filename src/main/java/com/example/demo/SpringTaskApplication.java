package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskServiceImpl;

@SpringBootApplication
public class SpringTaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTaskApplication.class, args)
		.getBean(SpringTaskApplication.class).execute();
	}
	
	@Autowired
	TaskServiceImpl service;
	
	private void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Iterable<Task> tasks = service.selectAll();
		for(Task task : tasks) {
			System.out.println(task);
		}
	}
}
