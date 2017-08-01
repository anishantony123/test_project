package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "ITEM_GROUP")
public class ItemGroup extends BaseEntity{
	
	@Id
	@Column(name = "GROUP_CODE")
	private Long groupCode;
	
	@Column(name = "GROUP_NAME")
	private String groupName;
	
	@Column(name = "STATUS")
	private Character status;
	
	@Column(name = "TAX_RATE")
	private Double taxRate;
	
	@Column(name = "TAX_UNIT")
	private Character taxUnit;
	
	@Column(name = "SOURCE")
	private Character source;
	
	@Column(name = "REFERENCE")
	private String reference;
	
	@Column(name = "TAX_TYPE")
	private Character taxType;
	
	@Column(name = "INTEGRATED_TAX")
	private Double integratedTax;
	
	@Column(name = "STATE_TAX")
	private Double stateTax;
	
	@Column(name = "CENTRAL_TAX")
	private Double centralTax;
	
	@Column(name = "CESS")
	private Double cess;

	public Long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
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

	

	public Character getTaxType() {
		return taxType;
	}

	public void setTaxType(Character taxType) {
		this.taxType = taxType;
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

	public Double getCess() {
		return cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	} 
	
	
	
	

	
}
