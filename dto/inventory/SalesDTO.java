package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;

public class SalesDTO {
	private Long id;
	private Date billDate;
	private String terms;
	private String phone;
	private AccountHeadDTO customer;
	private UserDTO salesman;
	private List<ItemDTO> items;
	private String remarks;
	private Double totalAmount;
	private Double grandTotal;
	private Double totalDiscount;
	private Double totalTaxAmount;
	private Double totalExpense;
	private Double totalIntegratedTax;
	private Double totalStateTax;
	private Double totalCentralTax;
	private Double totalCess;
	private String paymentType;
	private Date saleDate;
	private String sequenceString;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private CurrencyDTO currency;
	private Double discount;
	private String paymentMethod;
	private Double amountReceived;
	private Boolean printReceipt;
	
	
	
	public Boolean getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Double getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(Double amountReceived) {
		this.amountReceived = amountReceived;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public FinancialYearDTO getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYearDTO financialYear) {
		this.financialYear = financialYear;
	}
	public CounterDTO getCounter() {
		return counter;
	}
	public void setCounter(CounterDTO counter) {
		this.counter = counter;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public AccountHeadDTO getCustomer() {
		return customer;
	}
	public void setCustomer(AccountHeadDTO customer) {
		this.customer = customer;
	}
	public UserDTO getSalesman() {
		return salesman;
	}
	public void setSalesman(UserDTO salesman) {
		this.salesman = salesman;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public String getSequenceString() {
		return sequenceString;
	}
	public void setSequenceString(String sequenceString) {
		this.sequenceString = sequenceString;
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
