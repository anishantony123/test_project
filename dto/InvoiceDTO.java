package com.pos.dto;

import java.util.Date;

public class InvoiceDTO {
	private Long invNo;
	private Date billDate;
	public Long getInvNo() {
		return invNo;
	}
	public void setInvNo(Long invNo) {
		this.invNo = invNo;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	

}
