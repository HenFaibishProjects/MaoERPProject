package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.Date;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;


@Entity
@Table(name = "Employee")
public class Employee extends Person {

	private Date startDate;
	private Date endDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salaryID")
	private Salary salary;
	private int mAType;
	private int isInstructor;
	
	public Employee(String address1, String address2, String city, int zipCode, String region, String country,
			        String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone, String comments,
			        SalTypeEnum salTypeEnum,float amount, Date givenDate,
			        Date startDate,Date endDate,int isTrainer)
                	{
						super(officialID, email, title, gender, fName, mName, lName, phone, comments);
		    			this.startDate = startDate;
		    			this.endDate = endDate;
		    			this.isInstructor = isTrainer;
		    		}
	
	
	public Employee()
        	{

    		}
	



	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date   endDate) {
		this.endDate = endDate;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficialID() {
		return officialID;
	}



	public void setOfficialID(String officialID) {
		this.officialID = officialID;
	}



	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public int getmAType() {
		return mAType;
	}


	public void setmAType(int mAType) {
		this.mAType = mAType;
	}



	public int getIsInstructor() {
		return isInstructor;
	}







	public void setIsTrainer(int isInstructor) {
		this.isInstructor = isInstructor;
	}
	
	



	
	}


