package com.org.selflearning.service;

import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.selflearning.dao.DeparmentDao;
import com.org.selflearning.dao.EmployeeDao;
import com.org.selflearning.entity.Department;
import com.org.selflearning.entity.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DeparmentDao deparmentDao;
	@Autowired
	EmployeeDao employeeDao;
	

	@Override
	public JSONObject getDeparmentlist() {
		JSONObject finaljson = new JSONObject();
		JSONArray jArray = new JSONArray();
		JSONObject tJson = null;
		JSONArray jArrayEmp = null;
		Set<Employee> empSet = null;
		try {
			// Set<Department> depList = (Set<Department>)deparmentDao.findAll();
			List<Department> depList = (List<Department>) deparmentDao.findAll();
			//Set<Employee> empSet = (Set<Employee>) employeeDao.findAll();
			for (Department dep : depList) {
				tJson = new JSONObject();
				jArrayEmp = new JSONArray();
				
				tJson.put("deptId", dep.getDeptId());
				tJson.put("deptName", dep.getDeptName());
				tJson.put("deptRevenue", dep.getDeptRevenue() );
				
				
//				empSet = dep.getEmployee();
//				for(Employeeold emp : empSet) {
//					JSONObject empJson = new JSONObject();
//					empJson.put("eId", emp.geteId());
//					//empJson.put("eName", emp.geteName());
//					empJson.put("eSalary", emp.geteSalary());
//					empJson.put("eDeptName", emp.getDepartment().getdName());
//					jArrayEmp.put(empJson);
//				}
				
				tJson.put("employeeArray", jArrayEmp);
				//tJson.put("eId", dep.getEmployees().);
				jArray.put(tJson);
			}
			
			finaljson.put("success", true);
			finaljson.put("departmentDetails", jArray);
			//finaljson.put("employeeDetailInDept", jArrayEmp);
			finaljson.put("departmentCount", jArray.length());
		} catch (Exception e) {
			System.out.println("Exception caught at Departmrnt Service Class");
		}

		return finaljson;
	}

	@Override
	public JSONObject saveDepartment(Department department) {
		JSONObject jObject = new JSONObject();

		try {
			deparmentDao.save(department);
			jObject.put("Department save Successfully", true);
		} catch (Exception e) {
			System.out.println("Exception caught at Department Service while save" + e);
		}

		return jObject;
	}

	@Override
	public JSONObject deleteDepartment(String deptId) {
           JSONObject jObj = new JSONObject();  
		try {
			deparmentDao.deleteById(deptId);
			jObj.put("Delete Successfully..!", true);
		    } catch (Exception e) {
			System.out.println("Exception caught while delete Department at Service Level");
		}
		return jObj;
	}

	
}
