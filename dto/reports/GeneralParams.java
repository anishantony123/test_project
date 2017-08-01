package com.pos.dto.reports;

import com.pos.util.CompanyProperties;

public class GeneralParams {
	String company = CompanyProperties.company;
	String address = CompanyProperties.address;
	String email= CompanyProperties.email; 
	String phone;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
