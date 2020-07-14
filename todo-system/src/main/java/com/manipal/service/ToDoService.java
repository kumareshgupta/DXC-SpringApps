package com.manipal.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.manipal.bean.ToDo;
@Service
public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	static {
		ToDo toDo1 = new ToDo(11,"Ram", "Learning Spring Boot", LocalDate.now(), false);
		ToDo toDo2 = new ToDo(11,"Ram", "Learning Agile Methodology", LocalDate.now(), false);
		ToDo toDo3 = new ToDo(12,"Shyam", "Learning Spring Boot", LocalDate.now(), false);
		ToDo toDo4 = new ToDo(13,"Mohani", "Writing Spring Boot book", LocalDate.now(), false);
		ToDo toDo5 = new ToDo(14,"Uma", "Learning Spring MVC", LocalDate.now(), false);
		ToDo toDo6 = new ToDo(14,"Uma", "Learning Spring REST", LocalDate.now(), false);
		
		todos.add(toDo1);
		todos.add(toDo2);
		todos.add(toDo3);
		todos.add(toDo4);
		todos.add(toDo5);
		todos.add(toDo6);
	}
	
	
	public List<ToDo> retrieveTodos(String userName){
		List<ToDo> userList = new ArrayList<>();
		for(ToDo todo : todos) {
			if(todo.getUserName().equals(userName)) {
				userList.add(todo);
			}
		}
		return userList;
	}
	
	/*public ToDo addTodo(int id, String name, String description, LocalDate endDate, boolean isCompleted) {
		
	}*/
	
	/*
	public ToDo retrieve(int id) {
		
	}*/
	
	
	
	
	
}
