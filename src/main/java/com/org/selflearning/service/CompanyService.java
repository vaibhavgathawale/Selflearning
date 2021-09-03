package com.org.selflearning.service;

import org.json.JSONObject;

import com.org.selflearning.entity.Company;

public interface CompanyService {

	public JSONObject getCompanyList();
	
	public JSONObject saveCompany(Company company);
	
}
