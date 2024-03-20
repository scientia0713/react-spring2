package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	TaskRepository repository;

	@Override
	public void insertTask(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(task);
	}

	@Override
	public void updateTask(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(task);
	}
	
	@Override
	public Iterable<Task> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

}
