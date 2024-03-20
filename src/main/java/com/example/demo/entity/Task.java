package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	private Integer id;
	
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "registrant_id" , referencedColumnName = "id")
	private User user;
	
}
