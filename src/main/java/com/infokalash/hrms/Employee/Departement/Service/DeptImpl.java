package com.infokalash.hrms.Employee.Departement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.Employee.Model.DepartementModel;
import com.infokalash.hrms.Employee.Repository.DepartementRepository;

@Service
public class DeptImpl  implements DeptInterface{

	@Autowired
	DepartementRepository deptRepo;
	
	
	@Override
	public DepartementModel create(DepartementModel dept) {
	return deptRepo.save(dept);
	}
	
	

}
