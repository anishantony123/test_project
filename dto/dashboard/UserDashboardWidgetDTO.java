package com.pos.dto.dashboard;

public class UserDashboardWidgetDTO {
	private String type;
	private String config;
	private String title;
	private String titleTemplateUrl;
	private String editTemplateUrl;
	private String wid;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleTemplateUrl() {
		return titleTemplateUrl;
	}
	public void setTitleTemplateUrl(String titleTemplateUrl) {
		this.titleTemplateUrl = titleTemplateUrl;
	}
	public String getEditTemplateUrl() {
		return editTemplateUrl;
	}
	public void setEditTemplateUrl(String editTemplateUrl) {
		this.editTemplateUrl = editTemplateUrl;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	
	
}
