package com.org.selflearning.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.selflearning.entity.Company;
import com.org.selflearning.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyService companyService;

	@GetMapping("/list")
	public String getCompanyList() {
		String result = "";
		try {
			JSONObject jObj = companyService.getCompanyList();
			result = jObj.toString();

		} catch (Exception e) {
			System.out.println("Exception caught at COntroller layer Conmany Find");
		}
		return result;

	}

	@PostMapping("/save")
	public String saveCompany(@RequestParam Company company) {
		String result = "";
		try {
			JSONObject obj = companyService.saveCompany(company);
			result = obj.toString();
		} catch (Exception e) {
			System.out.println("Exception caught at Controller while save company");
		}

		return result;

	}

}
