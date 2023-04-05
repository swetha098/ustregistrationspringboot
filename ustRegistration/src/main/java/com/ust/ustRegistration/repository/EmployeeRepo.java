package com.ust.ustRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.ustRegistration.model.Employee;



public interface EmployeeRepo extends JpaRepository<Employee,Integer >{

}
