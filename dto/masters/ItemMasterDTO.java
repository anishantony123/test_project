package com.pos.dto.masters;

import java.util.List;

public class ItemMasterDTO {
 private Long itemCode;
 private String itemName;
 private ItemGroupDTO itemGroup;
 private CompanyDTO company;
 //private Long reOrderQty;
 private MadeInDTO madeIn;
 private List<ItemMasterItemsDTO> itemMasterItems;
 //private Long initialStock;
 //private Double initialStockPrice;
 //private Double primaryBuyRate;
 //private Double primarySellRate;
 private Boolean includeTax;
 private CurrencyDTO currency;
 private UnitMasterDTO primaryUnit;
 private Character itemType;
 private String createdBy;
 
 
 
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Character getItemType() {
	return itemType;
}
public void setItemType(Character itemType) {
	this.itemType = itemType;
}
public Long getItemCode() {
	return itemCode;
}
public void setItemCode(Long itemCode) {
	this.itemCode = itemCode;
}

public UnitMasterDTO getPrimaryUnit() {
	return primaryUnit;
}
public void setPrimaryUnit(UnitMasterDTO primaryUnit) {
	this.primaryUnit = primaryUnit;
}

public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public ItemGroupDTO getItemGroup() {
	return itemGroup;
}
public void setItemGroup(ItemGroupDTO itemGroup) {
	this.itemGroup = itemGroup;
}
public CompanyDTO getCompany() {
	return company;
}
public void setCompany(CompanyDTO company) {
	this.company = company;
}


public MadeInDTO getMadeIn() {
	return madeIn;
}
public void setMadeIn(MadeInDTO madeIn) {
	this.madeIn = madeIn;
}
public List<ItemMasterItemsDTO> getItemMasterItems() {
	return itemMasterItems;
}
public void setItemMasterItems(List<ItemMasterItemsDTO> itemMasterItems) {
	this.itemMasterItems = itemMasterItems;
}

public Boolean getIncludeTax() {
	return includeTax;
}
public void setIncludeTax(Boolean includeTax) {
	this.includeTax = includeTax;
}
public CurrencyDTO getCurrency() {
	return currency;
}
public void setCurrency(CurrencyDTO currency) {
	this.currency = currency;
}
 
 


 
 
 
}
