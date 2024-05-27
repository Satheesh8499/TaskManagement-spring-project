package com.taskmanager.TaskManagement.service;

import com.taskmanager.TaskManagement.enitity.Project;
import com.taskmanager.TaskManagement.enitity.User;
import com.taskmanager.TaskManagement.repository.ProjectRepository;
import com.taskmanager.TaskManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public void addMemberToProject(Long projectId, Long userId) {
        Project project = projectRepository.findById(projectId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        if (project != null && user != null) {
            project.getMembers().add(user);
            projectRepository.save(project);
        }
    }

    // Additional methods for updating and deleting projects
}
