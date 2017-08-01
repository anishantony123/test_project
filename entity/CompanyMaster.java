package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "COMPANY_MASTER")
public class CompanyMaster extends BaseEntity{

	@Id
	@Column(name = "COMPANY_CODE")
	private Long companyCode;

	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "SOURCE")
	private Character source;
	
	@Column(name = "STATUS")
	private Character status;
	
	@Column(name = "IS_PRIMARY_COMPANY")
	private Boolean primaryCompany;
	
	@Column(name = "REFERENCE")
	private String reference;

	

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Long getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Character getSource() {
		return source;
	}

	public void setSource(Character source) {
		this.source = source;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Boolean getPrimaryCompany() {
		return primaryCompany;
	}

	public void setPrimaryCompany(Boolean primaryCompany) {
		this.primaryCompany = primaryCompany;
	}
	
	
	
	
	
	
	
	
	
}
