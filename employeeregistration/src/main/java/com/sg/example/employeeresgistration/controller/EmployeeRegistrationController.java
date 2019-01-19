package com.sg.example.employeeresgistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.example.employeeresgistration.domain.Employee;
import com.sg.example.employeeresgistration.service.EmployeeRegistrationService;

@RestController
public class EmployeeRegistrationController {

	@Autowired
	EmployeeRegistrationService service;
	
	@PostMapping("/register")
	public void registerAnEmployee(@RequestBody Employee emp){
		service.registerAnEmployee(emp);
	}
	
	@GetMapping("/list")
	public Iterable<Employee> listEmpoyees(){
		return service.listEmployees();
	}
}
