package com.pos.dto.masters;

public class RoleItemDTO {
	
	private String roleId;
	
	private String roleConstant;
	private String roleDisplay;
	private Boolean enableView;
	private Boolean enableModify;
	private Boolean enableAdd;
	private Boolean canView;
	private Boolean canAdd;
	private Boolean canModify;
	private String savingType;
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleId() {
		return roleId;
	}
	
	public String getSavingType() {
		return savingType;
	}
	public void setSavingType(String savingType) {
		this.savingType = savingType;
	}
	public String getRoleConstant() {
		return roleConstant;
	}
	public void setRoleConstant(String roleConstant) {
		this.roleConstant = roleConstant;
	}
	public String getRoleDisplay() {
		return roleDisplay;
	}
	public void setRoleDisplay(String roleDisplay) {
		this.roleDisplay = roleDisplay;
	}
	public Boolean getEnableView() {
		return enableView;
	}
	public void setEnableView(Boolean enableView) {
		this.enableView = enableView;
	}
	
	
	public Boolean getEnableModify() {
		return enableModify;
	}

	public void setEnableModify(Boolean enableModify) {
		this.enableModify = enableModify;
	}

	public Boolean getEnableAdd() {
		return enableAdd;
	}

	public void setEnableAdd(Boolean enableAdd) {
		this.enableAdd = enableAdd;
	}

	public Boolean getCanView() {
		return canView;
	}
	public void setCanView(Boolean canView) {
		this.canView = canView;
	}
	
	public Boolean getCanAdd() {
		return canAdd;
	}

	public void setCanAdd(Boolean canAdd) {
		this.canAdd = canAdd;
	}

	public Boolean getCanModify() {
		return canModify;
	}
	public void setCanModify(Boolean canModify) {
		this.canModify = canModify;
	}

	

	

	

}
