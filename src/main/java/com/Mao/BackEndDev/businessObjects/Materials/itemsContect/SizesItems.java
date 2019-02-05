package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumsizesItems;

@Entity
@Table(name = "SizesItems")
public class SizesItems {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemtsSizeId;
	private int itemId;
	private String size;
	private String  notes;


	public SizesItems() {

	}
	

	public SizesItems(int itemId,String size, String notes) {
		super();
		this.itemId = itemId;
		this.size = size;
		this.notes = notes;
	}
	public int getItemtsColorId() {
		return itemtsSizeId;
	}

	public String getSize() {
		return size;
	}
	public void setColor(String size) {
		this.size = size;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}







}