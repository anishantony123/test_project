package com.pos.dto;

public class MessagesDTO {
	private String title;
	private String content;
	private String alertType;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAlertType() {
		return alertType;
	}
	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}
	@Override
	public String toString() {
		return "MessagesDTO [title=" + title + ", content=" + content
				+ ", alertType=" + alertType + "]";
	}
	
	

}
