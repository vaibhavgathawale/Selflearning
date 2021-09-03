//package com.org.selflearning.entity;
//
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class DepartmentOld {
//
//	@Id
//	private int deptId;
//	private String dName;
//	private String dManager;
//	private String dWork;
//
//	@OneToMany(mappedBy = "deptabc", fetch = FetchType.LAZY)
//	private Set<Employeeold> employeeold;
//
//	public int getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//
//	public String getdName() {
//		return dName;
//	}
//
//	public void setdName(String dName) {
//		this.dName = dName;
//	}
//
//	public String getdManager() {
//		return dManager;
//	}
//
//	public void setdManager(String dManager) {
//		this.dManager = dManager;
//	}
//
//	public String getdWork() {
//		return dWork;
//	}
//
//	public void setdWork(String dWork) {
//		this.dWork = dWork;
//	}
//
//	public Set<Employeeold> getEmployee() {
//		return employeeold;
//	}
//
//	public void setEmployee(Set<Employeeold> employeeold) {
//		this.employeeold = employeeold;
//	}
//
//}
