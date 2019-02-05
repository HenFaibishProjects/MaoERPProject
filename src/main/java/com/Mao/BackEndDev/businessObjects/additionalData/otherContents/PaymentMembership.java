package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Customers;

@Entity
@Table(name = "CustomerPayments")
public class PaymentMembership {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paymnetID")
	public int paymnetID;
    public String customerID;
    public float mount;
	public Date DatePaid;
	public PaymentSystem paymentSystem;
	public PaymentConception paymentConception;



public PaymentMembership(String customerID, float mount, Date datePaid, PaymentSystem paymentSystem,PaymentConception paymentConception) {
	super();
	this.customerID = customerID;
	this.mount = mount;
	this.DatePaid = datePaid;
	this.paymentSystem = paymentSystem;
	this.paymentConception = paymentConception; 
}



public PaymentMembership() {
	
}

public int getPaymnetID() {
	return paymnetID;
}



public void setPaymnetID(int paymnetID) {
	this.paymnetID = paymnetID;
}



public String getCustomerid() {
	return customerID;
}



public void setCustomerid(String customerID) {
	this.customerID = customerID;
}



public float getMount() {
	return mount;
}



public void setMount(float mount) {
	this.mount = mount;
}



public Date getDatePaid() {
	return DatePaid;
}



public void setDatePaid(Date datePaid) {
	DatePaid = datePaid;
}



public PaymentSystem getPaymentSystem() {
	return paymentSystem;
}



public void setPaymentSystem(PaymentSystem paymentSystem) {
	this.paymentSystem = paymentSystem;
}



public String getCustomerID() {
	return customerID;
}



public void setCustomerID(String customerID) {
	this.customerID = customerID;
}



public PaymentConception getPaymentConception() {
	return paymentConception;
}



public void setPaymentConception(PaymentConception paymentConception) {
	this.paymentConception = paymentConception;
}




}
