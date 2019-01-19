package com.sg.example.employeeresgistration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.example.employeeresgistration.dao.EmployeeRegistrationDao;
import com.sg.example.employeeresgistration.domain.Employee;
import com.sg.example.employeeresgistration.service.EmployeeRegistrationService;

@Service
public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService{

	@Autowired
	private EmployeeRegistrationDao repository;
	
	@Override
	public void registerAnEmployee(Employee emp) {
		repository.save(emp);
	}

	@Override
	public Iterable<Employee> listEmployees() {
		return repository.findAll();
		
	}

}
