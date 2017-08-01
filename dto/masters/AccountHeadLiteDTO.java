package com.pos.dto.masters;

public class AccountHeadLiteDTO {
	private Long accountCode;
	private String firstName;
	private String lastName;
	private String accountName;
	private String createdBy;


	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Long getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(Long accountCode) {
		this.accountCode = accountCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	

}
