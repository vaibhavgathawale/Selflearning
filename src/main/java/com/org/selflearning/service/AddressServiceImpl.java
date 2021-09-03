package com.org.selflearning.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.selflearning.dao.AddressDao;
import com.org.selflearning.entity.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressDao addressdao;

	@Override
	public JSONObject getAddress() {
		JSONObject finalJson = new JSONObject();
		JSONArray jArray = new JSONArray();
		try {
			List<Address> add = (List<Address>) addressdao.findAll();
			for (Address ad : add) {
				JSONObject js = new JSONObject();
				js.put("aId", ad.getaId());
				js.put("aLine1", ad.getaLine1());
				js.put("city", ad.getCity());
				js.put("state", ad.getState());
				js.put("type", ad.getType());
				jArray.put(js);

				finalJson.put("Address Details", jArray);
			}
		} catch (Exception e) {

		}
		return finalJson;
	}

	@Override
	public JSONObject saveAddress(Address address) {
		JSONObject jObj = new JSONObject();
		try {
			addressdao.save(address);
			jObj.put("Success", true);
		} catch (Exception e) {
			jObj.put("Exception caught at AddressImpl", false);
		}

		return jObj;
	}

	@Override
	public JSONObject deleteAddress(Address address) {
		JSONObject jSon = new JSONObject();
		try {
			addressdao.delete(address);
			jSon.put("Delete Successfully", true);
		}catch(Exception e){
			jSon.put("Exception caught while deleting address", false);
		}
		
		return jSon;
	}

}
