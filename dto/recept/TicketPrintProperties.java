package com.pos.dto.recept;

public class TicketPrintProperties {
	private String receiptTypeName;
	private boolean showHeader;
	private boolean showFooter;
	private boolean showSubtotal;
	
	private String receiptCopyType;
	
	public TicketPrintProperties() {
		super();
	}

	public TicketPrintProperties(String receiptTypeName, boolean showHeader, boolean showFooter, boolean showSubtotal) {
		super();
		this.receiptTypeName = receiptTypeName;
		this.showHeader = showHeader;
		this.showFooter = showFooter;
		this.showSubtotal = showSubtotal;
	}

	public String getReceiptTypeName() {
		return receiptTypeName;
	}

	public void setReceiptTypeName(String receiptTypeName) {
		this.receiptTypeName = receiptTypeName;
	}

	public boolean isShowHeader() {
		return showHeader;
	}

	public void setShowHeader(boolean showHeader) {
		this.showHeader = showHeader;
	}

	public boolean isShowFooter() {
		return showFooter;
	}

	public void setShowFooter(boolean showFooter) {
		this.showFooter = showFooter;
	}

	public boolean isShowSubtotal() {
		return showSubtotal;
	}

	public void setShowSubtotal(boolean showSubtotal) {
		this.showSubtotal = showSubtotal;
	}

	public String getReceiptCopyType() {
		return receiptCopyType;
	}

	public void setReceiptCopyType(String receiptCopyName) {
		this.receiptCopyType = receiptCopyName;
	}
}
