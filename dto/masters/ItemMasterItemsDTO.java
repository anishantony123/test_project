package com.pos.dto.masters;

import java.util.List;

public class ItemMasterItemsDTO {
	
	private UnitMasterDTO unit;
	private Long primaryUnitCount;
	private Double buyRate;
	private Double saleRate;
	private Boolean primaryUnit;
	private Boolean distributeLoose;
	private Long reOrderQty;
	private Long initialStock;
	private Double initialStockPrice;
	private List<LooseItemDTO> looseList;
	
	
	
	public List<LooseItemDTO> getLooseList() {
		return looseList;
	}
	public void setLooseList(List<LooseItemDTO> looseList) {
		this.looseList = looseList;
	}
	public Long getReOrderQty() {
		return reOrderQty;
	}
	public void setReOrderQty(Long reOrderQty) {
		this.reOrderQty = reOrderQty;
	}
	public Long getInitialStock() {
		return initialStock;
	}
	public void setInitialStock(Long initialStock) {
		this.initialStock = initialStock;
	}
	public Double getInitialStockPrice() {
		return initialStockPrice;
	}
	public void setInitialStockPrice(Double initialStockPrice) {
		this.initialStockPrice = initialStockPrice;
	}
	public Boolean getDistributeLoose() {
		return distributeLoose;
	}
	public void setDistributeLoose(Boolean distributeLoose) {
		this.distributeLoose = distributeLoose;
	}
	public UnitMasterDTO getUnit() {
		return unit;
	}
	public void setUnit(UnitMasterDTO unit) {
		this.unit = unit;
	}
	public Long getPrimaryUnitCount() {
		return primaryUnitCount;
	}
	public void setPrimaryUnitCount(Long primaryUnitCount) {
		this.primaryUnitCount = primaryUnitCount;
	}
	public Double getBuyRate() {
		return buyRate;
	}
	public void setBuyRate(Double buyRate) {
		this.buyRate = buyRate;
	}
	public Double getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(Double saleRate) {
		this.saleRate = saleRate;
	}
	public Boolean getPrimaryUnit() {
		return primaryUnit;
	}
	public void setPrimaryUnit(Boolean primaryUnit) {
		this.primaryUnit = primaryUnit;
	}
	
	
	
	

}
