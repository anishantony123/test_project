package com.pos.dto.masters;

public class AccountHeadDTO {
	private String accountCode;
	private String firstName;
	private String lastName;
	private String accountName;
	private AccountTypeDTO accountType;
	private String address;
	private String place;
	private String phone;
	private String secondaryPhone;
	private String email;
	private Double creditLimitAmt;
	private Long creditLimitDays;
	private Long noOfCreditDays;
	private Boolean enableLogin;
	private UserDTO user;
	/*private String username;
	private String password;*/
	private RolesDTO role;
	private String createdBy;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
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
	public AccountTypeDTO getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountTypeDTO accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getSecondaryPhone() {
		return secondaryPhone;
	}
	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getCreditLimitAmt() {
		return creditLimitAmt;
	}
	public void setCreditLimitAmt(Double creditLimitAmt) {
		this.creditLimitAmt = creditLimitAmt;
	}
	public Long getCreditLimitDays() {
		return creditLimitDays;
	}
	public void setCreditLimitDays(Long creditLimitDays) {
		this.creditLimitDays = creditLimitDays;
	}
	public Long getNoOfCreditDays() {
		return noOfCreditDays;
	}
	public void setNoOfCreditDays(Long noOfCreditDays) {
		this.noOfCreditDays = noOfCreditDays;
	}
	public Boolean getEnableLogin() {
		return enableLogin;
	}
	public void setEnableLogin(Boolean enableLogin) {
		this.enableLogin = enableLogin;
	}
	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public RolesDTO getRole() {
		return role;
	}
	public void setRole(RolesDTO role) {
		this.role = role;
	}
	
	

}
