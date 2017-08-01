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

import com.pos.entity.embeddable.BaseEntity;
@Entity
@Table(name = "PURCHASE_ORDER_HISTORY")
public class PurchaseOrderHistory extends BaseEntity{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "ORDER_ID")
	private Long orderId;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "REMARKS")
	private String remarks;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "DUE_DATE")
	private Date dueDate;
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	@Column(name = "DISCOUNT")
	private Double discount;
	@Column(name = "TAX_AMOUNT")
	private Double taxAmount;
	@Column(name = "EXPENSES")
	private Double expenses;
	@Column(name = "GRANT_TOTAL")
	private Double grandTotal;
	@ManyToOne
	@JoinColumn(name="CURRENCY_FK")
	private CurrencyMaster currency;
	@ManyToOne
	@JoinColumn(name="SUPPLIER_FK")
	private AccountHead supplier;
	@ManyToOne
	@JoinColumn(name="COUNTER_FK")
	private Counter counter;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public CurrencyMaster getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyMaster currency) {
		this.currency = currency;
	}
	public AccountHead getSupplier() {
		return supplier;
	}
	public void setSupplier(AccountHead supplier) {
		this.supplier = supplier;
	}
	public Counter getCounter() {
		return counter;
	}
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	public FinancialYear getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
