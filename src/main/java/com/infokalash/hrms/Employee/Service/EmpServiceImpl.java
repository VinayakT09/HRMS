package com.infokalash.hrms.Employee.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.Employee.Model.EmployeeModel;
import com.infokalash.hrms.Employee.Repository.EmployeeRepository;


@Service
public class EmpServiceImpl implements EmpInterface {

	@Autowired
	EmployeeRepository repository;
	
	
	//method to create and insert an employee details
	@Override
	public EmployeeModel create(EmployeeModel empl) {
		return repository.save(empl);
	}


	


	
	

	

}
