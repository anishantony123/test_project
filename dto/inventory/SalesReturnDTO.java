package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;

public class SalesReturnDTO {
	private Long id;
 	private String sequenceString;
	private Date returnDate;
	private String remarks;
	private Double grandTotal;
	private Double totalDiscount;
	private Double totalTaxAmount;
	private Double totalExpense;
	private Double totalIntegratedTax;
	private Double totalStateTax;
	private Double totalCentralTax;
	private Double totalCess;
	private String paymentType;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private UserDTO user;
	private AccountHeadDTO customer;
	private CurrencyDTO currency;
	List<ItemDTO> items;
	private Boolean printReceipt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSequenceString() {
		return sequenceString;
	}
	public void setSequenceString(String sequenceString) {
		this.sequenceString = sequenceString;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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

	public CounterDTO getCounter() {
		return counter;
	}
	public void setCounter(CounterDTO counter) {
		this.counter = counter;
	}
	public FinancialYearDTO getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYearDTO financialYear) {
		this.financialYear = financialYear;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public AccountHeadDTO getCustomer() {
		return customer;
	}
	public void setCustomer(AccountHeadDTO customer) {
		this.customer = customer;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public Boolean getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public Double getTotalExpense() {
		return totalExpense;
	}
	public void setTotalExpense(Double totalExpense) {
		this.totalExpense = totalExpense;
	}
	public Double getTotalIntegratedTax() {
		return totalIntegratedTax;
	}
	public void setTotalIntegratedTax(Double totalIntegratedTax) {
		this.totalIntegratedTax = totalIntegratedTax;
	}
	public Double getTotalStateTax() {
		return totalStateTax;
	}
	public void setTotalStateTax(Double totalStateTax) {
		this.totalStateTax = totalStateTax;
	}
	public Double getTotalCentralTax() {
		return totalCentralTax;
	}
	public void setTotalCentralTax(Double totalCentralTax) {
		this.totalCentralTax = totalCentralTax;
	}
	public Double getTotalCess() {
		return totalCess;
	}
	public void setTotalCess(Double totalCess) {
		this.totalCess = totalCess;
	}
	
	
	
 






}
