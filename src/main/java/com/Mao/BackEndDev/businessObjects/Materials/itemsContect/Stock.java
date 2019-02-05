package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


	
	
	@Entity
	@Table(name = "Stock")
	public class Stock {
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		public int stockId;
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "itemnumber")
		public Items items; 
		public int quantity;
		public float currentMarketPrice;
		@Transient
		public float taxPrice = (float) 1.17; 
		

		
		

		public Stock(Items items, int quantity, float currentMarketPrice) {
			super();
			this.items = items;
			this.quantity = quantity;
			this.currentMarketPrice = currentMarketPrice;
		}

		public Stock() {
		}
		
		public int getStockId() {
			return stockId;
		}
	
		public int getQuantity() {
			return quantity;
		}


		public float getCurrentMarketPrice() {
			return currentMarketPrice;
		}


		public void setCurrentMarketPrice(float currentMarketPrice) {
			this.currentMarketPrice = currentMarketPrice;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public float getFinalCurrentMarketPrice() {
			return (currentMarketPrice*taxPrice);
		}

		public Items getItems() {
			return items;
		}

		public void setItems(Items items) {
			this.items = items;
		}

		public float getTaxPrice() {
			return taxPrice;
		}

		public void setTaxPrice(float taxPrice) {
			this.taxPrice = taxPrice;
		}
		
		

}
