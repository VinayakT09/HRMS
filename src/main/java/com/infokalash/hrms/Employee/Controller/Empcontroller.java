package com.infokalash.hrms.Employee.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infokalash.hrms.Employee.Model.EmployeeModel;
import com.infokalash.hrms.Employee.Service.EmpInterface;


@RestController
@RequestMapping("/employee")
public class Empcontroller {

	@Autowired
	EmpInterface service;
	
	@PostMapping("/create")
	public ResponseEntity<EmployeeModel> createemp(@RequestBody EmployeeModel empl){
		EmployeeModel employee = service.create(empl);
		return new ResponseEntity<>(employee , HttpStatus.CREATED);
		
	}
	
}
