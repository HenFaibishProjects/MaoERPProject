
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DurationPayCheck")
public class DurationPayCheck {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DurationPayCheckID")
	int durationPayCheckID;
	@Column(name="DurationPayCheckName")
	String durationPayCheckTime;
	@Column(name="Additional")
	float durationPayCheckAdditional;
	@Column(name="Comments")
	String durationPayCheckComments;




	public DurationPayCheck(String durationPayCheckTime, float durationPayCheckAdditional,
			String durationPayCheckComments) {
		super();
		this.durationPayCheckTime = durationPayCheckTime;
		this.durationPayCheckAdditional = durationPayCheckAdditional;
		this.durationPayCheckComments = durationPayCheckComments;
	}




	public int getDurationPayCheckID() {
		return durationPayCheckID;
	}




	public void setDurationPayCheckID(int durationPayCheckID) {
		this.durationPayCheckID = durationPayCheckID;
	}




	public String getDurationPayCheckTime() {
		return durationPayCheckTime;
	}




	public void setDurationPayCheckTime(String durationPayCheckTime) {
		this.durationPayCheckTime = durationPayCheckTime;
	}




	public float getDurationPayCheckAdditional() {
		return durationPayCheckAdditional;
	}




	public void setDurationPayCheckAdditional(float durationPayCheckAdditional) {
		this.durationPayCheckAdditional = durationPayCheckAdditional;
	}




	public String getDurationPayCheckComments() {
		return durationPayCheckComments;
	}




	public void setDurationPayCheckComments(String durationPayCheckComments) {
		this.durationPayCheckComments = durationPayCheckComments;
	}





}

