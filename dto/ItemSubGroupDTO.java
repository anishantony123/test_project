package com.pos.dto;

import com.pos.dto.masters.ItemGroupDTO;

public class ItemSubGroupDTO {
	private Long subGroupCode;
	private String subGroupName;
	private String description;
	private ItemGroupDTO group;
	public Long getSubGroupCode() {
		return subGroupCode;
	}
	public void setSubGroupCode(Long subGroupCode) {
		this.subGroupCode = subGroupCode;
	}
	public String getSubGroupName() {
		return subGroupName;
	}
	public void setSubGroupName(String subGroupName) {
		this.subGroupName = subGroupName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ItemGroupDTO getGroup() {
		return group;
	}
	public void setGroup(ItemGroupDTO group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "ItemSubGroupDTO [subGroupCode=" + subGroupCode
				+ ", subGroupName=" + subGroupName + ", description="
				+ description + ", group=" + group + "]";
	}
	
	
	

}
