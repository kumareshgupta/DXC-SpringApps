package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.bean.ToDo;
import com.manipal.exception.ToDoNotFoundException;
import com.manipal.service.ToDoService;

@RestController
public class ToDoController {
	@Autowired
	private ToDoService toDoService;

	@GetMapping("/todos/users/{userName}")
	public List<ToDo> retrieveTodos(@PathVariable String userName){
		return toDoService.retrieveTodos(userName);
	}
		@GetMapping("/users/{id}")
	public ToDo retriveTodo(@PathVariable int id) {
		ToDo todo = toDoService.retrieve(id);
		if(todo == null)
			throw new ToDoNotFoundException("Todo Not Found.. id invalid!!");		
		return todo;
	}
	/*@GetMapping("/users/{id}")
	public ResponseEntity<ToDo> retriveTodo(@PathVariable int id) {
		ToDo todo = toDoService.retrieve(id);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Some-Header", "Head is heavy");
	
		return ResponseEntity.accepted().headers(headers).body(todo);
		//return ResponseEntity.ok(todo);
	}*/
	
	

}
