package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Salary")
public class Salary {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int salCode;
	protected int type;
	protected float amount;
	protected Date  givenDate;
	
	
	public Salary() {

	}
	
		public Salary(int type, float amount, Date  givenDate) {
			this.type = type;
			this.amount = amount;
			this.givenDate = givenDate;
		}


		public int getSalCode() {
			return salCode;
		}


		public void setSalCode(int salCode) {
			this.salCode = salCode;
		}


		public int getType() {
			return type;
		}


		public void setType(int type) {
			this.type = type;
		}


		public float getAmount() {
			return amount;
		}


		public void setAmount(float amount) {
			this.amount = amount;
		}


		public Date getGivenDate() {
			return givenDate;
		}


		public void setGivenDate(Date givenDate) {
			this.givenDate = givenDate;
		}
		
		
		
		
}
