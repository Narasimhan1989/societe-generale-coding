package com.sg.example.employeeresgistration.service;

import com.sg.example.employeeresgistration.domain.Employee;

public interface EmployeeRegistrationService {
	
	void registerAnEmployee(Employee emp);
	
	Iterable<Employee> listEmployees();
}
