package com.pos.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "ITEM_MASTER_ITEMS")
public class ItemMasterItems extends BaseEntity{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "IS_PRIMARY_UNIT")
	private Boolean primaryUnit;
	
	
	@Column(name = "SELL_RATE")
	private Double sellRate;

	@Column(name = "BUY_RATE")
	private Double buyRate;
	
	@Column(name = "DISTRIBUTE_LOOSE")
	private Boolean distributeLoose;
	
	@Column(name = "REORDER_QTY")
	private Long reOrderQty;
	
	@Column(name = "INITIAL_STOCK")
	private Long initialStock;
	
	@Column(name = "INITIAL_STOCK_PRICE")
	private Double initialStockPrice;
	
	@ManyToOne	
	@JoinColumn(name="ITEM_MASTER_FK")
	private ItemMaster itemMaster;
	
	@ManyToOne
	@JoinColumn(name="UNIT_NAME_FK")
	private UnitMaster unit;
	
	@OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="imItems")
	private List<LooseDistribution> looseDistributionList;
	
	
	
	public List<LooseDistribution> getLooseDistributionList() {
		return looseDistributionList;
	}
	public void setLooseDistributionList(
			List<LooseDistribution> looseDistributionList) {
		this.looseDistributionList = looseDistributionList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getPrimaryUnit() {
		return primaryUnit;
	}
	public void setPrimaryUnit(Boolean primaryUnit) {
		this.primaryUnit = primaryUnit;
	}
	public Double getSellRate() {
		return sellRate;
	}
	public void setSellRate(Double sellRate) {
		this.sellRate = sellRate;
	}
	public Double getBuyRate() {
		return buyRate;
	}
	public void setBuyRate(Double buyRate) {
		this.buyRate = buyRate;
	}
	public ItemMaster getItemMaster() {
		return itemMaster;
	}
	public void setItemMaster(ItemMaster itemMaster) {
		this.itemMaster = itemMaster;
	}
	public UnitMaster getUnit() {
		return unit;
	}
	public void setUnit(UnitMaster unit) {
		this.unit = unit;
	}
	public Boolean getDistributeLoose() {
		return distributeLoose;
	}
	public void setDistributeLoose(Boolean distributeLoose) {
		this.distributeLoose = distributeLoose;
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
	

	
	
	

}
