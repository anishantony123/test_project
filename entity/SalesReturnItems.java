package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "SALES_RETURN_ITEMS")
public class SalesReturnItems extends BaseEntity{

	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "QTY")
	private Long qty;
	@Column(name = "UNIT_AMT")
	private Double unitAmount;
	@Column(name = "DISCOUNT_AMT")
	private Double discountAmount;
	@Column(name = "TAX")
	private Double tax;
	@Column(name = "INCLUDE_TAX")
	private Boolean includeTax;
	@Column(name = "TAX_UNIT")
	private Character taxUnit;
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
	@Column(name = "TOTAL_AMT")
	private Double totalAmt;
	

	@ManyToOne
	@JoinColumn(name="SALES_RETURN_FK")
	private SalesReturn salesReturn;
	@ManyToOne
	@JoinColumn(name="ITEM_MASTER_FK")
	private ItemMaster itemMaster;
	@ManyToOne
	@JoinColumn(name="UNIT_MASTER_FK")
	private UnitMaster unitMaster;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Double getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(Double unitAmount) {
		this.unitAmount = unitAmount;
	}
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Boolean getIncludeTax() {
		return includeTax;
	}
	public void setIncludeTax(Boolean includeTax) {
		this.includeTax = includeTax;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public SalesReturn getSalesReturn() {
		return salesReturn;
	}
	public void setSalesReturn(SalesReturn salesReturn) {
		this.salesReturn = salesReturn;
	}
	public ItemMaster getItemMaster() {
		return itemMaster;
	}
	public void setItemMaster(ItemMaster itemMaster) {
		this.itemMaster = itemMaster;
	}
	public UnitMaster getUnitMaster() {
		return unitMaster;
	}
	public void setUnitMaster(UnitMaster unitMaster) {
		this.unitMaster = unitMaster;
	}
	public FinancialYear getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
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
