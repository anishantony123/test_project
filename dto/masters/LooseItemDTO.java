package com.pos.dto.masters;

public class LooseItemDTO {
	private Long unitCount;
	private UnitMasterDTO subUnit;
	
	
	public Long getUnitCount() {
		return unitCount;
	}
	public void setUnitCount(Long unitCount) {
		this.unitCount = unitCount;
	}
	public UnitMasterDTO getSubUnit() {
		return subUnit;
	}
	public void setSubUnit(UnitMasterDTO subUnit) {
		this.subUnit = subUnit;
	}
 
}
