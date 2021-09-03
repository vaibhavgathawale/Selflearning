package com.org.selflearning.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.selflearning.entity.Address;
import com.org.selflearning.service.AddressService;

@RestController
@RequestMapping("address")
public class AdressController {

	@Autowired
	AddressService addressservice;

	@GetMapping("/list")
	public String getAddress() {
	String	finalresult = "";
		try {
			JSONObject result = addressservice.getAddress();
			    finalresult = result.toString();
		} catch (Exception e) {
			System.out.println("Exception Caught at AddressController");
		}

		return finalresult;

	}
    @PostMapping("/save")
	public String saveAddress(@RequestBody Address address) {
		String finalresult ="";
		try {
			 JSONObject jSon1 = addressservice.saveAddress(address);
			finalresult = jSon1.toString();
		}catch(Exception e) {
			System.out.println("Error caught while saving Address");
		}
		return finalresult;
	}
    @DeleteMapping ("/delete")
    public String deleteAddress(Address address) {
    	JSONObject jSon = new JSONObject();
    	String result = "";
    	try {
    	    addressservice.deleteAddress(address);
    	    jSon.put("Delete Success fully", true);
    	    result = jSon.toString();
    	}catch(Exception e) {
    		jSon.put("Exception Occured while deleting", false);
    	}
    	
    	
    	return result;
    }
}
