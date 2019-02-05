package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Currency;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DaysOfTheWeek;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DaysOfTheWeekEnum;

@Entity
public class Supplier {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int suplyCode;
	protected String name;
	protected String id;
	protected String phone; 
	protected String website;
	protected String email;  
	String taxScan;
	@Nonnull
	private byte isActive=1;


	
	public Supplier() {
	
	}
	
	public Supplier(short usDollars, short nis , short euro , short auDollars ,short sunday, short monday, short tuesday,short  wednesday, short thursday, short friday, short saturday ,String address1, String address2, String city, int zipCode, String region, String country, String name, String id, String phone ,String website,String email) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.website = website;
		this.email = email;
	}

	
	public int getSuplyCode() {
		return suplyCode;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getPhone() {
		return this.phone;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;

	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public void setSuplyCode(int suplyCode) {
		this.suplyCode = suplyCode;
	}




	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTaxScan() {
		return taxScan;
	}

	public void setTaxScan(String taxScan) {
		this.taxScan = taxScan;
	}

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}




	
}
