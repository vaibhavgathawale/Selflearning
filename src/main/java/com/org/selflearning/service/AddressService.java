package com.org.selflearning.service;

import org.json.JSONObject;

import com.org.selflearning.entity.Address;

public interface AddressService {

	public JSONObject getAddress();
	
	public JSONObject saveAddress(Address address);
	 
	public JSONObject deleteAddress(Address address);
	
}
