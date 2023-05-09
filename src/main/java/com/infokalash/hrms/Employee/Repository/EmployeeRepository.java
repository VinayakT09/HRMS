package com.infokalash.hrms.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.Employee.Model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeModel , Long>{

   

	

}
