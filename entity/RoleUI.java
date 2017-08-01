package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ROLE_UI")
public class RoleUI {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	
	@Column(name = "CAN_ADD")
	private Boolean addNew;
	
	@Column(name = "CAN_MODIFY")
	private Boolean modify;
	
	@Column(name = "CAN_VIEW")
	private Boolean view;
	
	@Column(name = "STATUS")
	private Character status;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Boolean getView() {
		return view;
	}

	public void setView(Boolean view) {
		this.view = view;
	}

	public Boolean getAddNew() {
		return addNew;
	}

	public void setAddNew(Boolean addNew) {
		this.addNew = addNew;
	}

	public Boolean getModify() {
		return modify;
	}

	public void setModify(Boolean modify) {
		this.modify = modify;
	}

	
	
	

}
