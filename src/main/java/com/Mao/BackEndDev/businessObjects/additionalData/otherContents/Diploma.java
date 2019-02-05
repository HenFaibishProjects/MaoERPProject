
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Diploma")
public class Diploma {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DiplomaID")
	private int diplomaID;
	@Column(name="DiplomaName")
	private String diplomaName;
	private String schooleName;
	private Date given;

	
	

	public Diploma(String diplomaName, String schooleName, Date given) {
		super();
		this.diplomaName = diplomaName;
		this.schooleName = schooleName;
		this.given = given;
	}
	

	public Diploma() {
	}

	public String getSchooleName() {
		return schooleName;
	}

	public void setSchooleName(String schooleName) {
		this.schooleName = schooleName;
	}

	public Date getGiven() {
		return given;
	}

	public void setGiven(Date given) {
		this.given = given;
	}

	public Diploma(String DiplomaName) {
		this.diplomaName = DiplomaName;
	}


	public int getDiplomaID() {
		return diplomaID;
	}


	public void setDiplomaID(int diplomaID) {
		this.diplomaID = diplomaID;
	}


	public String getDiplomaName() {
		return diplomaName;
	}


	public void setDiplomaName(String diplomaName) {
		this.diplomaName = diplomaName;
	}




}

