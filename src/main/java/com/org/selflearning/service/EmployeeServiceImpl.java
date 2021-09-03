package com.org.selflearning.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.selflearning.dao.AddressDao;
import com.org.selflearning.dao.EmployeeDao;
import com.org.selflearning.entity.Address;
import com.org.selflearning.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	AddressDao addressDao;
	

	@Override
	public JSONObject getEmployee()  {
		JSONObject finalJson = new JSONObject();
		JSONArray jArray = new JSONArray();
		try {
			JSONArray jArrayaddress = new JSONArray();
			JSONObject addressJson = new JSONObject();
			
			// Iterable<Employee> emplist = employeeDao.findAll();
			List<Employee> emplist = (List<Employee>) employeeDao.findAll();
			for (Employee emp : emplist) {
				jArrayaddress = new JSONArray();
				JSONObject empJson = new JSONObject();
				empJson.put("EmpFName", emp.getEmpFName() );
				empJson.put("EmpLName", emp.getEmpLName() );
				empJson.put("EmpEmailId", emp.getEmpEmailId() );
				empJson.put("empGender", emp.getEmpGender());
				List<Address> addressL = emp.getAddressList();
				for(Address ad:addressL) {
					addressJson = new JSONObject();
					
					addressJson.put("city", ad.getCity());
					addressJson.put("state", ad.getState());
					addressJson.put("addLineOne", ad.getaLine1());
					jArrayaddress.put(addressJson);
				}
				empJson.put("newAddress", jArrayaddress);
				
				jArray.put(empJson);
			}

			finalJson.put("success", true);
			finalJson.put("empDetails", jArray);
			finalJson.put("totalEmpCount", jArray.length());
			//finalJson.put("addressList", jArrayaddress);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return finalJson;
	}

	@Override
	public JSONObject saveEmployee(Employee emp) {
		JSONObject jObj = new JSONObject();
		
		try {
			employeeDao.save(emp);
			
			jObj.put("success", true);
		} catch (Exception e) {
			System.out.println("This exception while adding Employee" + e);
			jObj.put("success", false);
			jObj.put("errorMsg", "Error occurred while saving employee. Try again later.");
		}
		return jObj;
	}

	@Override
	public JSONObject deleteEmployee(String eId) {
           JSONObject jObj = new JSONObject();
		try {
			employeeDao.deleteById(eId);
			jObj.put("Delete Employee Successfully...", true);
		
		}catch(Exception e){
			System.out.println("Exception Caught while Deleting Employee..");
		}
		return jObj;
	}
     
	
	

	
}
