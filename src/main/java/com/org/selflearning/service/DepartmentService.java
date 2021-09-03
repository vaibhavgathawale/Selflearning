package com.org.selflearning.service;

import org.json.JSONObject;

import com.org.selflearning.entity.Department;

public interface DepartmentService {

	public JSONObject getDeparmentlist();
	
	public JSONObject saveDepartment(Department department);
	
	public JSONObject deleteDepartment(String deptId);

}
