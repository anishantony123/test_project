package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;
@Entity
@Table(name = "ROLE")
public class Role extends BaseEntity{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id = 0l;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "STATUS")
	private Character status;
	
	@Column(name = "SOURCE")
	private Character source;
	
	
	public Character getSource() {
		return source;
	}
	public void setSource(Character source) {
		this.source = source;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	
	
	

}
