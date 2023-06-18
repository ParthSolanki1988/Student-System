package com.simform.studentsystem.Controller;

import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

  @Autowired
  StudentService studentService;

  @GetMapping
  public ResponseEntity<List<Student>> getAllStudent(){
    List<Student> studentList = studentService.getAll();
    return new ResponseEntity<>(studentList, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Student> saveStudent(@RequestBody Student student){
    student = studentService.creatStudet(student);
    return new ResponseEntity<>(student , HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteAddress(@PathVariable Integer id){
    studentService.deleteStudent(id);
    return ResponseEntity.ok("deleted student of id " + id);
  }

  @PutMapping("/{stu_id}/address/{add_id}")
  public ResponseEntity<String> assignAddresstoStudent(@PathVariable Integer stu_id , @PathVariable Long add_id){
    studentService.assignAddressToStudent(stu_id, add_id);
    return ResponseEntity.ok("asssign address id : " + add_id + " To the Student Id : " + stu_id);
  }
}
