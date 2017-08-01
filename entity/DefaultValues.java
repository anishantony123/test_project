package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEFAULT_VALUES")
public class DefaultValues {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "MODULE_NAME")
	private String moduleName;
	@Column(name = "DEFAULT_CODE")
	private String defaultCode;
	@Column(name = "DEFAULT_VALUE")
	private String defaultValue;
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
	public String getDefaultCode() {
		return defaultCode;
	}
	public void setDefaultCode(String defaultCode) {
		this.defaultCode = defaultCode;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	

}
