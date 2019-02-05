package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClassLevel")
public class Dayscode {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DayscodeID")
	int DayscodeID;
	@Column(name="DayscodeName")
	String dayscodeName;


	public Dayscode(String DayscodeName) {
		this.dayscodeName = DayscodeName;
	}


	public int getDayscodeID() {
		return DayscodeID;
	}


	public void setDayscodeID(int dayscodeID) {
		DayscodeID = dayscodeID;
	}


	public String getDayscodeName() {
		return dayscodeName;
	}


	public void setDayscodeName(String dayscodeName) {
		this.dayscodeName = dayscodeName;
	}

	
	
}