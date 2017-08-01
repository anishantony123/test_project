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
@Table(name = "TRANSACTION_DETAIL")
public class TransactionDetail extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "CURRENCY_FK")
	private CurrencyMaster currency;
	
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	
	@Column(name = "REFERENCE_TYPE")
	private String referenceType;
	
	@Column(name = "REFERENC_NO")
	private String referenceNo;
	
	@Column(name = "STATUS")
	private Character status;
	
	@ManyToOne
	@JoinColumn(name = "COUNTER_FK")
	private Counter counter;
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_HEAD_FK")
	private AccountHead accountHead;
	@ManyToOne
	@JoinColumn(name = "CREATED_USER")
	private User createdUser;
	@ManyToOne
	@JoinColumn(name = "FINANCIAL_YEAR_FK")
	private FinancialYear financialYear;
	
	@Column(name = "ACTION_TYPE")
	private String actionType;//CREDIT OR DEBIT
	
	/*@Column(name = "PAYMENT_TYPE")
	private String paymentType;*/
	
	@Column(name = "TAX_TYPE")
	private Character taxType;//GST or OTHERS
	
	@Column(name = "INTEGRATED_TAX")
	private Double integratedTax;
	
	@Column(name = "STATE_TAX")
	private Double stateTax;
	
	@Column(name = "CENTRAL_TAX")
	private Double centralTax;
	
	@Column(name = "CESS")
	private Double cess;
	
	@Column(name = "TAX_RATE")
	private Double taxRate;//only triggered when gst disabled
	
	@Column(name = "TAX_UNIT")
	private Character taxUnit;
	
	@Column(name = "DISCOUNT")
	private Double discount;
	
	@Column(name = "EXPENSES")
	private Double expenses;
	
	@Column(name = "SYSTEM_REMARKS")
	private String systemRemarks;

	@Column(name = "ACTIVITY_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date activityDate;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public CurrencyMaster getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyMaster currency) {
		this.currency = currency;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	public AccountHead getAccountHead() {
		return accountHead;
	}

	public void setAccountHead(AccountHead accountHead) {
		this.accountHead = accountHead;
	}

	public FinancialYear getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/*public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}*/

	

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

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public String getSystemRemarks() {
		return systemRemarks;
	}

	public void setSystemRemarks(String systemRemarks) {
		this.systemRemarks = systemRemarks;
	}

	public User getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public Character getTaxUnit() {
		return taxUnit;
	}

	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
	}

	
	
	
	
}
