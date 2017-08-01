package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DB_WIDGETS")
public class UserDBWidgets {
	@Id
	@Column(name = "TYPE")
	private String type;
	@Column(name = "EDIT_TEMPLATE_URL")
	private String editTemplateUrl;
	@Column(name = "STYLE_CLASS")
	private String styleClass;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "TITLE_TEMPLATE_URL")
	private String titleTemplateUrl;
	
	@Column(name = "WID")
	private String wid;
	
	
	public String getEditTemplateUrl() {
		return editTemplateUrl;
	}
	public void setEditTemplateUrl(String editTemplateUrl) {
		this.editTemplateUrl = editTemplateUrl;
	}
	public String getStyleClass() {
		return styleClass;
	}
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	
	

}
