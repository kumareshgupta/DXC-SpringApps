package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.bean.ToDo;
import com.manipal.service.ToDoService;

@RestController
public class ToDoController {
	@Autowired
	private ToDoService toDoService;

	@GetMapping("/todos/users/{userName}")
	public List<ToDo> retrieveTodos(@PathVariable String userName){
		return toDoService.retrieveTodos(userName);
	}
	
}
