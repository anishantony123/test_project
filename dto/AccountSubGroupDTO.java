package com.pos.dto;

public class AccountSubGroupDTO {
	private String grpName;
	private Long grpCode;
	private AccountGroupDTO accountGroup;
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGrpName() {
		return grpName;
	}
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}
	public Long getGrpCode() {
		return grpCode;
	}
	public void setGrpCode(Long grpCode) {
		this.grpCode = grpCode;
	}
	public AccountGroupDTO getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(AccountGroupDTO accountGroup) {
		this.accountGroup = accountGroup;
	}
	@Override
	public String toString() {
		return "AccountSubGroupDTO [grpName=" + grpName + ", grpCode="
				+ grpCode + ", accountGroup=" + accountGroup +", type=" + type+  "]";
	}
	
	
	
}
