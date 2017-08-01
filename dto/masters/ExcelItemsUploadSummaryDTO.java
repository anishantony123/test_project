package com.pos.dto.masters;

import java.util.Date;


public class ExcelItemsUploadSummaryDTO {
	private Long id;
	private Long companySuccCount;
	private Long companyFailCount;
	private Long madeSuccCount;
	private Long madeFailCount;
	private Long iGroupSuccCount;
	private Long iGroupFailCount;
	private Long unitSuccCount;
	private Long unitFailCount;
	private String processingStatus;
	private String fileName;
	private String fileType;
	private Date uploadDate;
	private Character status;
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
	public String getProcessingStatus() {
		return processingStatus;
	}
	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
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
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	
	
	
}
