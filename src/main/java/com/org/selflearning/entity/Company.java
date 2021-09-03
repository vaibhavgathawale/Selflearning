package com.org.selflearning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
	private String compId;
    private String compName;
    private String compLocation;
    private String compUrl;
    private String compEmail;
    private String compRevenue;
	
    
    public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompLocation() {
		return compLocation;
	}
	public void setCompLocation(String compLocation) {
		this.compLocation = compLocation;
	}
	public String getCompUrl() {
		return compUrl;
	}
	public void setCompUrl(String compUrl) {
		this.compUrl = compUrl;
	}
	public String getCompEmail() {
		return compEmail;
	}
	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}
	public String getCompRevenue() {
		return compRevenue;
	}
	public void setCompRevenue(String compRevenue) {
		this.compRevenue = compRevenue;
	}
    
    
    
}
