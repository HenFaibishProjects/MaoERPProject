package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.PurchaseItems;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.Schools.Account;
import com.Mao.BackEndDev.businessObjects.hr.Schools.Outpost;
import com.Mao.BackEndDev.businessObjects.hr.Schools.Role;
import com.Mao.BackEndDev.businessObjects.hr.Schools.School;
import com.Mao.BackEndDev.businessObjects.hr.Schools.SchoolOutpostAddress;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class SchoolImplement extends HibernateStructInfo {
	
	static final Logger LOG = LoggerFactory.getLogger(SchoolImplement.class);
	public School school;
	public Outpost outpost;
	public Address address;
	public final String AdminOnNewSchool = "SchoolAdmin";
	
	public Role getUniqueObjectResultByName(String roleName){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("roleName", roleName));
		return (Role) criteria.uniqueResult();

	}
	
	public School getUniqueObjectResultByUniqueId(String uniqueId){  
		beginTranscation();
		Criteria criteria = session.createCriteria(School.class);
		criteria.add(Restrictions.eq("uniqueId", uniqueId));
		return (School) criteria.uniqueResult();

	}
	
	public void addScoole(String uniqueId,String name, String mainTelNumber, String personIdOrSupplierCode,String address1, String address2, String city, int zipCode, String region, String country, String commnets,
			String managerFullName, String email, String wbesite,
			String useNname, String password, Date creationTime) {
		School school = new School(uniqueId,name, mainTelNumber, personIdOrSupplierCode, address1, address2, city, zipCode, region, country, commnets, managerFullName, email, wbesite, useNname, password, creationTime, "SchoolAdmin");		
		super.saveObject(school);
		Account account  = new Account(useNname, password, creationTime,getUniqueObjectResultByUniqueId(uniqueId).getSchoolID());
		super.saveObject(account);
		SchoolOutpostAddress schoolOutpostAddress = new SchoolOutpostAddress(address1, address2, city, zipCode, region, country,getUniqueObjectResultByUniqueId(uniqueId).getSchoolID());
		super.saveObject(schoolOutpostAddress);
		
		
		
	}

}
