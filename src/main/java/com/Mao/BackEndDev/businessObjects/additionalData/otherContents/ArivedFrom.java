package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ArivedFrom")
public class ArivedFrom {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="ArrivefromID")
	   int arrivefromID;
	   @Column(name="Place")
	   String place;
	   
	   
	public ArivedFrom(String place) {
		this.place = place;
	}
	
	
	public int getArrivefromID() {
		return arrivefromID;
	}
	public void setArrivefromID(int arrivefromID) {
		this.arrivefromID = arrivefromID;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
