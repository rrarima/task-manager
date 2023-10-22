package com.eps.taskmanager.Repository;

import com.eps.taskmanager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
