package com.infokalash.hrms.Employee.Service;

import org.springframework.stereotype.Service;

import com.infokalash.hrms.Employee.Model.EmployeeModel;


@Service
public interface EmpInterface {

	
	//Interface to create and insert an employee details
	 public EmployeeModel create(EmployeeModel empl);
}
