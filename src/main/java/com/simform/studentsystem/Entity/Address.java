package com.simform.studentsystem.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

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



}
