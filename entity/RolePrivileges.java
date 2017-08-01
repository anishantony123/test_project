package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "ROLE_PRIVILEGES")
public class RolePrivileges extends BaseEntity{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "CAN_ADD")
	private Boolean canAddNew;
	@Column(name = "CAN_MODIFY")
	private Boolean canModify;
	@Column(name = "CAN_VIEW")
	private Boolean canView;
	@ManyToOne
	@JoinColumn(name="ROLE_FK")
	private Role role;
	@ManyToOne
	@JoinColumn(name="ROLE_UI_FK")
	private RoleUI roleUI;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getCanView() {
		return canView;
	}
	public void setCanView(Boolean canView) {
		this.canView = canView;
	}
	public Boolean getCanAddNew() {
		return canAddNew;
	}
	public void setCanAddNew(Boolean canAddNew) {
		this.canAddNew = canAddNew;
	}
	public Boolean getCanModify() {
		return canModify;
	}
	public void setCanModify(Boolean canModify) {
		this.canModify = canModify;
	}
	public RoleUI getRoleUI() {
		return roleUI;
	}
	public void setRoleUI(RoleUI roleUI) {
		this.roleUI = roleUI;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
