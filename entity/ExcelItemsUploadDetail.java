package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EXCEL_ITEMS_UPLOAD_DETAIL")
public class ExcelItemsUploadDetail {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "ITEM_NAME")
	private String itemname;
	@Column(name = "ITEM_GROUP")
	private String itemgroup;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "MADE")
	private String made;
	@Column(name = "CURRENCY")
	private String currency;
	@Column(name = "INCLUDE_TAX")
	private String includetax;
	@Column(name = "UNIT")
	private String unit;
	@Column(name = "IS_PRIMARY_UNIT")
	private Boolean isPrimaryUnit;
	@Column(name = "BUY_RATE")
	private Double buyrate;
	@Column(name = "SALE_RATE")
	private Double salerate;
	@Column(name = "INIT_STOCK")
	private Long initstock;
	@Column(name = "INIT_STOCK_PRICE")
	private Double initstockprice;
	@Column(name = "REORDER_QTY")
	private Long reorderqty;
	@Column(name = "LOOSE_UNITCODE_ONE")
	private String looseunitcodeone;
	@Column(name = "LOOSE_UNITVALUE_ONE")
	private Double looseunitvalueone;
	@Column(name = "LOOSE_UNITCODE_TWO")
	private String looseunitcodetwo;
	@Column(name = "LOOSE_UNITVALUE_TWO")
	private Double looseunitvaluetwo;
	@Column(name = "LOOSE_UNITCODE_THREE")
	private String looseunitcodethree;
	@Column(name = "LOOSE_UNITVALUE_THREE")
	private Double looseunitvaluethree;
	@Column(name = "COMMENTS")
	private String comments;
	@Column(name = "ENTRY_STATUS")
	private String entryStatus;
	
	@ManyToOne
	@JoinColumn(name="EXCEL_UPLOAD_SUMMARY_FK")
	ExcelItemsUploadSummary excelItemsUploadSummary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemgroup() {
		return itemgroup;
	}

	public void setItemgroup(String itemgroup) {
		this.itemgroup = itemgroup;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIncludetax() {
		return includetax;
	}

	public void setIncludetax(String includetax) {
		this.includetax = includetax;
	}

	

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	

	public Boolean getIsPrimaryUnit() {
		return isPrimaryUnit;
	}

	public void setIsPrimaryUnit(Boolean isPrimaryUnit) {
		this.isPrimaryUnit = isPrimaryUnit;
	}

	public Double getBuyrate() {
		return buyrate;
	}

	public void setBuyrate(Double buyrate) {
		this.buyrate = buyrate;
	}

	public Double getSalerate() {
		return salerate;
	}

	public void setSalerate(Double salerate) {
		this.salerate = salerate;
	}

	public Long getInitstock() {
		return initstock;
	}

	public void setInitstock(Long initstock) {
		this.initstock = initstock;
	}

	public Long getReorderqty() {
		return reorderqty;
	}

	public void setReorderqty(Long reorderqty) {
		this.reorderqty = reorderqty;
	}

	public String getLooseunitcodeone() {
		return looseunitcodeone;
	}

	public void setLooseunitcodeone(String looseunitcodeone) {
		this.looseunitcodeone = looseunitcodeone;
	}

	public Double getLooseunitvalueone() {
		return looseunitvalueone;
	}

	public void setLooseunitvalueone(Double looseunitvalueone) {
		this.looseunitvalueone = looseunitvalueone;
	}

	public String getLooseunitcodetwo() {
		return looseunitcodetwo;
	}

	public void setLooseunitcodetwo(String looseunitcodetwo) {
		this.looseunitcodetwo = looseunitcodetwo;
	}

	public Double getLooseunitvaluetwo() {
		return looseunitvaluetwo;
	}

	public void setLooseunitvaluetwo(Double looseunitvaluetwo) {
		this.looseunitvaluetwo = looseunitvaluetwo;
	}

	public String getLooseunitcodethree() {
		return looseunitcodethree;
	}

	public void setLooseunitcodethree(String looseunitcodethree) {
		this.looseunitcodethree = looseunitcodethree;
	}

	public Double getLooseunitvaluethree() {
		return looseunitvaluethree;
	}

	public void setLooseunitvaluethree(Double looseunitvaluethree) {
		this.looseunitvaluethree = looseunitvaluethree;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ExcelItemsUploadSummary getExcelItemsUploadSummary() {
		return excelItemsUploadSummary;
	}

	public void setExcelItemsUploadSummary(
			ExcelItemsUploadSummary excelItemsUploadSummary) {
		this.excelItemsUploadSummary = excelItemsUploadSummary;
	}

	public String getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	public Double getInitstockprice() {
		return initstockprice;
	}

	public void setInitstockprice(Double initstockprice) {
		this.initstockprice = initstockprice;
	}
	
	
	
}
