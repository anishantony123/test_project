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
@Table(name = "USER_TRANSACTIONS")
public class UserTransactions extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "ACTIVITY_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date activityDate;
	@Column(name = "AMOUNT")
	private Double amount;
	@Column(name = "ACTION_TYPE")
	/**
	 * if actionType become Credit then it means the amount become credited to the marchents account.
	 * If actionType become Debit then it means the amount become debited from the marchants account ()
	 */
	private String actionType;//CREDIT OR DEBIT
	@Column(name = "REF_TYPE")
	private String referenceType;
	@Column(name = "REF_NO")
	private String referenceNo;
	
	@Column(name = "SYSTEM_REMARKS")
	private String systemRemarks;
	@Column(name = "TRANSACTION_SOURCE")
	private String transactionSource;
	@Column(name = "USER_REMARKS")
	private String userRemarks;
	@Column(name = "STATUS")
	private Character status;
	
	@ManyToOne
	@JoinColumn(name = "CREATED_USER")
	private User createdUser;
	@ManyToOne
	@JoinColumn(name="ACCOUNT_HEAD_FK")
	private AccountHead accountHead;
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
	public Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	
	
	public String getSystemRemarks() {
		return systemRemarks;
	}
	public void setSystemRemarks(String systemRemarks) {
		this.systemRemarks = systemRemarks;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
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
	
	
	public User getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
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
	public String getTransactionSource() {
		return transactionSource;
	}
	public void setTransactionSource(String transactionSource) {
		this.transactionSource = transactionSource;
	}
	public String getUserRemarks() {
		return userRemarks;
	}
	public void setUserRemarks(String userRemarks) {
		this.userRemarks = userRemarks;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public AccountHead getAccountHead() {
		return accountHead;
	}
	public void setAccountHead(AccountHead accountHead) {
		this.accountHead = accountHead;
	}
	
	
	
	
	
	

}
