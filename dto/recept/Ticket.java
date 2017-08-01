package com.pos.dto.recept;

import java.util.List;

public class Ticket {
	private Long id;
	private String heading;
	private String subHeading1;
	private String subHeading2;
	private String subHeading3;
	private String accountName;
	private Long accountId;
	private String salesman;
	private String datetime;
	private String orderId;
	private List<TicketItem> ticketItems;
	private Double total;
	private Double totalDiscount;
	private Double totalTax;
	private Double subTotal;
	private Double savedAmount;
	private String paymentType;
	private Character paymentMethod;
	private String footer1;
	private String footer2;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getSubHeading1() {
		return subHeading1;
	}
	public void setSubHeading1(String subHeading1) {
		this.subHeading1 = subHeading1;
	}
	public String getSubHeading2() {
		return subHeading2;
	}
	public void setSubHeading2(String subHeading2) {
		this.subHeading2 = subHeading2;
	}
	public String getSubHeading3() {
		return subHeading3;
	}
	public void setSubHeading3(String subHeading3) {
		this.subHeading3 = subHeading3;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<TicketItem> getTicketItems() {
		return ticketItems;
	}
	public void setTicketItems(List<TicketItem> ticketItems) {
		this.ticketItems = ticketItems;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public Double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Double getSavedAmount() {
		return savedAmount;
	}
	public void setSavedAmount(Double savedAmount) {
		this.savedAmount = savedAmount;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getFooter1() {
		return footer1;
	}
	public void setFooter1(String footer1) {
		this.footer1 = footer1;
	}
	public String getFooter2() {
		return footer2;
	}
	public void setFooter2(String footer2) {
		this.footer2 = footer2;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public Character getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(Character paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
	
	
	

}
