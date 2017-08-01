package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "MADEIN_MASTER")
public class MadeinMaster extends BaseEntity{
	
	
	@Id
	@Column(name = "MADEIN_CODE")
	private Long code;
	@Column(name = "MADEIN_NAME")
	private String name;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "SOURCE")
	private Character source;
	@Column(name = "IS_PRIMARY_MADEIN")
	private Boolean primaryMadeIn;
	
	@Column(name = "REFERENCE")
	private String reference;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Character getSource() {
		return source;
	}
	public void setSource(Character source) {
		this.source = source;
	}
	public Boolean getPrimaryMadeIn() {
		return primaryMadeIn;
	}
	public void setPrimaryMadeIn(Boolean primaryMadeIn) {
		this.primaryMadeIn = primaryMadeIn;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
	


}
