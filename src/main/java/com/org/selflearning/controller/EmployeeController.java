package com.org.selflearning.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.selflearning.entity.Employee;
import com.org.selflearning.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// localhost:9092/employee/list
	@GetMapping("/list")
	public String getEmployee() {

		String result = "";
		try {
			JSONObject jobject = employeeService.getEmployee();
			result = jobject.toString();
		} catch (Exception e) {
			result = "Exceptio at server side. Please try again.";
			System.out.println("Error Caught at Controller while fetching employees list." + e);
		}

		return result;
	}

	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp) {
		String result = "";
		try { 
			JSONObject jobject = employeeService.saveEmployee(emp);
			result = jobject.toString();
		} catch (Exception e) {
			System.out.println("Error Caught at Controller while saving employee." + e);
		}

		return result;
	}
	
	@PostMapping("/save-new")
	public String saveEmployeeNew(@RequestBody Employee emp) {
		String result = "";
		try {			
			JSONObject jobject = employeeService.saveEmployee(emp);
			result = jobject.toString();
		} catch (Exception e) {
			System.out.println("Error Caught at Controller while saving employee." + e);
		}

		return result;
	}
	
    @DeleteMapping ("/delete")
	public String deleteEmployee(@RequestParam("eId")String eId) {
          String result = " "; 
    	try {
        	     JSONObject jObje = employeeService.deleteEmployee(eId);
        	     result = jObje.toString();
         }catch(Exception e) {
        	 System.out.println("Excetion Caught at Controller while Deleting Employee"+e);
         }
		return result;
	}
}
