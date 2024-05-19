package com.indus.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indus.springboot.entity.ToDo;
import com.indus.springboot.service.ToDoService;

@RestController
public class ToDoController {

	@Autowired
	private ToDoService ToDoServ;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody ToDo todo) {
		return new ResponseEntity<>(ToDoServ.saveTodo(todo), HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllTodo() {
		return new ResponseEntity<>(ToDoServ.getAllTodo(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getTodoById(@PathVariable int id) {
		return new ResponseEntity<>(ToDoServ.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id) {
		ToDoServ.deleteById(id);
		return new ResponseEntity<>("ToDo Delete Successfully", HttpStatus.OK);
	}
}
