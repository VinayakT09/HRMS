package com.infokalash.hrms.Employee.Departement.Service;

import org.springframework.stereotype.Service;

import com.infokalash.hrms.Employee.Model.DepartementModel;

@Service
public interface DeptInterface {

	
	//Interface
	public DepartementModel create (DepartementModel dept);
	
	
}
