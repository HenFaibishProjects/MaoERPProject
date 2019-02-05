package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DaysOfTheWeek")
public class DaysOfTheWeek {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DaysOfTheWeekID")
	public int daysOfTheWeekID;
	@Column(name="suppliyerID")
	public String suppliyerID;
	@Column(name="Sunday")
	public short sunday;
	@Column(name="Monday")
	public short monday;
	@Column(name="Tuesday")
	public short tuesday;
	@Column(name="Wednesday")
	public short wednesday;
	@Column(name="Thursday")
	public short thursday;
	@Column(name="Friday")
	public short friday;
	@Column(name="Saturday")
	public short saturday;
	
	
	
	
	public DaysOfTheWeek(String suppliyerID, short sunday, short monday, short tuesday, short wednesday,
		short thursday, short friday, short saturday) {
		this.suppliyerID = suppliyerID;
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
	}




	public int getDaysOfTheWeekID() {
		return daysOfTheWeekID;
	}




	public void setDaysOfTheWeekID(int daysOfTheWeekID) {
		this.daysOfTheWeekID = daysOfTheWeekID;
	}




	public short getSunday() {
		return sunday;
	}




	public void setSunday(short sunday) {
		this.sunday = sunday;
	}




	public short getMonday() {
		return monday;
	}




	public void setMonday(short monday) {
		this.monday = monday;
	}




	public short getTuesday() {
		return tuesday;
	}




	public void setTuesday(short tuesday) {
		this.tuesday = tuesday;
	}




	public short getWednesday() {
		return wednesday;
	}




	public void setWednesday(short wednesday) {
		this.wednesday = wednesday;
	}




	public short getThursday() {
		return thursday;
	}




	public void setThursday(short thursday) {
		this.thursday = thursday;
	}




	public short getFriday() {
		return friday;
	}




	public void setFriday(short friday) {
		this.friday = friday;
	}




	public short getSaturday() {
		return saturday;
	}




	public void setSaturday(short saturday) {
		this.saturday = saturday;
	}
	

	
	
	
	
}
