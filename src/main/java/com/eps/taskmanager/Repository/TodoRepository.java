package com.eps.taskmanager.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository extends CrudRepository<Todo, Long> {
}
