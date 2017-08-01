package com.pos.dto.tools;

import java.util.Date;

public class FinancialYearDTO {
	private Long id;
	private Date fromDate;
	private Date toDate;
	private boolean status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "FinancialYearDTO [fromDate=" + fromDate + ", toDate=" + toDate
				+ ", status=" + status + "]";
	}
	
	
	
}
