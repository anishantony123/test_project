package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "UNIT_MASTER")
public class UnitMaster extends BaseEntity{

	@Id
	@Column(name = "UNIT_CODE")
	private Long unitCode;

	@Column(name = "UNIT_NAME")
	private String unitName;
	
	@Column(name = "STATUS")
	private Character status;
	
	@Column(name = "SOURCE")
	private Character source;
	
	@Column(name = "REFERENCE")
	private String reference;
	
	public UnitMaster(){
		
	}
	
	public UnitMaster(Long unitCode){
		this.unitCode = unitCode;
	}

	public Long getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(Long unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	

	public Character getSource() {
		return source;
	}

	public void setSource(Character source) {
		this.source = source;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	
	
	

}
