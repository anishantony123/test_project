 package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "ACCOUNT_HEAD")
public class AccountHead extends BaseEntity{
	
	@Id
	@Column(name = "ACC_CODE")
	private Long accountCode;
	@Column(name = "ACC_NAME")
	private String accountName;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "SEC_PHONE")
	private String secondaryPhone;
	@Column(name = "EMAIL")
	private String email;	
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "CREDIT_LIMIT_AMT")
	private Double creditLimitAmt;
	@Column(name = "CREDIT_LIMIT_DAYS")
	private Long creditLimitDays;
	@Column(name = "SOURCE")
	private Character source;
	@Column(name = "GSTIN")
	private String gstin;
	@ManyToOne
	@JoinColumn(name="ACCOUNT_TYPE_FK")
	private AccountType accountType;
	
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	
	public Long getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(Long accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
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
	public Character getSource() {
		return source;
	}
	public void setSource(Character source) {
		this.source = source;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	
	
	
	
	
	
	
	
}
