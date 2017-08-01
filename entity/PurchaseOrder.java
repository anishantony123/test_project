package com.pos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "PURCHASE_ORDER")
public class PurchaseOrder extends BaseEntity{
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@Column(name = "TOTAL_DISCOUNT")
	private Double totalDiscount;
	@Column(name = "TOTAL_TAX_AMOUNT")
	private Double totalTaxAmount;
	@Column(name = "TAX_UNIT")
	private Character taxUnit;
	@Column(name = "TAX_TYPE")
	private Character taxType;
	@Column(name = "TOTAL_INTEGRATED_TAX")
	private Double totalIntegratedTax;
	@Column(name = "TOTAL_STATE_TAX")
	private Double totalStateTax;
	@Column(name = "CENTRAL_TAX")
	private Double totalCentralTax;
	@Column(name = "TOTAL_CESS")
	private Double totalCess;
	@Column(name = "TOTAL_EXPENSE")
	private Double totalExpense;
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
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="purchaseOrder")
	private List<PurchaseOrderItems> items;
	
	
	public List<PurchaseOrderItems> getItems() {
		return items;
	}
	public void setItems(List<PurchaseOrderItems> items) {
		this.items = items;
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
	
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
	}
	public Character getTaxType() {
		return taxType;
	}
	public void setTaxType(Character taxType) {
		this.taxType = taxType;
	}
	
	
	
	
	
	
	
}
