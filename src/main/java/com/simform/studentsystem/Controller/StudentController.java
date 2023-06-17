package com.simform.studentsystem.Controller;

import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

  @Autowired
  StudentService studentService;

  @PostMapping
  public ResponseEntity<Student> saveStudent(@RequestBody Student student){
    student = studentService.creatStudet(student);
    return new ResponseEntity<>(student , HttpStatus.CREATED);
  }
}
