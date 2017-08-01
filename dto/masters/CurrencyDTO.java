package com.pos.dto.masters;

import javax.persistence.Column;

public class CurrencyDTO {
	private Long currencyCode;
	private String currencyName;
	private Boolean primaryCurrency;
	private String calculation;
	private Character source;
	private String createdBy;
	
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Character getSource() {
		return source;
	}
	public void setSource(Character source) {
		this.source = source;
	}
	public Long getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(Long currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public Boolean getPrimaryCurrency() {
		return primaryCurrency;
	}
	public void setPrimaryCurrency(Boolean primaryCurrency) {
		this.primaryCurrency = primaryCurrency;
	}
	public String getCalculation() {
		return calculation;
	}
	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}
	
	

}
