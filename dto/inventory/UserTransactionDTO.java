package com.pos.dto.inventory;

import java.util.Date;

import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;

public class UserTransactionDTO{
	private Long id;
	private Date activityDate;
	private AccountHeadDTO customer;
	private String paymentType;
	private String paymentMethod;
	private Double amount;
	private String userRemarks;
	private CurrencyDTO currency;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}
	
	
	
	public AccountHeadDTO getCustomer() {
		return customer;
	}
	public void setCustomer(AccountHeadDTO customer) {
		this.customer = customer;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getUserRemarks() {
		return userRemarks;
	}
	public void setUserRemarks(String userRemarks) {
		this.userRemarks = userRemarks;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	
	

}
