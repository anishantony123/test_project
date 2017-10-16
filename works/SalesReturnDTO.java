package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;
import com.pos.entity.AccountHead;
import com.pos.entity.Counter;
import com.pos.entity.CurrencyMaster;
import com.pos.entity.FinancialYear;
import com.pos.entity.SalesReturnItems;
import com.pos.entity.User;

public class SalesReturnDTO {
	private Long orderId;
	private Long sales;
	private Date returnDate;
	private Character status;
	private String reason;
	private String remarks;
	private String paymentType;
	private String paymentMethod;
	private Double totalAmount;
	private Double totalDiscountAmount;
	//This is only for non gst transaction
	private Double totalTaxAmount;
	//This is only for non gst transaction
	private Double totalTaxPercentage;
	//This is for amount to display
	private Double totalTaxAmountDisplay;
	private Character taxUnit;
	private Character taxType;
	private Double totalIntegratedTaxAmount;
	private Double totalIntegratedTaxPercentage;
	private Double totalStateTaxAmount;
	private Double totalStateTaxPercentage;
	private Double totalCentralTaxAmount;
	private Double totalCentralTaxPercentage;
	private Double totalCessAmount;
	private Double totalCessPercentage;
	private Double totalExpenseAmount;
	private Double grandTotal;
	private Double amountSend;
	private AccountHeadDTO customer;
	private AccountHeadDTO paidBank;
	private UserDTO user;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private CurrencyDTO currency;
	private Set<ItemDTO> items;
	private Boolean printReceipt;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getSales() {
		return sales;
	}
	public void setSales(Long sales) {
		this.sales = sales;
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
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Double getTotalDiscountAmount() {
		return totalDiscountAmount;
	}
	public void setTotalDiscountAmount(Double totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}
	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public Double getTotalTaxPercentage() {
		return totalTaxPercentage;
	}
	public void setTotalTaxPercentage(Double totalTaxPercentage) {
		this.totalTaxPercentage = totalTaxPercentage;
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
	public Double getTotalIntegratedTaxAmount() {
		return totalIntegratedTaxAmount;
	}
	public void setTotalIntegratedTaxAmount(Double totalIntegratedTaxAmount) {
		this.totalIntegratedTaxAmount = totalIntegratedTaxAmount;
	}
	public Double getTotalIntegratedTaxPercentage() {
		return totalIntegratedTaxPercentage;
	}
	public void setTotalIntegratedTaxPercentage(Double totalIntegratedTaxPercentage) {
		this.totalIntegratedTaxPercentage = totalIntegratedTaxPercentage;
	}
	public Double getTotalStateTaxAmount() {
		return totalStateTaxAmount;
	}
	public void setTotalStateTaxAmount(Double totalStateTaxAmount) {
		this.totalStateTaxAmount = totalStateTaxAmount;
	}
	public Double getTotalStateTaxPercentage() {
		return totalStateTaxPercentage;
	}
	public void setTotalStateTaxPercentage(Double totalStateTaxPercentage) {
		this.totalStateTaxPercentage = totalStateTaxPercentage;
	}
	public Double getTotalCentralTaxAmount() {
		return totalCentralTaxAmount;
	}
	public void setTotalCentralTaxAmount(Double totalCentralTaxAmount) {
		this.totalCentralTaxAmount = totalCentralTaxAmount;
	}
	public Double getTotalCentralTaxPercentage() {
		return totalCentralTaxPercentage;
	}
	public void setTotalCentralTaxPercentage(Double totalCentralTaxPercentage) {
		this.totalCentralTaxPercentage = totalCentralTaxPercentage;
	}
	public Double getTotalCessAmount() {
		return totalCessAmount;
	}
	public void setTotalCessAmount(Double totalCessAmount) {
		this.totalCessAmount = totalCessAmount;
	}
	public Double getTotalCessPercentage() {
		return totalCessPercentage;
	}
	public void setTotalCessPercentage(Double totalCessPercentage) {
		this.totalCessPercentage = totalCessPercentage;
	}
	public Double getTotalExpenseAmount() {
		return totalExpenseAmount;
	}
	public void setTotalExpenseAmount(Double totalExpenseAmount) {
		this.totalExpenseAmount = totalExpenseAmount;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Double getAmountSend() {
		return amountSend;
	}
	public void setAmountSend(Double amountSend) {
		this.amountSend = amountSend;
	}
	public AccountHeadDTO getCustomer() {
		return customer;
	}
	public void setCustomer(AccountHeadDTO customer) {
		this.customer = customer;
	}
	public AccountHeadDTO getPaidBank() {
		return paidBank;
	}
	public void setPaidBank(AccountHeadDTO paidBank) {
		this.paidBank = paidBank;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
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
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public Set<ItemDTO> getItems() {
		return items;
	}
	public void setItems(Set<ItemDTO> items) {
		this.items = items;
	}
	public Boolean getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
	}
	public Double getTotalTaxAmountDisplay() {
		return totalTaxAmountDisplay;
	}
	public void setTotalTaxAmountDisplay(Double totalTaxAmountDisplay) {
		this.totalTaxAmountDisplay = totalTaxAmountDisplay;
	}
	
	
	
	
 






}
