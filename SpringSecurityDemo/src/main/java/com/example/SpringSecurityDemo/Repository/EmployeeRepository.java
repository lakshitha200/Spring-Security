package com.example.SpringSecurityDemo.Repository;

import com.example.SpringSecurityDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findByUsername(String username);
}
