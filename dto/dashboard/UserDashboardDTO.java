package com.pos.dto.dashboard;

import java.util.List;

public class UserDashboardDTO {
	private String titleTemplateUrl;
	private String title;
	private String structure;
	private List<UserDashboardRowDTO> rows;
	public String getTitleTemplateUrl() {
		return titleTemplateUrl;
	}
	public void setTitleTemplateUrl(String titleTemplateUrl) {
		this.titleTemplateUrl = titleTemplateUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public List<UserDashboardRowDTO> getRows() {
		return rows;
	}
	public void setRows(List<UserDashboardRowDTO> rows) {
		this.rows = rows;
	}
	
	

}
