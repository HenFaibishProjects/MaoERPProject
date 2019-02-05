package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Supplier;


@Entity
@Table(name = "Items")
public class Items  {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int itemnumber;
	protected EnumItemList subitemlist;
	protected String name;
	protected String model;
	protected String manufacturer;
	protected Date firstArrived;
	protected String barCode;
	protected float weight;
	protected EnumCatergoty category;
	protected String comments;
	protected int mounthsWarrenty;
	protected String madeIn;
	

	public Items(EnumItemList subitemlist, String name, String model, String manufacturer,
			Date firstArrived, String barCode,
			float weight, EnumCatergoty category, String comments,
			int mounthsWarrenty, LenthSize lenthSize, String madeIn) {
		this.subitemlist = subitemlist;
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.firstArrived = firstArrived;
		this.barCode = barCode;
		this.weight = weight;
		this.category = category;
		this.comments = comments;
		this.mounthsWarrenty = mounthsWarrenty;
		this.madeIn = madeIn;
	}
	
	
	public Items() {
		
	}


	public EnumItemList getSubitemlist() {
		return subitemlist;
	}


	public void setSubitemlist(EnumItemList subitemlist) {
		this.subitemlist = subitemlist;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Date getFirstArrived() {
		return firstArrived;
	}


	public void setFirstArrived(Date firstArrived) {
		this.firstArrived = firstArrived;
	}


	public String getBarode() {
		return barCode;
	}


	public void setBarode(String barode) {
		this.barCode = barode;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public EnumCatergoty getCategory() {
		return category;
	}


	public void setCategory(EnumCatergoty category) {
		this.category = category;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public int getMounthsWarrenty() {
		return mounthsWarrenty;
	}


	public void setMounthsWarrenty(int mounthsWarrenty) {
		this.mounthsWarrenty = mounthsWarrenty;
	}


	public String getMadeIn() {
		return madeIn;
	}


	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}


	public int getItemnumber() {
		return itemnumber;
	}
	
	
	
	
	
}
