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
@Entity
@Table(name = "DISCOUNT_COUPON_ACTION")
public class DiscountCouponAction {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "ACTION_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actionDate;
	@ManyToOne
	@JoinColumn(name="SALES_FK")
	private Sales sales;
	@ManyToOne
	@JoinColumn(name="DISCOUNT_COUPON_FK")
	private DiscountCoupon discountCoupon;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public DiscountCoupon getDiscountCoupon() {
		return discountCoupon;
	}
	public void setDiscountCoupon(DiscountCoupon discountCoupon) {
		this.discountCoupon = discountCoupon;
	}
	
	

}
