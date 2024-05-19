package com.indus.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indus.springboot.entity.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

}
