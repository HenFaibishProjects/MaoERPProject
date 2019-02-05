package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;


import java.util.Date;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.ArivedFrom;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleInterFaces.CustomerAction;


@Entity
@Table(name = "Customers")
public class Customers extends Person {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "memberTypeID")
	protected MemberType memberType;
	protected Date birthDay;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "indicesID")
	protected Indices indices;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ArrivefromID")
	protected ArivedFrom arrivedFrom;

	
	
	
	
	
	public Customers(String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender,String fName, String mName, String lName,
			String phone,String comments,Durationmembership durationmembership, 
			Date startDate,ParticipateClasses participateClasses, String notes,Date birthDay,Date measurementDate,
			int high, float weight, int bloodPressureSystolic,int bloodPressureDiastolic, int pulsePressure,
			float fatPercentage) {
		     
		super(officialID, email, title, gender, fName, mName, lName, phone, comments);
		this.indices = new Indices(startDate, high, weight, bloodPressureSystolic, bloodPressureDiastolic, pulsePressure, fatPercentage);
		this.memberType = new MemberType(durationmembership, startDate, participateClasses, notes);
		this.birthDay = birthDay;
		this.arrivedFrom = null;
	}
	
	
	public Customers(Boolean IsAnOccasionalCustomer) {
		super("00000000", null, null, null, null, null, null, null, "This is an AnOccasionalCustomer"); 
		this.birthDay = null;
		this.arrivedFrom = null;
		
	}
	
	public Customers(){
	}
	
	




	public String getOfficialID() {
		return officialID;
	}


	public void setOfficialID(String officialID) {
		this.officialID = officialID;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public MemberType getMemberType() {
		return memberType;
	}


	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Indices getIndices() {
		return indices;
	}


	public void setIndices(Indices indices) {
		this.indices = indices;
	}



	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public ArivedFrom getArrivedFrom() {
		return arrivedFrom;
	}


	public void setArrivedFrom(ArivedFrom arrivedFrom) {
		this.arrivedFrom = arrivedFrom;
	}

	

	}

