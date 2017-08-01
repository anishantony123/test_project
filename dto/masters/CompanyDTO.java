package com.pos.dto.masters;

public class CompanyDTO {
	private Long companyCode;
	private String companyName;
	private Character source;
	private String createdBy;
	
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Long getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}
	public Character getSource() {
		return source;
	}
	public void setSource(Character source) {
		this.source = source;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	
	
	
	

}
