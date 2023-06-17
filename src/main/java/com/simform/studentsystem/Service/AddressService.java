package com.simform.studentsystem.Service;

import com.simform.studentsystem.Entity.Address;
import com.simform.studentsystem.Entity.Student;
import com.simform.studentsystem.Repository.AddressRepository;
import com.simform.studentsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  @Autowired
  AddressRepository addressRepository;

  public Address createAddress(Address address) {
    return addressRepository.save(address);
  }
}
