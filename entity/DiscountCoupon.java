package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "DISCOUNT_COUPON")
public class DiscountCoupon extends BaseEntity{
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "DISCOUNT_CODE")
	private String discountCode;
	@Column(name = "NO_OF_USES")
	private Long noOfUses;
	@Column(name = "REMAINING_USES")
	private Long remainingUses;
	@Column(name = "DISCOUNT_TYPE")
	private Character discountType;//P or R
	@Column(name = "DISCOUNT_VALUE")
	private Double discountValue;
	@Column(name = "START_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Column(name = "END_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "MIN_PURCHASE_AMOUNT")
	private Double minPurchaseAmnt;
	
	@ManyToOne
	@JoinColumn(name="ITEM_GROUP_FK")
	private ItemGroup itemGroup;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_FK")
	private AccountHead customer;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRemarks() {
		return discountCode;
	}
	public void setRemarks(String discountCode) {
		this.discountCode = discountCode;
	}
	public Long getNoOfUses() {
		return noOfUses;
	}
	public void setNoOfUses(Long noOfUses) {
		this.noOfUses = noOfUses;
	}
	public Character getDiscountType() {
		return discountType;
	}
	public void setDiscountType(Character discountType) {
		this.discountType = discountType;
	}
	public Double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
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
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Long getRemainingUses() {
		return remainingUses;
	}
	public void setRemainingUses(Long remainingUses) {
		this.remainingUses = remainingUses;
	}
	public AccountHead getCustomer() {
		return customer;
	}
	public void setCustomer(AccountHead customer) {
		this.customer = customer;
	}
	public Double getMinPurchaseAmnt() {
		return minPurchaseAmnt;
	}
	public void setMinPurchaseAmnt(Double minPurchaseAmnt) {
		this.minPurchaseAmnt = minPurchaseAmnt;
	}
	
	
	
	
	
}
