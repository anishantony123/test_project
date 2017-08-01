package com.pos.dto.masters;

@Deprecated
public class TaxConfigurationDTO {
	private ItemGroupDTO itemGroup;
	private Boolean isDefault;
	private Double taxRate;
	private Character taxUnit;
	public ItemGroupDTO getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroupDTO itemGroup) {
		this.itemGroup = itemGroup;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
	}
	
	
	
}
