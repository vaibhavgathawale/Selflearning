package com.org.selflearning.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.selflearning.dao.CompanyDao;
import com.org.selflearning.entity.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyDao companyDao;

	@Override
	public JSONObject getCompanyList() {
		JSONObject finaljson = new JSONObject();
		JSONArray jArray = new JSONArray();
		try {
			List<Company> cmp = (List<Company>) companyDao.findAll();
			for (Company cmpIterate : cmp) {
				JSONObject jSon = new JSONObject();
				jSon.put("compId", cmpIterate.getCompId() );
				jSon.put("compName", cmpIterate.getCompName() );
				jSon.put("compLocation", cmpIterate.getCompLocation() );
				jSon.put("compUrl", cmpIterate.getCompUrl());
				jSon.put("compEmail", cmpIterate.getCompEmail() );
				jSon.put("compRevenue", cmpIterate.getCompRevenue() );
				jArray.put(jSon);
			}
			finaljson.put("Success", true);
			finaljson.put("Details Of Company", jArray);
			finaljson.put("Count Of Companies", jArray.length());

		} catch (Exception e) {
			System.out.println("Error caught at Company Service level");
		}

		return finaljson;
	}

	@Override
	public JSONObject saveCompany(Company company) {
		JSONObject resultJObj = new JSONObject();
		try {
			companyDao.save(company);
			resultJObj.put("success", true);
		} catch (Exception e) {
			resultJObj.put("success", false);
			resultJObj.put("errorMsg", "Error occurred while saving company object");
		}
		return resultJObj;
	}
	
	

}
