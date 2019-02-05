package com.Mao.BackEndDev.businessObjects.hr.Schools;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "SchoolOutpostAddress")
public class SchoolOutpostAddress  {
	
       @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="SaddressID")
       public int SOaddressID; 
       public int schoolid;
       public int outpostId;
	   @Column(name="address1")
	   public String address1;	
	   @Column(name="address2")
	   public String address2;
	   @Column(name="city")
	   public String city;
	   @Column(name="zipCode")
	   public int zipCode;
	   @Column(name="region")
	   public String region;
	   @Column(name="country")
	   public String country;

		public SchoolOutpostAddress() {

		}
		
	   
	   
	public SchoolOutpostAddress(String address1, String address2, String city, int zipCode, String region, String country,int schoolId , int outpostId) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.zipCode = zipCode;
		this.region = region;
		this.country = country;
		this.schoolid = schoolId;
		this.outpostId = outpostId;
	}
	
	public SchoolOutpostAddress(String address1, String address2, String city, int zipCode, String region, String country,int schoolId) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.zipCode = zipCode;
		this.region = region;
		this.country = country;
		this.schoolid = schoolId;
		this.outpostId = 1;
	}
	
		
	public int getAddressID() {
		return SOaddressID;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	   public int getschoolOrOutPostUniqueCode() {
		return schoolid;
	}



	public int getSchoolid() {
		return schoolid;
	}



	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}



	public int getOutpostId() {
		return outpostId;
	}



	public void setOutpostId(int outpostId) {
		this.outpostId = outpostId;
	}



	public int getSOaddressID() {
		return SOaddressID;
	}



	


}
