package com.infokalash.hrms.Employee.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "Dept_table")
public class DepartementModel {

	@Id
	@GeneratedValue ( strategy = GenerationType.SEQUENCE, generator="deptId_sequence" )
	@SequenceGenerator(name="deptId_sequence", initialValue=1000,allocationSize=1 )
	private  long deptId;
	
	@Column (name = "departement")
	private String departement;
	
	@Column (name = "dateOfJoining")
	private Date dateOfJoining;
	
	@Column (name ="empId")
	private long empId;
	
	@Column (name = "salary")
	private long salary;

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public DepartementModel(long deptId, String departement, Date dateOfJoining, long empId, long salary) {
		super();
		this.deptId = deptId;
		this.departement = departement;
		this.dateOfJoining = dateOfJoining;
		this.empId = empId;
		this.salary = salary;
	}

	public DepartementModel() {
		super();
	}
	
	
	
	
}
