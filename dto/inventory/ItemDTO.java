package com.pos.dto.inventory;

import com.pos.dto.masters.ItemGroupDTO;
import com.pos.dto.masters.ItemMasterDTO;
import com.pos.dto.masters.ItemMasterItemsDTO;
import com.pos.dto.masters.ItemMasterLiteDTO;
import com.pos.dto.masters.UnitMasterDTO;

public class ItemDTO {
	private String barcode;
	private Long itemCode;
	private String itemName;
	private Long qty;
	private UnitMasterDTO unit;
	private Double unitAmount;
	private Double discountAmount;
	private Double expenseAmount;
	private Double taxAmount;
	private Double totalAmount;
	private Double grandTotal;
	private ItemMasterItemsDTO itemMasterItem;
	private ItemGroupDTO itemGroup;
	
	
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
	
	
	
	
}
