 package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PurchaseItems")
public class PurchaseItems implements UpdateStock{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int purchaseId;
	public Date purchaseDate;
	public float pricePurchaseItems;
	public int quantityPurchase;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemnumber")
	public Items items;
	
	
	
	
	public PurchaseItems(Date purchaseDate, int quantityPurchase, Items items,float pricePurchaseItems) {
		super();
		this.purchaseDate = purchaseDate;
		this.quantityPurchase = quantityPurchase;
		this.items = items;
		this.pricePurchaseItems = pricePurchaseItems;
	}

	public PurchaseItems() {
		
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantityPurchase() {
		return quantityPurchase;
	}

	public void setQuantityPurchase(int quantityPurchase) {
		this.quantityPurchase = quantityPurchase;
	}

	public Items getItems() {
		return items;
	}

	public float getPricePurchaseItems() {
		return pricePurchaseItems;
	}

	public void setPricePurchaseItems(float pricePurchaseItems) {
		this.pricePurchaseItems = pricePurchaseItems;
	}
	
	
	
}
