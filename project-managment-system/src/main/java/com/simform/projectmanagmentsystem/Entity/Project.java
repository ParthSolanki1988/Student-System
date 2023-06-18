package com.simform.projectmanagmentsystem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "project")
public class Project {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  @Column(name = "name")
  String name;

  @JsonIgnore
  @ManyToMany(mappedBy = "assignedProject")
  private List<Employee> employees;



}
