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
@Table(name = "SALES_RETURN_HISTORY")
public class SalesReturnHistory extends BaseEntity{

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "SR_ID")
	private Long srId;
	@Column(name = "REF_SALE")
	private Long refSale;
	@Column(name = "RETURN_DATE", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date returnDate;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "REMARKS")
	private String remarks;
	@Column(name = "PAYMENT_TYPE")
	private Character paymentType;
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	@Column(name = "EXPENSES")
	private Double expenses;
	@Column(name = "OTHER_DISCOUNT")
	private Double otherDiscount;
	@Column(name = "TAX_AMOUNT")
	private Double taxAmount;
	@Column(name = "GRANT_TOTAL")
	private Double grantTotal;
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
	
	
	
	
	
	
}
