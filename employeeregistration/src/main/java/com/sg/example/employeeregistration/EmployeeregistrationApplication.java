package com.sg.example.employeeregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.sg.example.employeeresgistration"})
@EntityScan(basePackages={"com.sg.example.employeeresgistration.domain"})
@EnableJpaRepositories(basePackages={"com.sg.example.employeeresgistration.dao"})
public class EmployeeregistrationApplication{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeregistrationApplication.class, args);
	}

}

