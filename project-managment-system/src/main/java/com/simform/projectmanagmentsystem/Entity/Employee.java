package com.simform.projectmanagmentsystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.security.auth.callback.LanguageCallback;
import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  @Column(name = "name")
  String name;


  @ManyToMany
  @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "proj_id"))
  private List<Project> assignedProject;


}
