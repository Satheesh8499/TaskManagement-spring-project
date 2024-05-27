package com.taskmanager.TaskManagement.controller;

import com.taskmanager.TaskManagement.enitity.Task;
import com.taskmanager.TaskManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PostMapping("/{taskId}/assign/{userId}")
    public Task assignTaskToUser(@PathVariable Long taskId, @PathVariable Long userId) {
        return taskService.assignTaskToUser(taskId, userId);
    }

    // Additional endpoints for updating and deleting tasks
}
