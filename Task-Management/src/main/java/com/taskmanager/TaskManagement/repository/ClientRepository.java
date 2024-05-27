package com.taskmanager.TaskManagement.repository;

import com.taskmanager.TaskManagement.enitity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
