package com.pos.dto.masters;

public class RolePrivilegesDTO {
	private Long id; 
	private String roleName;
	private Boolean canAdd;
	private Boolean canModify;
	private Boolean canView;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public Boolean getCanView() {
		return canView;
	}
	public void setCanView(Boolean canView) {
		this.canView = canView;
	}
	
	
	
	

}
