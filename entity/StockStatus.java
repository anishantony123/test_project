package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "STOCK_STATUS")
public class StockStatus {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "REMAINING_STOCK")
	private Long remainingStock;
	@Column(name = "TOTAL_PURCHASED_STOCK")
	private Long totalPurchasedStock;
	@Column(name = "RETURNED_STOCK")
	private Long returnedStock;
	@Column(name = "DAMAGED_STOCK")
	private Long damagedStock;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	@ManyToOne
	@JoinColumn(name="UNIT_FK")
	private UnitMaster unit;
	
	@ManyToOne
	@JoinColumn(name="ITEM_FK")
	private ItemMaster item;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRemainingStock() {
		return remainingStock;
	}

	public void setRemainingStock(Long remainingStock) {
		this.remainingStock = remainingStock;
	}

	public Long getTotalPurchasedStock() {
		return totalPurchasedStock;
	}

	public void setTotalPurchasedStock(Long totalPurchasedStock) {
		this.totalPurchasedStock = totalPurchasedStock;
	}

	public Long getReturnedStock() {
		return returnedStock;
	}

	public void setReturnedStock(Long returnedStock) {
		this.returnedStock = returnedStock;
	}

	public Long getDamagedStock() {
		return damagedStock;
	}

	public void setDamagedStock(Long damagedStock) {
		this.damagedStock = damagedStock;
	}

	public FinancialYear getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
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

	

}
