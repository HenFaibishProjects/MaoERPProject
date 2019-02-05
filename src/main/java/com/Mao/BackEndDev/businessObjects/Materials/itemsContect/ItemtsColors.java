package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;

@Entity
@Table(name = "ItemtsColors")
public class ItemtsColors {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemtsColorId;
	private int itemId;
	private String color;
	private String AdditionalToItemColor;
	
	
	
	
	public ItemtsColors(int itemId,String color,String additionalToItemColor) {
		super();
		this.itemId = itemId;
		this.color = color;
		this.AdditionalToItemColor = additionalToItemColor;
	}
	
	public ItemtsColors(ItemtsColors itemtsColors) {
		this.color = itemtsColors.color;
		this.AdditionalToItemColor = itemtsColors.AdditionalToItemColor;
	}
	
	public ItemtsColors() {
		
	}

	public int getItemtsColorId() {
		return itemtsColorId;
	}

	public void setItemtsColorId(int itemtsColorId) {
		this.itemtsColorId = itemtsColorId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAdditionalToItemColor() {
		return AdditionalToItemColor;
	}

	public void setAdditionalToItemColor(String additionalToItemColor) {
		AdditionalToItemColor = additionalToItemColor;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	
}
