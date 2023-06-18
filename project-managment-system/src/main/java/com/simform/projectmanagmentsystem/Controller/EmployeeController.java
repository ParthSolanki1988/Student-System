package com.simform.projectmanagmentsystem.Controller;

import com.simform.projectmanagmentsystem.Entity.Employee;
import com.simform.projectmanagmentsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @GetMapping
  public ResponseEntity<List<Employee>> getAllStudent(){
    List<Employee> employeeList = employeeService.getAll();
    return new ResponseEntity<>(employeeList, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Employee> saveStudent(@RequestBody Employee employee){
    employee = employeeService.createEmployee(employee);
    return new ResponseEntity<>(employee , HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
    employeeService.deleteEmployee(id);
    return ResponseEntity.ok("deleted employee of id " + id);
  }

  @PutMapping("/{emp_id}/project/{proj_id}")
  public ResponseEntity<String> assignProjectToEmployee(@PathVariable Long emp_id , @PathVariable Long proj_id){
    employeeService.assignProjectToEmployee(emp_id, proj_id);
    return ResponseEntity.ok("asssign project id : " + proj_id + " To the Employee Id : " + emp_id);
  }
}
