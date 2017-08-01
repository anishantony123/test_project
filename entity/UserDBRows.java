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
@Table(name = "USER_DB_ROWS")
public class UserDBRows {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private UserDashboard userDashboard;
	@Column(name = "ROW_ID")
	private Long rowId;
	@Column(name = "COLUMN_ID")
	private Long columnId;
	@Column(name = "CID")
	private String cid;
	@Column(name = "STYLE_CLASS")
	private String styleClass;
	@Column(name = "CONFIG")
	private String config;
	@ManyToOne
	@JoinColumn(name="USER_DB_WIDGET")
	private UserDBWidgets userWidget;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDashboard getUserDashboard() {
		return userDashboard;
	}
	public void setUserDashboard(UserDashboard userDashboard) {
		this.userDashboard = userDashboard;
	}
	public Long getRowId() {
		return rowId;
	}
	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}
	public Long getColumnId() {
		return columnId;
	}
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getStyleClass() {
		return styleClass;
	}
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public UserDBWidgets getUserWidget() {
		return userWidget;
	}
	public void setUserWidget(UserDBWidgets userWidget) {
		this.userWidget = userWidget;
	}


	
	
	

}
