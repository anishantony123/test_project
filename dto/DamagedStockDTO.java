package com.pos.dto;

import java.util.Date;
import java.util.List;

import com.pos.dto.inventory.ItemDTO;

public class DamagedStockDTO {
	private Long no;
	private Date date;
	private List<ItemDTO> itemList;
	private String description;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ItemDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemDTO> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "DamagedStockDTO [no=" + no + ", date=" + date + ", itemList="
				+ itemList + ", description=" + description + "]";
	}
}
