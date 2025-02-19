package com.org.selflearning.service;

import org.json.JSONObject;

import com.org.selflearning.entity.Employee;

public interface EmployeeService {

	public JSONObject getEmployee();

	public JSONObject saveEmployee(Employee emp);

	public JSONObject deleteEmployee(String eId);
}
