package com.pos.dto.recept;

public class TicketItem {
	private String nameDisplay;
	private Integer itemCountDisplay;
	private Double actualAmount;
	private Double taxAmount;
	private Double discountAmount;
	private Double totalAmountDisplay;
	private Integer tableRowNum;
	
	
	
	
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Integer getTableRowNum() {
		return tableRowNum;
	}
	public void setTableRowNum(Integer tableRowNum) {
		this.tableRowNum = tableRowNum;
	}
	public String getNameDisplay() {
		return nameDisplay;
	}
	public void setNameDisplay(String nameDisplay) {
		this.nameDisplay = nameDisplay;
	}
	public Integer getItemCountDisplay() {
		return itemCountDisplay;
	}
	public void setItemCountDisplay(Integer itemCountDisplay) {
		this.itemCountDisplay = itemCountDisplay;
	}
	public Double getTotalAmountDisplay() {
		return totalAmountDisplay;
	}
	public void setTotalAmountDisplay(Double totalAmountDisplay) {
		this.totalAmountDisplay = totalAmountDisplay;
	}
	public Double getActualAmount() {
		return actualAmount;
	}
	public void setActualAmount(Double actualAmount) {
		this.actualAmount = actualAmount;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	

}
