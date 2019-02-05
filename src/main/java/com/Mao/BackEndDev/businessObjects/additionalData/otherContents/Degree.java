
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Degree")
public class Degree {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DegreeID")
	int degreeID;
	@Column(name="Belt")
	String belt;
    String stripes;

	public Degree() {
	}
	
	
	public Degree(String belt,String stripes) {
		this.belt = belt;
		this.stripes = stripes;
	}


	public int getDegreeID() {
		return degreeID;
	}


	public void setDegreeID(int degreeID) {
		this.degreeID = degreeID;
	}


	public String getDegreeName() {
		return belt.toString();
	}


	public void setDegreeName(String degreeName) {
		this.belt = degreeName;
	}


	public String getStripes() {
		return stripes.toString();
	}


	public void setStripes(String stripes) {
		this.stripes = stripes;
	}




}

