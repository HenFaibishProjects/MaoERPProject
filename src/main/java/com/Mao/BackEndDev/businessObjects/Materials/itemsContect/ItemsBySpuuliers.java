package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ItemsBySpuuliyers")
public class ItemsBySpuuliers {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int itemsBySpuuliyersId;
		private int itemId;
		private String spuuliersCode;
		private Date enterToSpecificSuppliyer;
		
		
		public ItemsBySpuuliers(int itemId, String spuuliersCode, Date enterToSpecificSuppliyer) {
			super();
			this.itemId = itemId;
			this.spuuliersCode = spuuliersCode;
			this.enterToSpecificSuppliyer = enterToSpecificSuppliyer;
		}
		
		public ItemsBySpuuliers() {
 
		}

		public int getItemId() {
			return itemId;
		}

		public void setItemId(int itemId) {
			this.itemId = itemId;
		}

		public String getSpuuliyersId() {
			return  spuuliersCode;
		}

		public void setSpuuliyersId(String spuuliersCode) {
			this.spuuliersCode = spuuliersCode;
		}

		public Date getEnterToSpecificSuppliyer() {
			return enterToSpecificSuppliyer;
		}

		public void setEnterToSpecificSuppliyer(Date enterToSpecificSuppliyer) {
			this.enterToSpecificSuppliyer = enterToSpecificSuppliyer;
		}
		
	

}
