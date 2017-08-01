package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "DETAILED_STOCK_STATUS")
public class DetailedStockStatus {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "REF_TYPE")
	private String referenceType;
	@Column(name = "REF_NO")
	private String referenceNo;
	@Column(name = "ACTION_TYPE")
	private String actionType;
	@Column(name = "NO_OF_UNIT")
	private Long noOfUnit;
	@Column(name = "ACTION_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actionDate;
	@ManyToOne
	@JoinColumn(name="UNIT_FK")
	private UnitMaster unit;
	@ManyToOne
	@JoinColumn(name="ITEM_FK")
	private ItemMaster item;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getReferenceType() {
		return referenceType;
	}
	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public Long getNoOfUnit() {
		return noOfUnit;
	}
	public void setNoOfUnit(Long noOfUnit) {
		this.noOfUnit = noOfUnit;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public UnitMaster getUnit() {
		return unit;
	}
	public void setUnit(UnitMaster unit) {
		this.unit = unit;
	}
	public ItemMaster getItem() {
		return item;
	}
	public void setItem(ItemMaster item) {
		this.item = item;
	}
	public FinancialYear getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	

}
