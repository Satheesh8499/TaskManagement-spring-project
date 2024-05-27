package com.taskmanager.TaskManagement.repository;


import com.taskmanager.TaskManagement.enitity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
