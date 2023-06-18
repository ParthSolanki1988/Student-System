package com.simform.studentsystem.Service;

import com.simform.studentsystem.Entity.Address;
import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Repository.AddressRepository;
import com.simform.studentsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  AddressRepository addressRepository;

  public Student creatStudet(Student student) {
    return studentRepository.save(student);
  }

  public void deleteStudent(Integer id) {
    studentRepository.deleteById(id);
  }

  public void assignAddressToStudent(Integer stuId, Long addId) {
    List<Address> addressList = null;
    Student student = studentRepository.findById(stuId).get();
    Address address = addressRepository.findById(addId).get();
    addressList = student.getAddress();
    addressList.add(address);
    student.setAddress(addressList);
    studentRepository.save(student);
  }

  public List<Student> getAll() {
    return studentRepository.findAll();
  }
}
