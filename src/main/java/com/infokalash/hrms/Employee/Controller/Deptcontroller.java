package com.infokalash.hrms.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infokalash.hrms.Employee.Departement.Service.DeptInterface;
import com.infokalash.hrms.Employee.Model.DepartementModel;
import com.infokalash.hrms.Employee.Model.EmployeeModel;

@RestController
@RequestMapping("/departement")
public class Deptcontroller {
	
	@Autowired
	DeptInterface services;
	
	
	@PostMapping("/save")
	public ResponseEntity<DepartementModel> createemp(@RequestBody DepartementModel dept){
		DepartementModel departement = services.create(dept);
		return new ResponseEntity<>(departement , HttpStatus.CREATED);
		
	}
	
	

}
