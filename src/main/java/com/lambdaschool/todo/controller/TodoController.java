package com.lambdaschool.todo.controller;

import com.lambdaschool.todo.model.Todo;
import com.lambdaschool.todo.service.TodoService;
import com.lambdaschool.todo.view.CountTodos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todos")
public class TodoController
{
    @Autowired
    TodoService todoService;


    @PutMapping(value = "/todos/{todoid}")
    public ResponseEntity<?> updateQuote(
            @RequestBody
                    Todo updateTodo,
            @PathVariable
                    long todoid)
    {
        todoService.update(updateTodo, todoid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
//
//    @DeleteMapping("/quote/{id}")
//    public ResponseEntity<?> deleteQuoteById(
//            @PathVariable
//                    long id)
//    {
//        todoService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}