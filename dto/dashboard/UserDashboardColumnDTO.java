package com.pos.dto.dashboard;

import java.util.List;

public class UserDashboardColumnDTO {
	private String cid;
	private String styleClass;
	private List<UserDashboardWidgetDTO> widgets;
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
	public List<UserDashboardWidgetDTO> getWidgets() {
		return widgets;
	}
	public void setWidgets(List<UserDashboardWidgetDTO> widgets) {
		this.widgets = widgets;
	}
	
	

}
