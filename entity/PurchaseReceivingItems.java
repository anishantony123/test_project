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
@Table(name = "PURCHASE_RECEIVING_ITEMS")
public class PurchaseReceivingItems extends BaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
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
	@Column(name = "INTEGRATED_TAX_PERCENTAGE")
	private Double integratedTaxPercentage;
	@Column(name = "STATE_TAX")
	private Double stateTax;
	@Column(name = "STATE_TAX_PERCENTAGE")
	private Double stateTaxPercentage;
	@Column(name = "CENTRAL_TAX")
	private Double centralTax;
	@Column(name = "CENTRAL_TAX_PERCENTAGE")
	private Double centralTaxPercentage;
	@Column(name = "CESS")
	private Double cess;
	@Column(name = "CESS_PERCENTAGE")
	private Double cessPercentage;
	@Column(name = "TOTAL_AMT")
	private Double totalAmt;
	@Column(name = "GRAND_TOTAL")
	private Double grandTotal;
	
	
	@ManyToOne
	@JoinColumn(name="PURCHASE_RECEIVING_FK")
	PurchaseReceiving purchaseReceiving;
	@ManyToOne
	@JoinColumn(name="ITEM_MASTER_FK")
	ItemMaster itemMaster;
	@ManyToOne
	@JoinColumn(name="UNIT_MASTER_FK")
	UnitMaster unitMaster;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public PurchaseReceiving getPurchaseReceiving() {
		return purchaseReceiving;
	}
	public void setPurchaseReceiving(PurchaseReceiving purchaseReceiving) {
		this.purchaseReceiving = purchaseReceiving;
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
	public Double getIntegratedTaxPercentage() {
		return integratedTaxPercentage;
	}
	public void setIntegratedTaxPercentage(Double integratedTaxPercentage) {
		this.integratedTaxPercentage = integratedTaxPercentage;
	}
	public Double getStateTaxPercentage() {
		return stateTaxPercentage;
	}
	public void setStateTaxPercentage(Double stateTaxPercentage) {
		this.stateTaxPercentage = stateTaxPercentage;
	}
	public Double getCentralTaxPercentage() {
		return centralTaxPercentage;
	}
	public void setCentralTaxPercentage(Double centralTaxPercentage) {
		this.centralTaxPercentage = centralTaxPercentage;
	}
	public Double getCessPercentage() {
		return cessPercentage;
	}
	public void setCessPercentage(Double cessPercentage) {
		this.cessPercentage = cessPercentage;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	
	
	
	
}
