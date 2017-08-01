package com.pos.dto.inventory;

import java.util.Date;

public class LedgerDTO {
	private Long id;
	private Date activityDate;
	private String action;
	private Double amount;
	private String doneFrom;
	private String doneBy;
	public Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDoneFrom() {
		return doneFrom;
	}
	public void setDoneFrom(String doneFrom) {
		this.doneFrom = doneFrom;
	}
	public String getDoneBy() {
		return doneBy;
	}
	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
