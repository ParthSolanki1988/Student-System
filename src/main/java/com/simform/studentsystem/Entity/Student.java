package com.simform.studentsystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;

  @Column(name = "name")
  String name;


  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_address_id")
  private Address address;
}
