package com.simform.studentsystem.Service;

import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  public Student creatStudet(Student student) {
    return studentRepository.save(student);
  }
}
