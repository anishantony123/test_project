package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SALES_RETURN_ITEMS_HISTORY")
public class SalesReturnItemsHistory {

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "SR_ID")
	private Long srId;
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
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	
	public Boolean getIncludeTax() {
		return includeTax;
	}
	public void setIncludeTax(Boolean includeTax) {
		this.includeTax = includeTax;
	}
	
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Long getSrId() {
		return srId;
	}
	public void setSrId(Long srId) {
		this.srId = srId;
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
	public FinancialYear getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
