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

@Entity
@Table(name = "PUCHASE_RETURN")
public class PurchaseReturn {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "SEQUENCE_STRING", unique=true)
	private String sequenceString;
	
	
	
	
	
	
	@Column(name = "INVOICE_NUM")
	private String invoiceNum;
	
	@Column(name = "RETURN_DATE")
	private Date returnDate;
	
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	@Column(name = "OTHER_DISCOUNT")
	private Double otherDiscount;
	@Column(name = "TAX_AMOUNT")
	private Double taxAmount;
	@Column(name = "GRANT_TOTAL")
	private Double grantTotal;
	@Column(name = "EXPENSES")
	private Double expenses;	
	
	@Column(name = "REMARKS")
	private String remarks;
	
	
	@ManyToOne
	@JoinColumn(name="PURCHASE_RECEIVING_FK")
	PurchaseReceiving purchaseReceiving;
	@ManyToOne
	@JoinColumn(name="COUNTER_FK")
	private Counter counter;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_FK")
	private FinancialYear financialYear;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	@ManyToOne	
	@JoinColumn(name="SUPPLIER_FK")
	AccountHead supplier;
	@ManyToOne	
	@JoinColumn(name="CURRENCY_FK")
	CurrencyMaster currency;
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getSequenceString() {
		return sequenceString;
	}
	public void setSequenceString(String sequenceString) {
		this.sequenceString = sequenceString;
	}
	public AccountHead getSupplier() {
		return supplier;
	}
	public void setSupplier(AccountHead supplier) {
		this.supplier = supplier;
	}
	
	public PurchaseReceiving getPurchaseReceiving() {
		return purchaseReceiving;
	}
	public void setPurchaseReceiving(PurchaseReceiving purchaseReceiving) {
		this.purchaseReceiving = purchaseReceiving;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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
	public Double getGrantTotal() {
		return grantTotal;
	}
	public void setGrantTotal(Double grantTotal) {
		this.grantTotal = grantTotal;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public CurrencyMaster getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyMaster currency) {
		this.currency = currency;
	}
	public Long getId() {
		return id;
	}
	
	
	
	
	
	}
