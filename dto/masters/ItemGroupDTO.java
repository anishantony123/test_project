package com.pos.dto.masters;

import javax.persistence.Column;

public class ItemGroupDTO {
	private Long groupCode;
	private String groupName;
	private Double taxRate;
	private Character taxUnit;
	private Character taxType;
	private Double cess;
	private Double integratedTax;
	private Double stateTax;
	private Double centralTax;
	private String createdBy;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Long getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}
	public Character getTaxType() {
		return taxType;
	}
	public void setTaxType(Character taxType) {
		this.taxType = taxType;
	}
	public Double getCess() {
		return cess;
	}
	public void setCess(Double cess) {
		this.cess = cess;
	}
	public Double getIntegratedTax() {
		return integratedTax;
	}
	public void setIntegratedTax(Double integratedTax) {
		this.integratedTax = integratedTax;
	}
	public Double getStateTax() {
		return stateTax;
	}
	public void setStateTax(Double stateTax) {
		this.stateTax = stateTax;
	}
	public Double getCentralTax() {
		return centralTax;
	}
	public void setCentralTax(Double centralTax) {
		this.centralTax = centralTax;
	}
	
	
	
	

}
