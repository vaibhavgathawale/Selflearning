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

import com.org.selflearning.entity.Department;
import com.org.selflearning.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/list")
	public String getDeparmentlist() {

		String result = "";
		try {
			JSONObject jObj = departmentService.getDeparmentlist();
			// jObj.put(jObj, true);
			result = jObj.toString();

		} catch (Exception e) {
			System.out.println("Exception Caught at Controller Class" + e);
		}

		return result;
	}

	@PostMapping("/save")
	public String saveDeparmtnt(@RequestBody Department department) {
		String result = "";

		try {
			JSONObject jObj = departmentService.saveDepartment(department);
			result = jObj.toString();
		} catch (Exception e) {
			System.out.println("Exception caught while save Department" + e);
		}

		return result;
	}
	
    @DeleteMapping ("/delete")
	public String deleteDepartment(@RequestParam("deptId") String deptId) {
		String result = "";
		try {
			JSONObject jObj1 = departmentService.deleteDepartment(deptId);
			result = jObj1.toString();
		} catch (Exception e) {
			System.out.println("Exception caught while Delete Department at Controller layer");
		}

		return result;

	}
}
