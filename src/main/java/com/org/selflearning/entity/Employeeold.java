//package com.org.selflearning.entity;
//
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//@Entity
//public class Employeeold {
//	@Id
//	// @GeneratedValue(strategy = GenerationType.AUTO)
//	private int empId;
//	private String eName;
//	private String eSalary;
//	private String eAddress;
//	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = DepartmentOld.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "dId")
//	private DepartmentOld deptabc;
//	
//	private CompanyOld companyOld;
//	
//	
//	
//
//	public String geteAddress() {
//		return eAddress;
//	}
//
//	public void seteAddress(String eAddress) {
//		this.eAddress = eAddress;
//	}
//
//	public int geteId() {
//		return empId;
//	}
//
//	public void seteId(int eId) {
//		this.empId = eId;
//	}
//
//	public String getempName() {
//		return eName;
//	}
//
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
//
//	public String geteSalary() {
//		return eSalary;
//	}
//
//	public void seteSalary(String eSalary) {
//		this.eSalary = eSalary;
//	}
//
//	public DepartmentOld getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(DepartmentOld departmentOld) {
//		this.department = departmentOld;
//	}
//
//}
