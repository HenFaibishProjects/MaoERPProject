 
package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;

@Entity
@Table(name = "School")
public class School {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int schoolID;
	protected String uniqueId;
	public String name;
	public String mainTelNumber;
	public String commnets;
	public String managerFullName;
	public String email;
	public String wbesite;

	
	public School(String uniqueId,String name, String mainTelNumber, String personIdOrSupplierCode,String address1, String address2, String city, int zipCode, String region, String country , String commnets,
			String managerFullName, String email, String wbesite,String useNname, String password, Date creationTime,String roleName
			) 
	{
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.mainTelNumber = mainTelNumber;
		this.commnets = commnets;
		this.managerFullName = managerFullName;
		this.email = email;
		this.wbesite = wbesite;

	}
	
	public School(String name, Outpost outpost, String mainTelNumber, Address mainOfficeAddress, String commnets,
			String managerFullName, String email, String wbesite) {
		super();
		this.name = name;
		this.mainTelNumber = mainTelNumber;
		this.commnets = commnets;
		this.managerFullName = managerFullName;
		this.email = email;
		this.wbesite = wbesite;
	}
	
	public School() {
 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainTelNumber() {
		return mainTelNumber;
	}

	public void setMainTelNumber(String mainTelNumber) {
		this.mainTelNumber = mainTelNumber;
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

	public int getSchoolID() {
		return schoolID;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}


