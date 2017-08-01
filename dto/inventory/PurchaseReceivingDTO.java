package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;

public class PurchaseReceivingDTO {
	private Long voucherNo;
	private String sequenceString;
	private AccountHeadDTO supplier;
	private UserDTO user;
	private CurrencyDTO currency;
	private Date receivingDate;
	private Date creditDueDate;
	private Long poNo;
	private List<ItemDTO> items;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private String paymentType;
	private String remarks;
	private String paymentMethod;
	private Double amountReceived;
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
	public Long getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(Long voucherNo) {
		this.voucherNo = voucherNo;
	}
	public String getSequenceString() {
		return sequenceString;
	}
	public void setSequenceString(String sequenceString) {
		this.sequenceString = sequenceString;
	}
	public AccountHeadDTO getSupplier() {
		return supplier;
	}
	public void setSupplier(AccountHeadDTO supplier) {
		this.supplier = supplier;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public Date getReceivingDate() {
		return receivingDate;
	}
	public void setReceivingDate(Date receivingDate) {
		this.receivingDate = receivingDate;
	}
	public Date getCreditDueDate() {
		return creditDueDate;
	}
	public void setCreditDueDate(Date creditDueDate) {
		this.creditDueDate = creditDueDate;
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
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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
	
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Long getPoNo() {
		return poNo;
	}
	public void setPoNo(Long poNo) {
		this.poNo = poNo;
	}
	public Boolean getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
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
