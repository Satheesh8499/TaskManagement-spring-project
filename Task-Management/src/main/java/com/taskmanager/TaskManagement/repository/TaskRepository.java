package com.taskmanager.TaskManagement.repository;


import com.taskmanager.TaskManagement.enitity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
