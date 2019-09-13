package com.lambdaschool.todo.repository;

import com.lambdaschool.todo.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long>
{
    Users findByUsername(String username);
}
