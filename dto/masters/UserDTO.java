package com.pos.dto.masters;

import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.RolesDTO;

public class UserDTO {
	private String username;
	private String password;
	private RolesDTO role;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RolesDTO getRole() {
		return role;
	}
	public void setRole(RolesDTO role) {
		this.role = role;
	}
	
	

}
