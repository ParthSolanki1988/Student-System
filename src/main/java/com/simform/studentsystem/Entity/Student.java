package com.simform.studentsystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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


//  @OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "fk_address_id")

  //one student have many addresses
//  @OneToMany(cascade = CascadeType.ALL)
//  @JoinColumn(name = "fk_student_id" , referencedColumnName = "id")

  //one student have many addresses and one address have many students

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "stu_add_fk",
      joinColumns = @JoinColumn(name = "stu_id"),
      inverseJoinColumns = @JoinColumn(name = "add_id")
  )
  private List<Address> address;
}
