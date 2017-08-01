package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DASHBOARD")
public class UserDashboard {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	@Column(name = "DASHBOARD_NAME")
	private String dashboardName;
	@Column(name = "STRUCTURE")
	private String structure;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "TITLE_TEMPLATE_URL")
	private String titleTemplateUrl;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDashboardName() {
		return dashboardName;
	}
	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
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
	
}
