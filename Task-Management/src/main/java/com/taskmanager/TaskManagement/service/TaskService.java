package com.taskmanager.TaskManagement.service;
import com.taskmanager.TaskManagement.enitity.Task;
import com.taskmanager.TaskManagement.enitity.User;
import com.taskmanager.TaskManagement.repository.TaskRepository;
import com.taskmanager.TaskManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    @Autowired
      private UserRepository userRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task assignTaskToUser(Long taskId, Long userId) {
        Task task = taskRepository.findById(taskId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        if (task != null && user != null) {
            task.setAssignee(user);
            return taskRepository.save(task);
        }
        return null;
    }

    // Additional methods for updating and deleting tasks
}