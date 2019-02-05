
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Customers;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Insurance")
@JsonRootName("Insurance")
@Entity
@Table(name = "Insurance")
public class Insurance {

	@XStreamAlias("InsuranceID")
	@JsonProperty("InsuranceID")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="InsuranceID")
	int insuranceID;
	@Column(name="PaymentID")
	@XStreamAlias("PaymentID")
	@JsonProperty("PaymentID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PaymentID", nullable = false)
	PaymentMembership paymentID;
	@XStreamAlias("MemberID")
	@JsonProperty("MemberID")
	@Column(name="MemberID")
	Customers memberID;
	@XStreamAlias("StartDate")
	@JsonProperty("StartDate")
	@Column(name="StartDate")
	Date startDate;
	@XStreamAlias("EndDate")
	@JsonProperty("EndDate")
	@Column(name="EndDate")
	Date endDate;
	
	
	
	public Insurance(int insuranceID, PaymentMembership paymentID, Customers memberID, Date startDate, Date endDate) {
		super();
		this.insuranceID = insuranceID;
		this.paymentID = paymentID;
		this.memberID = memberID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

	public Insurance() {
		
	}


	public int getInsuranceID() {
		return insuranceID;
	}


	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}


	public PaymentMembership getPaymentID() {
		return paymentID;
	}


	public void setPaymentID(PaymentMembership paymentID) {
		this.paymentID = paymentID;
	}


	public Customers getMemberID() {
		return memberID;
	}


	public void setMemberID(Customers memberID) {
		this.memberID = memberID;
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


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
	
}