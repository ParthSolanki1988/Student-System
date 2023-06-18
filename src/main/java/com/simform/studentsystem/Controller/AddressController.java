package com.simform.studentsystem.Controller;

import com.simform.studentsystem.Entity.Address;
import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Service.AddressService;
import com.simform.studentsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {

  @Autowired
  AddressService addressService;

  @PostMapping
  public ResponseEntity<Address> saveAddress(@RequestBody Address address){
    address= addressService.createAddress(address);
    return new ResponseEntity<>(address , HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteAddress(@PathVariable Long id){
    addressService.deleteAddress(id);
    return ResponseEntity.ok("deleted addresss of id " + id);
  }
}
