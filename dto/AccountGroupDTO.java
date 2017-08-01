package com.pos.dto;

public class AccountGroupDTO {
	private Long grpCode;
	private String grpName;
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getGrpCode() {
		return grpCode;
	}
	public void setGrpCode(Long grpCode) {
		this.grpCode = grpCode;
	}
	public String getGrpName() {
		return grpName;
	}
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}
	@Override
	public String toString() {
		return "AccountGroupDTO [grpCode=" + grpCode + ", grpName=" + grpName
				+ "]";
	}
	
}
