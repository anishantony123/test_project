package com.pos.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pos.dto.inventory.PurchaseOrderDTO;
import com.pos.dto.inventory.PurchaseReceivingDTO;
import com.pos.dto.inventory.SalesDTO;
import com.pos.dto.inventory.SalesReturnDTO;
import com.pos.dto.reports.CompanySummaryReportDTO;
import com.pos.dto.reports.ItemSummaryReportDTO;
import com.pos.dto.reports.PurchaseSummaryReportDTO;
import com.pos.dto.reports.SalesSummaryReportDTO;
import com.pos.dto.reports.annotations.Jrxml;
import com.pos.service.ExportReportService;

@Service("exportReportService")
public class ExportReportServiceImpl implements ExportReportService{
	
	@Jrxml(pdf="")
	public byte[] exportSales(Map<String,String> headerParams, SalesDTO salesDTO, String printType) {
		Map<String,Object> parameterMap = new HashMap<String, Object>();
		parameterMap.putAll(headerParams);
		parameterMap.put("saleDate", salesDTO.getSaleDate());
		parameterMap.put("totalAmount", salesDTO.getTotalAmount());
		parameterMap.put("totalDiscountAmount", salesDTO.getTotalDiscountAmount());
		parameterMap.put("totalTaxAmount", salesDTO.getTotalTaxAmount());
		parameterMap.put("totalTaxPercentage", salesDTO.getTotalTaxPercentage());
		parameterMap.put("totalTaxAmountDisplay", salesDTO.getTotalTaxAmountDisplay());
		parameterMap.put("taxType", salesDTO.getTaxType());
		parameterMap.put("totalIntegratedTaxAmount", salesDTO.getTotalIntegratedTaxAmount());
		parameterMap.put("totalStateTaxAmount", salesDTO.getTotalStateTaxAmount());
		parameterMap.put("totalCentralTaxAmount", salesDTO.getTotalCentralTaxAmount());
		parameterMap.put("totalCessAmount", salesDTO.getTotalCessAmount());
		parameterMap.put("totalExpenseAmount", salesDTO.getTotalExpenseAmount());
		parameterMap.put("grandTotal", salesDTO.getGrandTotal());
		parameterMap.put("paymentMethod", salesDTO.getPaymentMethod());
		parameterMap.put("savedAmount", salesDTO.getSavedAmount());
		parameterMap.put("amountReceived", salesDTO.getAmountReceived());
		parameterMap.put("customer", salesDTO.getCustomer().getAccountName());
		parameterMap.put("salesman", salesDTO.getUser().getUsername());
		parameterMap.put("financialYear", salesDTO.getFinancialYear());
		parameterMap.put("itemDataSource", salesDTO.getItems());
		parameterMap.put("remarks", salesDTO.getRemarks());
		
		return null;
	}
	
	public byte[] exportSalesReturn(Map<String,String> headerParams, SalesReturnDTO salesReturnDTO, String printType) {
		Map<String,Object> parameterMap = new HashMap<String, Object>();
		parameterMap.putAll(headerParams);
		parameterMap.put("returnDate", salesReturnDTO.getReturnDate());
		parameterMap.put("totalAmount", salesReturnDTO.getTotalAmount());
		parameterMap.put("totalDiscountAmount", salesReturnDTO.getTotalDiscountAmount());
		parameterMap.put("totalTaxAmount", salesReturnDTO.getTotalTaxAmount());
		parameterMap.put("totalTaxPercentage", salesReturnDTO.getTotalTaxPercentage());
		parameterMap.put("totalTaxAmountDisplay", salesReturnDTO.getTotalTaxAmountDisplay());
		parameterMap.put("taxType", salesReturnDTO.getTaxType());
		parameterMap.put("totalIntegratedTaxAmount", salesReturnDTO.getTotalIntegratedTaxAmount());
		parameterMap.put("totalStateTaxAmount", salesReturnDTO.getTotalStateTaxAmount());
		parameterMap.put("totalCentralTaxAmount", salesReturnDTO.getTotalCentralTaxAmount());
		parameterMap.put("totalCessAmount", salesReturnDTO.getTotalCessAmount());
		parameterMap.put("totalExpenseAmount", salesReturnDTO.getTotalExpenseAmount());
		parameterMap.put("grandTotal", salesReturnDTO.getGrandTotal());
		parameterMap.put("paymentMethod", salesReturnDTO.getPaymentMethod());
		/*parameterMap.put("savedAmount", salesReturnDTO.getSavedAmount());
		parameterMap.put("amountReceived", salesReturnDTO.getAmountReceived());*/
		parameterMap.put("customer", salesReturnDTO.getCustomer().getAccountName());
		parameterMap.put("salesman", salesReturnDTO.getUser().getUsername());
		parameterMap.put("financialYear", salesReturnDTO.getFinancialYear());
		parameterMap.put("itemDataSource", salesReturnDTO.getItems());
		parameterMap.put("remarks", salesReturnDTO.getRemarks());
		
		return null;
	}
	
	public byte[] exportPurchaseOrder(Map<String,String> headerParams, PurchaseOrderDTO purchaseOrderDTO, String printType) {
		Map<String,Object> parameterMap = new HashMap<String, Object>();
		parameterMap.putAll(headerParams);
		parameterMap.put("orderDate", purchaseOrderDTO.getOrderDate());
		parameterMap.put("totalAmount", purchaseOrderDTO.getTotalAmount());
		parameterMap.put("totalDiscountAmount", purchaseOrderDTO.getTotalDiscountAmount());
		parameterMap.put("totalTaxAmount", purchaseOrderDTO.getTotalTaxAmount());
		parameterMap.put("totalTaxPercentage", purchaseOrderDTO.getTotalTaxPercentage());
		parameterMap.put("totalTaxAmountDisplay", purchaseOrderDTO.getTotalTaxAmountDisplay());
		parameterMap.put("taxType", purchaseOrderDTO.getTaxType());
		parameterMap.put("totalIntegratedTaxAmount", purchaseOrderDTO.getTotalIntegratedTaxAmount());
		parameterMap.put("totalStateTaxAmount", purchaseOrderDTO.getTotalStateTaxAmount());
		parameterMap.put("totalCentralTaxAmount", purchaseOrderDTO.getTotalCentralTaxAmount());
		parameterMap.put("totalCessAmount", purchaseOrderDTO.getTotalCessAmount());
		parameterMap.put("totalExpenseAmount", purchaseOrderDTO.getTotalExpenseAmount());
		parameterMap.put("grandTotal", purchaseOrderDTO.getGrandTotal());
		/*parameterMap.put("paymentMethod", purchaseOrderDTO.getPaymentMethod());
		parameterMap.put("savedAmount", purchaseOrderDTO.getSavedAmount());
		parameterMap.put("amountReceived", purchaseOrderDTO.getAmountReceived());*/
		parameterMap.put("supplier", purchaseOrderDTO.getSupplier().getAccountName());
		parameterMap.put("salesman", purchaseOrderDTO.getUser().getUsername());
		parameterMap.put("financialYear", purchaseOrderDTO.getFinancialYear());
		parameterMap.put("itemDataSource", purchaseOrderDTO.getItems());
		parameterMap.put("remarks", purchaseOrderDTO.getRemarks());
		
		return null;
	}
	
	public byte[] exportPurchaseReceiving(Map<String,String> headerParams, PurchaseReceivingDTO purchaseReceivingDTO, String printType) {
		Map<String,Object> parameterMap = new HashMap<String, Object>();
		parameterMap.putAll(headerParams);
		parameterMap.put("receivedDate", purchaseReceivingDTO.getReceivedDate());
		parameterMap.put("totalAmount", purchaseReceivingDTO.getTotalAmount());
		parameterMap.put("totalDiscountAmount", purchaseReceivingDTO.getTotalDiscountAmount());
		parameterMap.put("totalTaxAmount", purchaseReceivingDTO.getTotalTaxAmount());
		parameterMap.put("totalTaxPercentage", purchaseReceivingDTO.getTotalTaxPercentage());
		parameterMap.put("totalTaxAmountDisplay", purchaseReceivingDTO.getTotalTaxAmountDisplay());
		parameterMap.put("taxType", purchaseReceivingDTO.getTaxType());
		parameterMap.put("totalIntegratedTaxAmount", purchaseReceivingDTO.getTotalIntegratedTaxAmount());
		parameterMap.put("totalStateTaxAmount", purchaseReceivingDTO.getTotalStateTaxAmount());
		parameterMap.put("totalCentralTaxAmount", purchaseReceivingDTO.getTotalCentralTaxAmount());
		parameterMap.put("totalCessAmount", purchaseReceivingDTO.getTotalCessAmount());
		parameterMap.put("totalExpenseAmount", purchaseReceivingDTO.getTotalExpenseAmount());
		parameterMap.put("grandTotal", purchaseReceivingDTO.getGrandTotal());
		parameterMap.put("paymentMethod", purchaseReceivingDTO.getPaymentMethod());
		parameterMap.put("savedAmount", purchaseReceivingDTO.getSavedAmount());
		parameterMap.put("amountReceived", purchaseReceivingDTO.getAmountReceived());
		parameterMap.put("supplier", purchaseReceivingDTO.getSupplier().getAccountName());
		parameterMap.put("salesman", purchaseReceivingDTO.getUser().getUsername());
		parameterMap.put("financialYear", purchaseReceivingDTO.getFinancialYear());
		parameterMap.put("itemDataSource", purchaseReceivingDTO.getItems());
		parameterMap.put("remarks", purchaseReceivingDTO.getRemarks());
		
		return null;
	}
	
	public byte[] exportCompanySummary(Map<String,String> headerParams, CompanySummaryReportDTO salesDTO, String printType) {
		
		return null;
	}
	
	public byte[] exportSalesSummary(Map<String,String> headerParams, SalesSummaryReportDTO salesDTO, String printType) {
		
		return null;
	}
	
	public byte[] exportPurchaseSummary(Map<String,String> headerParams, PurchaseSummaryReportDTO salesDTO, String printType) {
		
		return null;
	}
	
	public byte[] exportItemSummary(Map<String,String> headerParams, ItemSummaryReportDTO salesDTO, String printType) {
		
		return null;
	}
}
