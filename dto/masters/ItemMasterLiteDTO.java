package com.pos.dto.masters;

import java.util.List;

public class ItemMasterLiteDTO {
	 private Long itemCode;
	 private String itemName;
	 private Boolean includeTax;
	 private List<ItemMasterItemsDTO> itemMasterItems;
	 private ItemGroupDTO itemGroup;
		
		
		public ItemGroupDTO getItemGroup() {
			return itemGroup;
		}
		public void setItemGroup(ItemGroupDTO itemGroup) {
			this.itemGroup = itemGroup;
		}
		public Boolean getIncludeTax() {
			return includeTax;
		}
		public void setIncludeTax(Boolean includeTax) {
			this.includeTax = includeTax;
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
		public List<ItemMasterItemsDTO> getItemMasterItems() {
			return itemMasterItems;
		}
		public void setItemMasterItems(List<ItemMasterItemsDTO> itemMasterItems) {
			this.itemMasterItems = itemMasterItems;
		}
		
		
	
}
