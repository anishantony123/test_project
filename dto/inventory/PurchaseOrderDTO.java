package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;

public class PurchaseOrderDTO {
	private Long id;
	private String remarks;
	private CurrencyDTO currency;
	private Date orderDate;
	private Date dueDate;
	private AccountHeadDTO supplier;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private UserDTO user;
	private Double totalAmount;
	private Double grandTotal;
	private Double totalDiscount;
	private Double totalTaxAmount;
	private Double totalExpense;
	private Double totalIntegratedTax;
	private Double totalStateTax;
	private Double totalCentralTax;
	private Double totalCess;
	private Boolean printReceipt;
	
	
	private List<ItemDTO> items;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public CurrencyDTO getCurrency() {
		return currency;
	}


	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
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


	public AccountHeadDTO getSupplier() {
		return supplier;
	}


	public void setSupplier(AccountHeadDTO supplier) {
		this.supplier = supplier;
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
	
	
	
	
	


}
