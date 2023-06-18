package com.simform.studentsystem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.w3c.dom.ls.LSInput;

import java.util.List;

@Entity
@Data
@Table(name = "address")
public class Address {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  @Column(name = "stree1")
  String street1;

  @Column(name = "city")
  String city;

  @Column(name = "state")
  String state;

  @JsonIgnore
  @ManyToMany(mappedBy = "address")
  private List<Student> students;



}
