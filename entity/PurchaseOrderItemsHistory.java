package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "PURCHASE_ORDER_ITEMS_HISTORY")
public class PurchaseOrderItemsHistory extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "PO_ITEM_ID")
	private Long poItemId;
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
	@JoinColumn(name="ITEM_MASTER_FK")
	ItemMaster itemMaster;
	@ManyToOne
	@JoinColumn(name="UNIT_MASTER_FK")
	UnitMaster unitMaster;
	@ManyToOne
	@JoinColumn(name="PO_HISTORY_FK")
	PurchaseOrderHistory poHistory;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPoItemId() {
		return poItemId;
	}
	public void setPoItemId(Long poItemId) {
		this.poItemId = poItemId;
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
	public PurchaseOrderHistory getPoHistory() {
		return poHistory;
	}
	public void setPoHistory(PurchaseOrderHistory poHistory) {
		this.poHistory = poHistory;
	}
	public FinancialYear getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}

}
