package com.indus.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indus.springboot.entity.ToDo;
import com.indus.springboot.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository ToDoRepo;

	public List<ToDo> getAllTodo() {
		return ToDoRepo.findAll();
	}

	public ToDo saveTodo(ToDo todo) {
		return ToDoRepo.save(todo);
	}

	public ToDo getById(int id) {
		return ToDoRepo.findById(id).get();
	}

	public void deleteById(int id) {

		ToDo todo = ToDoRepo.findById(id).get();
		ToDoRepo.delete(todo);
	}
}
