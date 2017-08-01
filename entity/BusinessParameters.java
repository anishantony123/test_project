package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "BUSINESS_PARAMETERS")
public class BusinessParameters extends BaseEntity{
	@Id
	@Column(name = "PARAM_NAME")
	private String paramName;
	@Column(name = "COMPANY_ID")
	private Long company;
	@Column(name = "PARAM_VALUE")
	private String paramValue;
	
	public Long getCompany() {
		return company;
	}
	public void setCompany(Long company) {
		this.company = company;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	
	

}
