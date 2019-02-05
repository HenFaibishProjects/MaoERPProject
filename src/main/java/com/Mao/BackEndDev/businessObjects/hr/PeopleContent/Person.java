package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.Schools.School;
import com.Mao.BackEndDev.datalayer.DaoInterfaces.SchoolDao;

@MappedSuperclass
public abstract class Person {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int personID;
	protected String officialID;
	protected String email;
	protected String title;
	protected String gender;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String phone;
	@Nonnull
	private byte isActive=1;
	protected String commentns;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schoolID")
	protected School school;
	
	
	
	public Person(String officialID, String email, String title, String gender, String firstName, String middleName,
			String lastName, String phone, String commentns)
		 {
		this.officialID = officialID;
		this.email = email;
		this.title = title;
		this.gender = gender;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phone = phone;
		this.isActive = 1;
		this.commentns = commentns;
	}

	
	public Person() {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getCommentns() {
		return commentns;
	}

	public void setCommentns(String commnetns) {
		this.commentns = commnetns;
	}

	public int getPersonID() {
		return personID;
	}
	
	
	
}
