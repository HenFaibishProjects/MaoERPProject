package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "SaleItems")
public class SaleItems implements UpdateStock{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int SaleId;
	public Date SaleDate;
	public int quantitySale;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemnumber")
	public Items items;
	public float priceSaleItem;
	public int personID; 
	
	
	
	
	public SaleItems(Date SaleDate, int quantitySale, Items items,float priceSaleItem,int personID) {
		super();
		this.SaleDate = SaleDate;
		this.quantitySale = quantitySale;
		this.items = items;
		this.personID = personID;
	}

	public SaleItems(Date SaleDate, int quantitySale, Items items,float priceSaleItem) {
		super();
		this.SaleDate = SaleDate;
		this.quantitySale = quantitySale;
		this.items = items;
		this.personID = 2;
	}
	
	public SaleItems() {
		
	}

	public int getSaleId() {
		return SaleId;
	}

	public void setSaleId(int SaleId) {
		this.SaleId = SaleId;
	}

	public Date getSaleDate() {
		return SaleDate;
	}

	public void setSaleDate(Date SaleDate) {
		this.SaleDate = SaleDate;
	}

	public int getQuantitySale() {
		return quantitySale;
	}

	public void setQuantitySale(int quantitySale) {
		this.quantitySale = quantitySale;
	}

	public Items getItems() {
		return items;
	}
	
	public float getPriceSaleItems() {
		return priceSaleItem;
	}

	public void setPriceSaleItems(float pricePurchaseItems) {
		this.priceSaleItem = pricePurchaseItems;
	}

	public float getPriceSaleItem() {
		return priceSaleItem;
	}

	public void setPriceSaleItem(float priceSaleItem) {
		this.priceSaleItem = priceSaleItem;
	}

	public int getPersonID() {
		return personID;
	}

	public void setItems(Items items) {
		this.items = items;
	}
	
	
}
