package com.pos.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.pos.dto.inventory.ItemDTO;
import com.pos.dto.inventory.PurchaseOrderDTO;
import com.pos.dto.inventory.PurchaseReceivingDTO;
import com.pos.dto.inventory.SalesDTO;
import com.pos.dto.inventory.SalesReturnDTO;
import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UnitMasterDTO;
import com.pos.util.Constants;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:resources/spring-conf/app-config.xml"})
@TransactionConfiguration(defaultRollback=true)
public class ExportReportTest {
	
	@Autowired
	ExportReportService exportReportService;
	
	@Test
	public void generateSalesReport() {
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap = createHeaderDetails();
		SalesDTO salesDTO = createSalesDTO();
		exportReportService.exportSales(headerMap, salesDTO, Constants.EXPORT_TYPE_PDF);
	}
	
	@Test
	public void generateSalesReturnReport() {
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap = createHeaderDetails();
		SalesReturnDTO salesReturnDTO = createSalesReturnDTO();
		exportReportService.exportSalesReturn(headerMap, salesReturnDTO, Constants.EXPORT_TYPE_PDF);
	}
	
	@Test
	public void generatePurchaseOrderReport() {
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap = createHeaderDetails();
		PurchaseOrderDTO purchaseOrderDTO = createPurchaseOrderDTO();
		exportReportService.exportPurchaseOrder(headerMap, purchaseOrderDTO, Constants.EXPORT_TYPE_PDF);
	}
	
	@Test
	public void generatePurchaseReceivingReport() {
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap = createHeaderDetails();
		PurchaseReceivingDTO purchaseReceivingDTO = createPurchaseReceivingDTO();
		exportReportService.exportPurchaseReceiving(headerMap, purchaseReceivingDTO, Constants.EXPORT_TYPE_PDF);
	}

	
	private SalesDTO createSalesDTO() {
		SalesDTO salesDTO = new SalesDTO();
		salesDTO.setAmountReceived(500.00);
		
		CounterDTO counterDTO = new CounterDTO();
		counterDTO.setDisplayName("Counter 1");
		counterDTO.setIsHeadOffice(true);
		counterDTO.setPrinterName("my printer");
		counterDTO.setScannerName("abc");
		counterDTO.setScannerType("barcode");
		counterDTO.setShortName("C1");
		salesDTO.setCounter(counterDTO);
		salesDTO.setCreditDueDate(new Date());
		CurrencyDTO currencyDTO = new CurrencyDTO();
		currencyDTO.setCurrencyCode(1L);
		currencyDTO.setCurrencyName("RS");
		salesDTO.setCurrency(currencyDTO);
		AccountHeadDTO accountHeadDTO = new AccountHeadDTO();
		accountHeadDTO.setAccountCode("1");
		accountHeadDTO.setAccountName("Customer1");
		salesDTO.setCustomer(accountHeadDTO);
		salesDTO.setFinancialYear(null);
		salesDTO.setGrandTotal(250.00);
		salesDTO.setOrderId(1L);
		salesDTO.setRemarks("This is a remark.");
		salesDTO.setSaleDate(new Date());
		salesDTO.setSavedAmount(100.00);
		salesDTO.setStatus(Constants.STATUS_ACTIVE);
		salesDTO.setTotalAmount(245.00);
		salesDTO.setTotalCentralTaxAmount(2.50);
		salesDTO.setTotalCessAmount(0.00);
		salesDTO.setTotalDiscountAmount(1.00);
		salesDTO.setTotalStateTaxAmount(2.50);
		salesDTO.setTotalIntegratedTaxAmount(5.00);
		salesDTO.setItems(generateSalesItems());
		return salesDTO;
	}

	
	

	private Set<ItemDTO> generateSalesItems() {
		Set<ItemDTO> itemSet = new HashSet<ItemDTO>();
		String[] itemArray = {"MILMA MILK","BOOK 200 PAGES","BEANS NAADAN", "PAVIZHAM 5 KG RICE", "DOUBLE HORSE PUTTU PODI 1 KG PREMIUM PACK"};
		String[] unitArray = {"1 PACKET","1 PIECE","1 KG", "1 KG", "HALF KG"};
		Double[] totalArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] mrpArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] grandTotalArray = {50.00,100.00,75.00,15.00,10.00};
		Long[] qtyArray = {1l,2l,5l,1l,100l};
		
		for(Integer i=0;i<6l;i++){
			ItemDTO itemDTO = new ItemDTO();
			itemDTO.setItemCode(i.longValue());
			itemDTO.setQty(qtyArray[i]);
			itemDTO.setItemName(itemArray[i]);
			itemDTO.setTotalAmount(totalArray[i]);
			itemDTO.setUnitMRPAmount(mrpArray[i]);
			itemDTO.setGrandTotal(grandTotalArray[i]);
			UnitMasterDTO unitMaster = new UnitMasterDTO();
			unitMaster.setCode(i.longValue());
			unitMaster.setName(unitArray[i]);
			itemDTO.setUnit(unitMaster);
			itemSet.add(itemDTO);
		}
		return itemSet;
	}


	private HashMap<String, String> createHeaderDetails() {
		HashMap<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("companyName", "PROFTAIL");
		resultMap.put("gstNo", "GA0012544255");
		resultMap.put("addressLine1", "KOLLAMKUDIMUGAL");
		resultMap.put("addressLine2", "KAKKANAD");
		resultMap.put("phoneNo", "9496461374");
		resultMap.put("faxNo", "04868269073");
		return resultMap;
	}
	
	
	
	private PurchaseOrderDTO createPurchaseOrderDTO() {
		PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
		
		CounterDTO counterDTO = new CounterDTO();
		counterDTO.setDisplayName("Counter 1");
		counterDTO.setIsHeadOffice(true);
		counterDTO.setPrinterName("my printer");
		counterDTO.setScannerName("abc");
		counterDTO.setScannerType("barcode");
		counterDTO.setShortName("C1");
		purchaseOrderDTO.setCounter(counterDTO);
		CurrencyDTO currencyDTO = new CurrencyDTO();
		currencyDTO.setCurrencyCode(1L);
		currencyDTO.setCurrencyName("RS");
		purchaseOrderDTO.setCurrency(currencyDTO);
		AccountHeadDTO accountHeadDTO = new AccountHeadDTO();
		accountHeadDTO.setAccountCode("1");
		accountHeadDTO.setAccountName("Supplier 1");
		purchaseOrderDTO.setSupplier(accountHeadDTO);
		purchaseOrderDTO.setFinancialYear(null);
		purchaseOrderDTO.setGrandTotal(250.00);
		purchaseOrderDTO.setOrderId(1L);
		purchaseOrderDTO.setRemarks("This is a remark.");
		purchaseOrderDTO.setOrderDate(new Date());
		purchaseOrderDTO.setStatus(Constants.STATUS_ACTIVE);
		purchaseOrderDTO.setTotalAmount(245.00);
		purchaseOrderDTO.setTotalCentralTaxAmount(2.50);
		purchaseOrderDTO.setTotalCessAmount(0.00);
		purchaseOrderDTO.setTotalDiscountAmount(1.00);
		purchaseOrderDTO.setTotalStateTaxAmount(2.50);
		purchaseOrderDTO.setTotalIntegratedTaxAmount(5.00);
		purchaseOrderDTO.setItems(generatePurchaseOrderItems());
		return purchaseOrderDTO;
	}

	
	

	private List<ItemDTO> generatePurchaseOrderItems() {
		List<ItemDTO> itemSet = new ArrayList<ItemDTO>();
		String[] itemArray = {"MILMA MILK","BOOK 200 PAGES","BEANS NAADAN", "PAVIZHAM 5 KG RICE", "DOUBLE HORSE PUTTU PODI 1 KG PREMIUM PACK"};
		String[] unitArray = {"1 PACKET","1 PIECE","1 KG", "1 KG", "HALF KG"};
		Double[] totalArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] mrpArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] grandTotalArray = {50.00,100.00,75.00,15.00,10.00};
		Long[] qtyArray = {1l,2l,5l,1l,100l};
		
		for(Integer i=0;i<6l;i++){
			ItemDTO itemDTO = new ItemDTO();
			itemDTO.setItemCode(i.longValue());
			itemDTO.setQty(qtyArray[i]);
			itemDTO.setItemName(itemArray[i]);
			itemDTO.setTotalAmount(totalArray[i]);
			itemDTO.setUnitMRPAmount(mrpArray[i]);
			itemDTO.setGrandTotal(grandTotalArray[i]);
			UnitMasterDTO unitMaster = new UnitMasterDTO();
			unitMaster.setCode(i.longValue());
			unitMaster.setName(unitArray[i]);
			itemDTO.setUnit(unitMaster);
			itemSet.add(itemDTO);
		}
		return itemSet;
	}
	
	
	
	
	private PurchaseReceivingDTO createPurchaseReceivingDTO() {
		PurchaseReceivingDTO purchaseReceivingDTO = new PurchaseReceivingDTO();
		purchaseReceivingDTO.setAmountReceived(500.00);
		
		CounterDTO counterDTO = new CounterDTO();
		counterDTO.setDisplayName("Counter 1");
		counterDTO.setIsHeadOffice(true);
		counterDTO.setPrinterName("my printer");
		counterDTO.setScannerName("abc");
		counterDTO.setScannerType("barcode");
		counterDTO.setShortName("C1");
		purchaseReceivingDTO.setCounter(counterDTO);
		purchaseReceivingDTO.setCreditDueDate(new Date());
		CurrencyDTO currencyDTO = new CurrencyDTO();
		currencyDTO.setCurrencyCode(1L);
		currencyDTO.setCurrencyName("RS");
		purchaseReceivingDTO.setCurrency(currencyDTO);
		AccountHeadDTO accountHeadDTO = new AccountHeadDTO();
		accountHeadDTO.setAccountCode("1");
		accountHeadDTO.setAccountName("Customer1");
		purchaseReceivingDTO.setSupplier(accountHeadDTO);
		purchaseReceivingDTO.setFinancialYear(null);
		purchaseReceivingDTO.setGrandTotal(250.00);
		purchaseReceivingDTO.setOrderId(1L);
		purchaseReceivingDTO.setRemarks("This is a remark.");
		purchaseReceivingDTO.setReceivedDate(new Date());
		purchaseReceivingDTO.setSavedAmount(100.00);
		purchaseReceivingDTO.setStatus(Constants.STATUS_ACTIVE);
		purchaseReceivingDTO.setTotalAmount(245.00);
		purchaseReceivingDTO.setTotalCentralTaxAmount(2.50);
		purchaseReceivingDTO.setTotalCessAmount(0.00);
		purchaseReceivingDTO.setTotalDiscountAmount(1.00);
		purchaseReceivingDTO.setTotalStateTaxAmount(2.50);
		purchaseReceivingDTO.setTotalIntegratedTaxAmount(5.00);
		purchaseReceivingDTO.setItems(generatePurchaseReceivingItems());
		return purchaseReceivingDTO;
		
	}

	
	

	private Set<ItemDTO> generatePurchaseReceivingItems() {
		Set<ItemDTO> itemSet = new HashSet<ItemDTO>();
		String[] itemArray = {"MILMA MILK","BOOK 200 PAGES","BEANS NAADAN", "PAVIZHAM 5 KG RICE", "DOUBLE HORSE PUTTU PODI 1 KG PREMIUM PACK"};
		String[] unitArray = {"1 PACKET","1 PIECE","1 KG", "1 KG", "HALF KG"};
		Double[] totalArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] mrpArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] grandTotalArray = {50.00,100.00,75.00,15.00,10.00};
		Long[] qtyArray = {1l,2l,5l,1l,100l};
		
		for(Integer i=0;i<6l;i++){
			ItemDTO itemDTO = new ItemDTO();
			itemDTO.setItemCode(i.longValue());
			itemDTO.setQty(qtyArray[i]);
			itemDTO.setItemName(itemArray[i]);
			itemDTO.setTotalAmount(totalArray[i]);
			itemDTO.setUnitMRPAmount(mrpArray[i]);
			itemDTO.setGrandTotal(grandTotalArray[i]);
			UnitMasterDTO unitMaster = new UnitMasterDTO();
			unitMaster.setCode(i.longValue());
			unitMaster.setName(unitArray[i]);
			itemDTO.setUnit(unitMaster);
			itemSet.add(itemDTO);
		}
		return itemSet;
	}
	
	

	
	private SalesReturnDTO createSalesReturnDTO() {
		SalesReturnDTO salesReturnDTO = new SalesReturnDTO();
		
		CounterDTO counterDTO = new CounterDTO();
		counterDTO.setDisplayName("Counter 1");
		counterDTO.setIsHeadOffice(true);
		counterDTO.setPrinterName("my printer");
		counterDTO.setScannerName("abc");
		counterDTO.setScannerType("barcode");
		counterDTO.setShortName("C1");
		salesReturnDTO.setCounter(counterDTO);
		CurrencyDTO currencyDTO = new CurrencyDTO();
		currencyDTO.setCurrencyCode(1L);
		currencyDTO.setCurrencyName("RS");
		salesReturnDTO.setCurrency(currencyDTO);
		AccountHeadDTO accountHeadDTO = new AccountHeadDTO();
		accountHeadDTO.setAccountCode("1");
		accountHeadDTO.setAccountName("Customer1");
		salesReturnDTO.setCustomer(accountHeadDTO);
		salesReturnDTO.setFinancialYear(null);
		salesReturnDTO.setGrandTotal(250.00);
		salesReturnDTO.setOrderId(1L);
		salesReturnDTO.setRemarks("This is a remark.");
		salesReturnDTO.setReturnDate(new Date());
		salesReturnDTO.setStatus(Constants.STATUS_ACTIVE);
		salesReturnDTO.setTotalAmount(245.00);
		salesReturnDTO.setTotalCentralTaxAmount(2.50);
		salesReturnDTO.setTotalCessAmount(0.00);
		salesReturnDTO.setTotalDiscountAmount(1.00);
		salesReturnDTO.setTotalStateTaxAmount(2.50);
		salesReturnDTO.setTotalIntegratedTaxAmount(5.00);
		salesReturnDTO.setItems(generateSalesReturnItems());
		return salesReturnDTO;
	}

	
	

	private Set<ItemDTO> generateSalesReturnItems() {
		Set<ItemDTO> itemSet = new HashSet<ItemDTO>();
		String[] itemArray = {"MILMA MILK","BOOK 200 PAGES","BEANS NAADAN", "PAVIZHAM 5 KG RICE", "DOUBLE HORSE PUTTU PODI 1 KG PREMIUM PACK"};
		String[] unitArray = {"1 PACKET","1 PIECE","1 KG", "1 KG", "HALF KG"};
		Double[] totalArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] mrpArray = {50.00,100.00,75.00,15.00,10.00};
		Double[] grandTotalArray = {50.00,100.00,75.00,15.00,10.00};
		Long[] qtyArray = {1l,2l,5l,1l,100l};
		
		for(Integer i=0;i<6l;i++){
			ItemDTO itemDTO = new ItemDTO();
			itemDTO.setItemCode(i.longValue());
			itemDTO.setQty(qtyArray[i]);
			itemDTO.setItemName(itemArray[i]);
			itemDTO.setTotalAmount(totalArray[i]);
			itemDTO.setUnitMRPAmount(mrpArray[i]);
			itemDTO.setGrandTotal(grandTotalArray[i]);
			UnitMasterDTO unitMaster = new UnitMasterDTO();
			unitMaster.setCode(i.longValue());
			unitMaster.setName(unitArray[i]);
			itemDTO.setUnit(unitMaster);
			itemSet.add(itemDTO);
		}
		return itemSet;
	}
	

}
