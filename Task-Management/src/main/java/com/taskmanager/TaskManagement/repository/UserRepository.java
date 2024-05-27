package com.taskmanager.TaskManagement.repository;

import com.taskmanager.TaskManagement.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
