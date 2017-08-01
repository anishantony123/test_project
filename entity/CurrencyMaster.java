package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "CURRENCY_MASTER")
public class CurrencyMaster extends BaseEntity{
	

	@Id
	@Column(name = "CURRENCY_CODE")
	private Long currencyCode;
	
	@Column(name = "CURRENCY_NAME")
	private String currencyName;
	
	@Column(name = "IS_PRIMARY_CURRENCY")
	private Boolean primaryCurrency;
	
	@Column(name = "CALCULATION")
	private String calculation;
	
	@Column(name = "SOURCE")
	private Character source;
	
	@Column(name = "REFERENCE")
	private String reference;
	
	@Column(name = "STATUS")
	private Character status;
	
	

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
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

	public Character getSource() {
		return source;
	}

	public void setSource(Character source) {
		this.source = source;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
	

	
}
