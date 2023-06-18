package com.simform.projectmanagmentsystem.Service;

import com.simform.projectmanagmentsystem.Entity.Project;
import com.simform.projectmanagmentsystem.Repository.EmployeeRepository;
import com.simform.projectmanagmentsystem.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

  @Autowired
  ProjectRepository projectRepository;

  @Autowired
  EmployeeRepository employeeRepository;

  public Project createProject(Project project) {
    return projectRepository.save(project);
  }

  public void deleteProject(Long id) {
    employeeRepository.deleteById(id);
  }

//  public void assignAddressToStudent(Long , Long addId) {
//    List<Address> addressList = null;
//    Student student = studentRepository.findById(stuId).get();
//    Address address = addressRepository.findById(addId).get();
//    addressList = student.getAddress();
//    addressList.add(address);
//    student.setAddress(addressList);
//    studentRepository.save(student);
//  }

  public List<Project> getAll() {
    return projectRepository.findAll();
  }
}
