package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "USER")
public class User extends BaseEntity{
	@Id
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "LAST_PWD_UPDATED_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastPwdUpdatedDate;
	/*@ManyToOne
	@JoinColumn(name="ACCOUNT_HEAD_FK")
	private AccountHead accountHead;*/
	@ManyToOne
	@JoinColumn(name="ROLE_FK")
	private Role role;
	
	public User(){
		
	}
	public User(String username){
		this.username = username;
	}
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
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Date getLastPwdUpdatedDate() {
		return lastPwdUpdatedDate;
	}
	public void setLastPwdUpdatedDate(Date lastPwdUpdatedDate) {
		this.lastPwdUpdatedDate = lastPwdUpdatedDate;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	/*public AccountHead getAccountHead() {
		return accountHead;
	}
	public void setAccountHead(AccountHead accountHead) {
		this.accountHead = accountHead;
	}
	*/
	
	

}
