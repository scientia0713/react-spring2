package com.example.demo.service;

import com.example.demo.entity.Task;

public interface TaskService {

	Iterable<Task> selectAll();
	
	void insertTask(Task task);
	
	void updateTask(Task task);
}
