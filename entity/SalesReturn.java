package com.pos.entity;

import java.util.Date;
import java.util.Set;

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
@Table(name = "SALES_RETURN")
public class SalesReturn extends BaseEntity{

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "REF_SALE")
	private Long refSale;
	@Column(name = "RETURN_DATE")
	private Date returnDate;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "REMARKS")
	private String remarks;
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;
	@Column(name = "PAYMENT_METHOD")
	private Character paymentMethod;
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	@Column(name = "EXPENSES")
	private Double expenses;
	@Column(name = "DISCOUNT")
	private Double discount;
	@Column(name = "TAX_AMOUNT")
	private Double taxAmount;
	@Column(name = "TAX_UNIT")
	private Character taxUnit;
	@Column(name = "TAX_TYPE")
	private Character taxType;
	@Column(name = "INTEGRATED_TAX")
	private Double integratedTax;
	@Column(name = "STATE_TAX")
	private Double stateTax;
	@Column(name = "CENTRAL_TAX")
	private Double centralTax;
	@Column(name = "CESS")
	private Double cess;
	@Column(name = "GRAND_TOTAL")
	private Double grandTotal;
	@ManyToOne
	@JoinColumn(name="CUSTOMER_FK")
	private AccountHead customer;
	@ManyToOne
	@JoinColumn(name="USER_FK")
	private User user;
	@ManyToOne
	@JoinColumn(name="COUNER_FK")
	private Counter counter;
	@ManyToOne
	@JoinColumn(name="FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	@ManyToOne
	@JoinColumn(name="CURRENCY_FK")
	private CurrencyMaster currency;
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="salesReturn")
	private Set<SalesReturnItems> items;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRefSale() {
		return refSale;
	}
	public void setRefSale(Long refSale) {
		this.refSale = refSale;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
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
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
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
	public Set<SalesReturnItems> getItems() {
		return items;
	}
	public void setItems(Set<SalesReturnItems> items) {
		this.items = items;
	}
	public Character getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(Character paymentMethod) {
		this.paymentMethod = paymentMethod;
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
	public Double getIntegratedTax() {
		return integratedTax;
	}
	public void setIntegratedTax(Double integratedTax) {
		this.integratedTax = integratedTax;
	}
	public Double getStateTax() {
		return stateTax;
	}
	public void setStateTax(Double stateTax) {
		this.stateTax = stateTax;
	}
	public Double getCentralTax() {
		return centralTax;
	}
	public void setCentralTax(Double centralTax) {
		this.centralTax = centralTax;
	}
	public Double getCess() {
		return cess;
	}
	public void setCess(Double cess) {
		this.cess = cess;
	}
	
	
	
	
	
	
}
