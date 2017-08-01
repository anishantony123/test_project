package com.pos.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pos.entity.embeddable.BaseEntity;

@Entity
@Table(name = "ITEM_MASTER")
public class ItemMaster extends BaseEntity{

	@Id
	@Column(name = "ITEM_CODE")
	private Long itemCode;
	
	@Column(name = "ITEM_NAME")
	private String itemName;
	
	
	
	@Column(name = "INCLUDE_TAX")
	private Boolean includeTax;
	@Column(name = "CAN_SELL")
	private Boolean canSell;
	@Column(name = "CAN_BUY")
	private Boolean canBuy;
	
	@Column(name = "STATUS")
	private Character status;
	
	@Column(name = "ITEM_TYPE")
	private Character itemType;
	
	@Column(name = "SOURCE")
	private Character source;
	
	@Column(name = "REFERENCE")
	private String reference;
	
	@ManyToOne
	@JoinColumn(name="CURRENCY_FK")
	private CurrencyMaster currency;

	@ManyToOne
	@JoinColumn(name="COMPANY_FK")
	private CompanyMaster company;
	
	@ManyToOne
	@JoinColumn(name="MADE_IN_FK")
	private MadeinMaster madeIn;
	

	@ManyToOne
	@JoinColumn(name="ITEM_GROUP_FK")
	private ItemGroup itemGroup;
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="itemMaster")
	private List<ItemMasterItems> itemMasterItems;


	public ItemMaster(){
		
	}
	public ItemMaster(Long itemCode){
		this.itemCode = itemCode;
	}
	public Long getItemCode() {
		return itemCode;
	}


	public void setItemCode(Long itemCode) {
		this.itemCode = itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	

	public Character getItemType() {
		return itemType;
	}


	public void setItemType(Character itemType) {
		this.itemType = itemType;
	}


	public Boolean getIncludeTax() {
		return includeTax;
	}


	public void setIncludeTax(Boolean includeTax) {
		this.includeTax = includeTax;
	}


	public Character getStatus() {
		return status;
	}


	public void setStatus(Character status) {
		this.status = status;
	}


	public CurrencyMaster getCurrency() {
		return currency;
	}


	public void setCurrency(CurrencyMaster currency) {
		this.currency = currency;
	}


	public CompanyMaster getCompany() {
		return company;
	}


	public void setCompany(CompanyMaster company) {
		this.company = company;
	}


	public MadeinMaster getMadeIn() {
		return madeIn;
	}


	public void setMadeIn(MadeinMaster madeIn) {
		this.madeIn = madeIn;
	}


	public ItemGroup getItemGroup() {
		return itemGroup;
	}


	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}


	public List<ItemMasterItems> getItemMasterItems() {
		return itemMasterItems;
	}


	public void setItemMasterItems(List<ItemMasterItems> itemMasterItems) {
		this.itemMasterItems = itemMasterItems;
	}


	public Character getSource() {
		return source;
	}


	public void setSource(Character source) {
		this.source = source;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public Boolean getCanSell() {
		return canSell;
	}


	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}


	public Boolean getCanBuy() {
		return canBuy;
	}


	public void setCanBuy(Boolean canBuy) {
		this.canBuy = canBuy;
	}
	

	

}
