package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "EXCEL_ITEMS_UPLOAD_SUMMARY")
public class ExcelItemsUploadSummary extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "COMPANY_SUCC_COUNT")
	private Long companySuccCount;
	@Column(name = "COMPANY_FAIL_COUNT")
	private Long companyFailCount;
	@Column(name = "CURRENCY_SUCC_COUNT")
	private Long currencySuccCount;
	@Column(name = "CURRENCY_FAIL_COUNT")
	private Long currencyFailCount;
	@Column(name = "MADE_SUCC_COUNT")
	private Long madeSuccCount;
	@Column(name = "MADE_FAIL_COUNT")
	private Long madeFailCount;
	@Column(name = "ITMGRP_SUCC_COUNT")
	private Long iGroupSuccCount;
	@Column(name = "ITMGRP_FAIL_COUNT")
	private Long iGroupFailCount;
	@Column(name = "UNIT_SUCC_COUNT")
	private Long unitSuccCount;
	@Column(name = "UNIT_FAIL_COUNT")
	private Long unitFailCount;
	@Column(name = "ITEM_MASTER_SUCC_COUNT")
	private Long itemMasterSuccCount;
	@Column(name = "ITEM_MASTER_FAIL_COUNT")
	private Long itemMasterFailCount;
	@Column(name = "PROCESSING_STATUS")
	private String processingStatus;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "FILE_TYPE")
	private String fileType;
	@Column(name = "STATUS")
	private Character status;
	@Column(name = "FILE_DATA",columnDefinition = "LONGBLOB")
	private byte[] fileData;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCompanySuccCount() {
		return companySuccCount;
	}
	public void setCompanySuccCount(Long companySuccCount) {
		this.companySuccCount = companySuccCount;
	}
	public Long getCompanyFailCount() {
		return companyFailCount;
	}
	public void setCompanyFailCount(Long companyFailCount) {
		this.companyFailCount = companyFailCount;
	}
	public Long getMadeSuccCount() {
		return madeSuccCount;
	}
	public void setMadeSuccCount(Long madeSuccCount) {
		this.madeSuccCount = madeSuccCount;
	}
	public Long getMadeFailCount() {
		return madeFailCount;
	}
	public void setMadeFailCount(Long madeFailCount) {
		this.madeFailCount = madeFailCount;
	}
	public Long getiGroupSuccCount() {
		return iGroupSuccCount;
	}
	public void setiGroupSuccCount(Long iGroupSuccCount) {
		this.iGroupSuccCount = iGroupSuccCount;
	}
	public Long getiGroupFailCount() {
		return iGroupFailCount;
	}
	public void setiGroupFailCount(Long iGroupFailCount) {
		this.iGroupFailCount = iGroupFailCount;
	}
	public Long getUnitSuccCount() {
		return unitSuccCount;
	}
	public void setUnitSuccCount(Long unitSuccCount) {
		this.unitSuccCount = unitSuccCount;
	}
	public Long getUnitFailCount() {
		return unitFailCount;
	}
	public void setUnitFailCount(Long unitFailCount) {
		this.unitFailCount = unitFailCount;
	}
	
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public String getProcessingStatus() {
		return processingStatus;
	}
	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Long getCurrencySuccCount() {
		return currencySuccCount;
	}
	public void setCurrencySuccCount(Long currencySuccCount) {
		this.currencySuccCount = currencySuccCount;
	}
	public Long getCurrencyFailCount() {
		return currencyFailCount;
	}
	public void setCurrencyFailCount(Long currencyFailCount) {
		this.currencyFailCount = currencyFailCount;
	}
	public Long getItemMasterSuccCount() {
		return itemMasterSuccCount;
	}
	public void setItemMasterSuccCount(Long itemMasterSuccCount) {
		this.itemMasterSuccCount = itemMasterSuccCount;
	}
	public Long getItemMasterFailCount() {
		return itemMasterFailCount;
	}
	public void setItemMasterFailCount(Long itemMasterFailCount) {
		this.itemMasterFailCount = itemMasterFailCount;
	}
	
	
	
	
	

}
