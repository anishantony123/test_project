package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_GST")
public class CustomerGST {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "STATE")
	private String state;
	@Column(name = "REGISTRATION_TYPE")
	private String registrationType;//Regular
	@Column(name = "APPLICABLE_FROM")
	private Date applicableFrom;
	@Column(name = "GSTIN")
	private String gstin;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public Date getApplicableFrom() {
		return applicableFrom;
	}
	public void setApplicableFrom(Date applicableFrom) {
		this.applicableFrom = applicableFrom;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
