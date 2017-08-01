package com.pos.dto.reports;

import java.util.List;

import com.pos.dto.masters.CompanyDTO;

public class ReportDTO {
	private CompanyDTO company;
	private String chartType;
	private boolean canExportToExcel;
	private boolean canExportToPdf;
	private String xAxisUnit;
	private String yAxisUnit;
	private List<ReportDataDTO> reportData;
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public boolean isCanExportToExcel() {
		return canExportToExcel;
	}
	public void setCanExportToExcel(boolean canExportToExcel) {
		this.canExportToExcel = canExportToExcel;
	}
	public boolean isCanExportToPdf() {
		return canExportToPdf;
	}
	public void setCanExportToPdf(boolean canExportToPdf) {
		this.canExportToPdf = canExportToPdf;
	}
	
	public List<ReportDataDTO> getReportData() {
		return reportData;
	}
	public void setReportData(List<ReportDataDTO> reportData) {
		this.reportData = reportData;
	}
	public String getxAxisUnit() {
		return xAxisUnit;
	}
	public void setxAxisUnit(String xAxisUnit) {
		this.xAxisUnit = xAxisUnit;
	}
	public String getyAxisUnit() {
		return yAxisUnit;
	}
	public void setyAxisUnit(String yAxisUnit) {
		this.yAxisUnit = yAxisUnit;
	}
	
	

}
