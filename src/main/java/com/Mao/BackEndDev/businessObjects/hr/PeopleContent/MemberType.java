package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.PaymentMembership;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.PaymentSystem;

@Entity
@Table(name = "MemberType")
public class MemberType {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="memberTypeID")
	protected int memberTypeID;
	protected Durationmembership durationmembership;
	protected Date startDate;
	protected ParticipateClasses participateClasses;
	protected String notes;
	
	
	public MemberType(Durationmembership durationmembership, Date startDate,
			ParticipateClasses participateClasses, String notes) {
		super();
		this.durationmembership = durationmembership;
		this.startDate = startDate;
		this.participateClasses = participateClasses;
		this.notes = notes;
	}
	

	public MemberType() {
		
	}


	public int getMemberTypeID() {
		return memberTypeID;
	}


	public void setMemberTypeID(int memberTypeID) {
		this.memberTypeID = memberTypeID;
	}


	public Durationmembership getDurationmembership() {
		return durationmembership;
	}


	public void setDurationmembership(Durationmembership durationmembership) {
		this.durationmembership = durationmembership;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public ParticipateClasses getParticipateClasses() {
		return participateClasses;
	}


	public void setParticipateClasses(ParticipateClasses participateClasses) {
		this.participateClasses = participateClasses;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	
	
	
	
}
