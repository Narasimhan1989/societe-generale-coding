package com.sg.example.employeeresgistration.dao;

import org.springframework.data.repository.CrudRepository;

import com.sg.example.employeeresgistration.domain.Employee;

public interface EmployeeRegistrationDao extends CrudRepository<Employee, Long>{

}
