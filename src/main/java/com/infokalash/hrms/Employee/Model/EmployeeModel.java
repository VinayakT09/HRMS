package com.infokalash.hrms.Employee.Model;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="Employee_table")
public class EmployeeModel {

	@Id
	@GeneratedValue  (strategy = GenerationType.IDENTITY)
	private long empId;
	
	@Column (name = "firstName")
	private String firstName;
	
	@Column  (name = "lastName")
	private String lastName ;
	
	@Column  (name ="company")
	private String company;
	
	@Column  (name = "state")
	private String state;
	
	@Column  (name = "country")
	private String country;
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<DepartementModel>  departement  = new HashSet<>();

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public EmployeeModel(long empId, String firstName, String lastName, String company, String state, String country) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.state = state;
		this.country = country;
	}

	public Set<DepartementModel> getDepartement() {
		return departement;
	}

	public void setDepartement(Set<DepartementModel> departement) {
		this.departement = departement;
	}

	public EmployeeModel(Set<DepartementModel> departement) {
		super();
		this.departement = departement;
	}

	public EmployeeModel() {
		super();
	}


	
	
}
