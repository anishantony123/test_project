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
@Table(name = "SALES_HISTORY")
public class SalesHistory extends BaseEntity{

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "SALES_ID")
	private Long salesId;
	@Column(name = "SALE_DATE")
	private Date saleDate;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "PAYMENT_TYPE")
	private Character paymentType;
	@Column(name = "REMARKS")
	private String remarks;
	
	
	@Column(name = "CREDIT_DUE_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creditDueDate;
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	@Column(name = "OTHER_DISCOUNT")
	private Double otherDiscount;
	@Column(name = "TAX_AMOUNT")
	private Double taxAmount;
	@Column(name = "EXPENSES")
	private Double expenses;
	@Column(name = "GRANT_TOTAL")
	private Double grantTotal;
	@Column(name = "PAYMENT_METHOD")
	private Character paymentMethod;
	@Column(name = "PAYMENT_REFERENCE")
	private Character paymentReference;
	@Column(name = "CASH_RECEIVED")
	private Double cashReceived;
	
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_FK")
	private AccountHead customer;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	@ManyToOne
	@JoinColumn(name="COUNTER_FK")
	private Counter counter;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	
	@ManyToOne
	@JoinColumn(name="CURRENCY_FK")
	private CurrencyMaster currency;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Character getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(Character paymentType) {
		this.paymentType = paymentType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getCreditDueDate() {
		return creditDueDate;
	}

	public void setCreditDueDate(Date creditDueDate) {
		this.creditDueDate = creditDueDate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getOtherDiscount() {
		return otherDiscount;
	}

	public void setOtherDiscount(Double otherDiscount) {
		this.otherDiscount = otherDiscount;
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

	public Double getGrantTotal() {
		return grantTotal;
	}

	public void setGrantTotal(Double grantTotal) {
		this.grantTotal = grantTotal;
	}

	public Character getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Character paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Character getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(Character paymentReference) {
		this.paymentReference = paymentReference;
	}

	public Double getCashReceived() {
		return cashReceived;
	}

	public void setCashReceived(Double cashReceived) {
		this.cashReceived = cashReceived;
	}

	public AccountHead getCustomer() {
		return customer;
	}

	public void setCustomer(AccountHead customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public CurrencyMaster getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyMaster currency) {
		this.currency = currency;
	}

	
	
	
	
	
}
