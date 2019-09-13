package com.lambdaschool.todo.repository;

import com.lambdaschool.todo.model.Todo;
import com.lambdaschool.todo.view.CountTodos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ToDoRepository extends CrudRepository<Todo, Long>
{
    @Query(value = "SELECT u.username, count(t.todoid) as counttodos FROM todos t JOIN users u on t.userid = u.userid GROUP BY u.username", nativeQuery = true)
    ArrayList<CountTodos> getCountTodos();
}
