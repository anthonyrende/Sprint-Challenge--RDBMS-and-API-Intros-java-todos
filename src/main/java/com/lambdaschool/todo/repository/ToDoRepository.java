package com.lambdaschool.todo.repository;

import com.lambdaschool.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Todo, Long>
{
}
