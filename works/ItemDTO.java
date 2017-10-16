package com.pos.dto.inventory;

import javax.persistence.Column;

import com.pos.dto.masters.ItemGroupDTO;
import com.pos.dto.masters.ItemMasterDTO;
import com.pos.dto.masters.ItemMasterItemsDTO;
import com.pos.dto.masters.ItemMasterLiteDTO;
import com.pos.dto.masters.UnitMasterDTO;

public class ItemDTO {
	private Long id;
	private String barcode;
	private Long itemCode;
	private String itemName;
	private Long qty;
	private UnitMasterDTO unit;
	private Double unitSaleAmount;
	private Double unitBuyAmount;
	private Double unitMRPAmount;
	private Double discountAmount;
	private Double expenseAmount;
	private Double taxAmount;
	private Double taxPercentage;
	private Character taxType;
	private Character taxUnit;
	private Double integratedTaxAmount;
	private Double integratedTaxPercentage;
	private Double stateTaxAmount;
	private Double stateTaxPercentage;
	private Double centralTaxAmount;
	private Double centralTaxPercentage;
	private Double cessAmount;
	private Double cessPercentage;
	private Double taxAmountDisplay;
	private Double totalAmount;
	private Double grandTotal;
	private ItemMasterItemsDTO itemMasterItem;
	private ItemGroupDTO itemGroup;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Long getItemCode() {
		return itemCode;
	}
	public void setItemCode(Long itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public UnitMasterDTO getUnit() {
		return unit;
	}
	public void setUnit(UnitMasterDTO unit) {
		this.unit = unit;
	}
	

	
	public Double getUnitSaleAmount() {
		return unitSaleAmount;
	}
	public void setUnitSaleAmount(Double unitSaleAmount) {
		this.unitSaleAmount = unitSaleAmount;
	}
	public Double getUnitBuyAmount() {
		return unitBuyAmount;
	}
	public void setUnitBuyAmount(Double unitBuyAmount) {
		this.unitBuyAmount = unitBuyAmount;
	}
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Double getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(Double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public ItemMasterItemsDTO getItemMasterItem() {
		return itemMasterItem;
	}
	public void setItemMasterItem(ItemMasterItemsDTO itemMasterItem) {
		this.itemMasterItem = itemMasterItem;
	}
	public ItemGroupDTO getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroupDTO itemGroup) {
		this.itemGroup = itemGroup;
	}
	public Character getTaxType() {
		return taxType;
	}
	public void setTaxType(Character taxType) {
		this.taxType = taxType;
	}
	public Double getIntegratedTaxAmount() {
		return integratedTaxAmount;
	}
	public void setIntegratedTaxAmount(Double integratedTaxAmount) {
		this.integratedTaxAmount = integratedTaxAmount;
	}
	public Double getStateTaxAmount() {
		return stateTaxAmount;
	}
	public void setStateTaxAmount(Double stateTaxAmount) {
		this.stateTaxAmount = stateTaxAmount;
	}
	public Double getCentralTaxAmount() {
		return centralTaxAmount;
	}
	public void setCentralTaxAmount(Double centralTaxAmount) {
		this.centralTaxAmount = centralTaxAmount;
	}
	public Double getCessAmount() {
		return cessAmount;
	}
	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
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
	public Double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Double getTaxAmountDisplay() {
		return taxAmountDisplay;
	}
	public void setTaxAmountDisplay(Double taxAmountDisplay) {
		this.taxAmountDisplay = taxAmountDisplay;
	}
	public Double getUnitMRPAmount() {
		return unitMRPAmount;
	}
	public void setUnitMRPAmount(Double unitMRPAmount) {
		this.unitMRPAmount = unitMRPAmount;
	}
	
	
	
	
	
}
