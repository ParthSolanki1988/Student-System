package com.simform.studentsystem.Repository;

import com.simform.studentsystem.Entity.Address;
import com.simform.studentsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
