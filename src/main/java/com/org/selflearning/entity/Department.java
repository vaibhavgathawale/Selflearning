package com.org.selflearning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
	private String deptId;
	private String deptName;
	private String deptRevenue;
	
	
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptRevenue() {
		return deptRevenue;
	}
	public void setDeptRevenue(String deptRevenue) {
		this.deptRevenue = deptRevenue;
	}
}
