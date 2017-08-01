package com.pos.dto.reports;

import java.util.Date;

public class ReportDataDTO {
	private Date xAxisDate;
	private String xAxisDisplayName;
	private String yAxisData;
	public Date getxAxisDate() {
		return xAxisDate;
	}
	public void setxAxisDate(Date xAxisDate) {
		this.xAxisDate = xAxisDate;
	}
	public String getxAxisDisplayName() {
		return xAxisDisplayName;
	}
	public void setxAxisDisplayName(String xAxisDisplayName) {
		this.xAxisDisplayName = xAxisDisplayName;
	}
	public String getyAxisData() {
		return yAxisData;
	}
	public void setyAxisData(String yAxisData) {
		this.yAxisData = yAxisData;
	}
	
	

}
