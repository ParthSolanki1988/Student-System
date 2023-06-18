package com.simform.projectmanagmentsystem.Controller;

import com.simform.projectmanagmentsystem.Entity.Project;
import com.simform.projectmanagmentsystem.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

  @Autowired
  ProjectService projectService;

  @PostMapping
  public ResponseEntity<Project> saveProject(@RequestBody Project project){
    project= projectService.createProject(project);
    return new ResponseEntity<>(project , HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteProject(@PathVariable Long id){
    projectService.deleteProject(id);
    return ResponseEntity.ok("deleted project of id " + id);
  }
}
