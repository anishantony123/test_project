package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ONETIME_ENTRIES")
public class OneTimeEntries {
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name="OT_KEY")
	private String oneTimeKey;
	
	@Column(name="KEY_DATA")
	private String key;
	
	@Column(name="VALUE_DATA")
	private String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOneTimeKey() {
		return oneTimeKey;
	}

	public void setOneTimeKey(String oneTimeKey) {
		this.oneTimeKey = oneTimeKey;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
