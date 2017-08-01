package com.pos.dto.tools;

import java.util.Date;

public class UserLogSearchDTO {
	private String actForm;
	private String search;
	private Date from;
	private Date to;
	public String getActForm() {
		return actForm;
	}
	public void setActForm(String actForm) {
		this.actForm = actForm;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "UserLogSearchDTO [actForm=" + actForm + ", search=" + search
				+ ", from=" + from + ", to=" + to + "]";
	}
	
	
	

}
