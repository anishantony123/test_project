package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "STATIC_FILE_EXPORT")
public class StaticFileExport {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "FILE_PATH")
	private String filePath;
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	@Column(name = "FILE_CATEGORY")
	private String fileCategory;
	@Column(name = "FILE_TYPE")
	private String fileType;
	@Lob
	@Column(name = "IMAGE_DATA")
	private String imageData;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFileCategory() {
		return fileCategory;
	}
	public void setFileCategory(String fileCategory) {
		this.fileCategory = fileCategory;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getImageData() {
		return imageData;
	}
	public void setImageData(String imageData) {
		this.imageData = imageData;
	}
	
	

}
