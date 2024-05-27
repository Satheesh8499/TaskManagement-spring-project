package com.taskmanager.TaskManagement.controller;

import com.taskmanager.TaskManagement.enitity.Project;
import com.taskmanager.TaskManagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @PostMapping("/{projectId}/members/{userId}")
    public void addMemberToProject(@PathVariable Long projectId, @PathVariable Long userId) {
        projectService.addMemberToProject(projectId, userId);
    }


}
