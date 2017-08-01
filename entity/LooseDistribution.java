package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "LOOSE_DISTRIBUTION")
public class LooseDistribution extends BaseEntity{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne	
	@JoinColumn(name="IM_ITEM_FK")
	private ItemMasterItems imItems;
	@ManyToOne	
	@JoinColumn(name="MASTER_UNIT_FK")
	private UnitMaster masterUnit;
	@ManyToOne	
	@JoinColumn(name="SUB_UNIT_FK")
	private UnitMaster subUnit;
	@Column(name = "UNIT_COUNT")
	private Long unitCount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ItemMasterItems getImItems() {
		return imItems;
	}
	public void setImItems(ItemMasterItems imItems) {
		this.imItems = imItems;
	}
	public UnitMaster getMasterUnit() {
		return masterUnit;
	}
	public void setMasterUnit(UnitMaster masterUnit) {
		this.masterUnit = masterUnit;
	}
	public UnitMaster getSubUnit() {
		return subUnit;
	}
	public void setSubUnit(UnitMaster subUnit) {
		this.subUnit = subUnit;
	}
	public Long getUnitCount() {
		return unitCount;
	}
	public void setUnitCount(Long unitCount) {
		this.unitCount = unitCount;
	}
	
	

}
