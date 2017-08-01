package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "ZIP")
	private String zip;
	@Column(name = "FAX")
	private String fax;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "MOBILE")
	private String mobile;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "WEBSITE")
	private String website;
	@Column(name = "START_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Column(name = "END_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	@Column(name = "IS_DEFAULT_COMPANY")
	private Boolean defaultCustomer;
	@Column(name = "TAGLINE")
	private String tagline;
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_GST_FK")
	private CustomerGST customerGST;
	
	@Lob
	@Column(name = "LOGO")
    private byte[] logo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getDefaultCustomer() {
		return defaultCustomer;
	}

	public void setDefaultCustomer(Boolean defaultCustomer) {
		this.defaultCustomer = defaultCustomer;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public CustomerGST getCustomerGST() {
		return customerGST;
	}

	public void setCustomerGST(CustomerGST customerGST) {
		this.customerGST = customerGST;
	}

	
	
	
	

}
