package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;

@Entity
@Table(name = "MaTypeToInstructor")
public class MaTypeToInstructor {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="maTypeToTrainer")
	private int maTypeToInstructorId;
	private int icstructorId;
	private int maId;
	private String belt;
	private int stripes;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "diplomaID")
	private Diploma diploma;
	
	
	public MaTypeToInstructor(int trainerId, int maId) {
		super();
		this.icstructorId = trainerId;
		this.maId = maId;
		
	}
	
	public MaTypeToInstructor(int icstructorId, int maId,String belt,int stripes,Diploma diploma) {
		super();
		this.icstructorId = icstructorId;
		this.maId = maId;
		this.belt = belt;
		this.stripes = stripes;
		this.diploma = diploma;
	}

	
	public MaTypeToInstructor() {

	}


	public int getMaTypeToInstructorId() {
		return maTypeToInstructorId;
	}


	public void setMaTypeToInstructorId(int maTypeToInstructorId) {
		this.maTypeToInstructorId = maTypeToInstructorId;
	}


	public int getInstructorId() {
		return icstructorId;
	}


	public void setInstructorId(int trainerId) {
		this.icstructorId = trainerId;
	}


	public int getMaId() {
		return maId;
	}


	public String getBelt() {
		return belt;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public int getStripes() {
		return stripes;
	}

	public void setStripes(int stripes) {
		this.stripes = stripes;
	}

	public Diploma getDiploma() {
		return diploma;
	}

	public void setDiploma(Diploma diploma) {
		this.diploma = diploma;
	}


	public void setMaId(int maId) {
		this.maId = maId;
	}
	
	
	
}
