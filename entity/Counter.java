package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTER")
public class Counter {
	
	
	
	
	@Id
	@Column(name = "SHORT_NAME")
	private String shortName;
	
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	
	@Column(name = "IS_HO")
	private boolean isHO;
	
	@Column(name="PRINTER")
	private String printerName;

	
	
	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isHO() {
		return isHO;
	}

	public void setHO(boolean isHO) {
		this.isHO = isHO;
	}

	
	

	
}
