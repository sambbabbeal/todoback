package com.example.todoback.repo;

import com.example.todoback.model.TodoItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem,  Long> {
}
