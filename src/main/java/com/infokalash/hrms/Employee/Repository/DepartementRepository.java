package com.infokalash.hrms.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.Employee.Model.DepartementModel;

@Repository
public interface DepartementRepository  extends JpaRepository <DepartementModel , Long>{

	
	
}
