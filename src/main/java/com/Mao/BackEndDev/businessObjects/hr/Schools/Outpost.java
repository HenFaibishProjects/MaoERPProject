package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.io.File;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;

	@Entity
	@Table(name = "Outpost")
	public class Outpost {
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		protected int outpostID;
		public String name;
		public String telNumber;
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "SOaddressID")
		public SchoolOutpostAddress mainOfficeAddress;
		public String commnets;
		public String managerFullName;
		public String email;
		public String wbesite;
		
		
		public Outpost(String name, String telNumber, SchoolOutpostAddress mainOfficeAddress, String commnets,
				String managerFullName, String email, String wbesite) {
			super();
			this.name = name;
			this.telNumber = telNumber;
			this.mainOfficeAddress = mainOfficeAddress;
			this.commnets = commnets;
			this.managerFullName = managerFullName;
			this.email = email;
			this.wbesite = wbesite;
		}
		
		public Outpost() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTelNumber() {
			return telNumber;
		}

		public void setTelNumber(String telNumber) {
			this.telNumber = telNumber;
		}

		public SchoolOutpostAddress getMainOfficeAddress() {
			return mainOfficeAddress;
		}

		public void setMainOfficeAddress(SchoolOutpostAddress mainOfficeAddress) {
			this.mainOfficeAddress = mainOfficeAddress;
		}

		public String getCommnets() {
			return commnets;
		}

		public void setCommnets(String commnets) {
			this.commnets = commnets;
		}

		public String getManagerFullName() {
			return managerFullName;
		}

		public void setManagerFullName(String managerFullName) {
			this.managerFullName = managerFullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getWbesite() {
			return wbesite;
		}

		public void setWbesite(String wbesite) {
			this.wbesite = wbesite;
		}


		public int getOutpostID() {
			return outpostID;
		}

		
		
}
