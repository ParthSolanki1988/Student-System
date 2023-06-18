package com.simform.projectmanagmentsystem.Service;

import com.simform.projectmanagmentsystem.Entity.Employee;
import com.simform.projectmanagmentsystem.Entity.Project;
import com.simform.projectmanagmentsystem.Repository.EmployeeRepository;
import com.simform.projectmanagmentsystem.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Autowired
  ProjectRepository projectRepository;

  public Employee createEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  public List<Employee> getAll(){
    return employeeRepository.findAll();
  }

  public void deleteEmployee(Long id){
    employeeRepository.deleteById(id);
  }


  public Employee assignProjectToEmployee(Long empId, Long projId) {
    List<Project> projectList = null;
    Employee employee = employeeRepository.findById(empId).get();
    Project project = projectRepository.findById(projId).get();
    projectList = employee.getAssignedProject();
    projectList.add(project);
    employee.setAssignedProject(projectList);
    return employeeRepository.save(employee);
  }
}
