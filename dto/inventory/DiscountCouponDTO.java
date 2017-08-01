package com.pos.dto.inventory;

import java.util.Date;

import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.ItemGroupDTO;

public class DiscountCouponDTO {
private Long id;
private String couponCode;
private Long noOfUses;
private Long remainingUses;
private Character discountType;
private Double discountValue;
private Date startDate;
private Date endDate;
private AccountHeadDTO customer;
private ItemGroupDTO itemGroup;
private Double minPurchaseAmnt;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getCouponCode() {
	return couponCode;
}
public void setCouponCode(String couponCode) {
	this.couponCode = couponCode;
}
public Long getNoOfUses() {
	return noOfUses;
}
public void setNoOfUses(Long noOfUses) {
	this.noOfUses = noOfUses;
}
public Long getRemainingUses() {
	return remainingUses;
}
public void setRemainingUses(Long remainingUses) {
	this.remainingUses = remainingUses;
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
public AccountHeadDTO getCustomer() {
	return customer;
}
public void setCustomer(AccountHeadDTO customer) {
	this.customer = customer;
}
public ItemGroupDTO getItemGroup() {
	return itemGroup;
}
public void setItemGroup(ItemGroupDTO itemGroup) {
	this.itemGroup = itemGroup;
}
public Double getMinPurchaseAmnt() {
	return minPurchaseAmnt;
}
public void setMinPurchaseAmnt(Double minPurchaseAmnt) {
	this.minPurchaseAmnt = minPurchaseAmnt;
}



}
