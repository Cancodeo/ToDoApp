package com.todospringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todospringboot.models.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long>{
	
}
