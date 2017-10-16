package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;

public class PurchaseReturnDTO {
	private String voucherNo;
	private CurrencyDTO currency;
	private AccountHeadDTO supplier;
	private String purchaseReceiving;
	private String remarks;
	private Date returnDate;
	private Double totalAmount;
	private Double otherDiscount;
	private Double taxAmount;
	private Double grantTotal;
	private Double expenses;	
	private List<ItemDTO> items;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private UserDTO user;
	private String paymentType;
	private String paymentMethod;
	
	
	
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
	public String getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public AccountHeadDTO getSupplier() {
		return supplier;
	}
	public void setSupplier(AccountHeadDTO supplier) {
		this.supplier = supplier;
	}
	public String getPurchaseReceiving() {
		return purchaseReceiving;
	}
	public void setPurchaseReceiving(String purchaseReceiving) {
		this.purchaseReceiving = purchaseReceiving;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
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
	
	
	

}
