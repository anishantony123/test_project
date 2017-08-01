package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SEQUENCE_GENERATOR")
public class SequenceGenerator {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "MODULE_NAME")
	private String moduleName;
	
	@Column(name = "NEXT_NUM")
	private Long nextNumber;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Long getNextNumber() {
		return nextNumber;
	}

	public void setNextNumber(Long nextNumber) {
		this.nextNumber = nextNumber;
	}

	

	

	
	
	
	
	
	

}
