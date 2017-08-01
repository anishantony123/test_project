package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE_RETURN_ITEMS")
public class PurchaseReturnItems {

	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "QTY")
	private Long qty;
	@Column(name = "UNIT_SELL_PRICE")
	private Double unitSellPrice;
	@Column(name = "UNIT_BUY_PRICE")
	private Double unitBuyPrice;
	@Column(name = "INCLUDE_TAX")
	private Boolean includeTax;
	@Column(name = "DISCOUNT_AMT")
	private Double discountAmt;
	@Column(name = "TAX")
	private Double tax;
	@Column(name = "TOTAL_AMT")
	private Double totalAmt;
	
	@ManyToOne
	@JoinColumn(name="PURCHASE_RETURN_FK")
	PurchaseReturn purchaseReturn;
	@ManyToOne
	@JoinColumn(name="ITEM_MASTER_FK")
	ItemMaster itemMaster;
	@ManyToOne
	@JoinColumn(name="UNIT_MASTER_FK")
	UnitMaster unitMaster;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public PurchaseReturn getPurchaseReturn() {
		return purchaseReturn;
	}
	public void setPurchaseReturn(PurchaseReturn purchaseReturn) {
		this.purchaseReturn = purchaseReturn;
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
	
	public Double getUnitSellPrice() {
		return unitSellPrice;
	}
	public void setUnitSellPrice(Double unitSellPrice) {
		this.unitSellPrice = unitSellPrice;
	}
	public Double getUnitBuyPrice() {
		return unitBuyPrice;
	}
	public void setUnitBuyPrice(Double unitBuyPrice) {
		this.unitBuyPrice = unitBuyPrice;
	}
	public Boolean getIncludeTax() {
		return includeTax;
	}
	public void setIncludeTax(Boolean includeTax) {
		this.includeTax = includeTax;
	}
	public Double getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(Double discountAmt) {
		this.discountAmt = discountAmt;
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
	
	
	
	
		
}
