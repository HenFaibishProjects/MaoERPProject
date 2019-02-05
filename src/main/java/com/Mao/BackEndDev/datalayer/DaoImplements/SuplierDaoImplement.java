package com.Mao.BackEndDev.datalayer.DaoImplements;



import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Currency;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DaysOfTheWeek;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Employee;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Supplier;
import com.Mao.BackEndDev.datalayer.DaoInterfaces.SuplierDao;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;


public class SuplierDaoImplement extends HibernateStructInfo {

	static final Logger LOG = LoggerFactory.getLogger(SuplierDaoImplement.class);
	
	public Supplier supplier ;
	public DaysOfTheWeek daysOfTheWeek;
	public Address address;
	public Currency currency;
	 
	
	public void addSuppliyerWithHibernate(short usDollars, short nis , short euro , short auDollars ,short sunday, 
			short monday, short tuesday,short  wednesday, short thursday, short friday, short saturday,
			String suplyCode, String name, String id, String phone ,String website,String email ,
			String address1 , String address2 , String city , String country , String region , int zipCode)
	{
		Supplier supplier = new Supplier (
				usDollars,  nis ,  euro ,  auDollars ,   //Currency
				sunday, monday, tuesday, wednesday, thursday, friday, saturday,  //Days of the week
				address1, address2,city,zipCode,region,country, // Address
				name,id,phone ,website,email); //other columns
		
		Currency currency = new Currency(suplyCode, usDollars, nis, euro, auDollars);
		DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek(suplyCode, sunday, monday, tuesday, wednesday, thursday, friday, saturday);
		Address supplier_default_address = new Address(suplyCode,address1,address2,city,zipCode,region,country);
		
		super.saveObject(currency);  
		super.saveObject(daysOfTheWeek); 
		super.saveObject(supplier_default_address); 
		super.saveObject(supplier);

		 
		

	}


	public Supplier getUniqueObjectResultBySuplyCode(int suplyCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("suplyCode", suplyCode));
		return (Supplier) criteria.uniqueResult();
	}

	public Address getUniqueObjectResultByAddressId(int suplyCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Address.class);
		criteria.add(Restrictions.eq("addressID", suplyCode));
		return (Address) criteria.uniqueResult();
	}

	public DaysOfTheWeek getUniqueObjectResultByDaysOfTheWeekId(int suplyCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(DaysOfTheWeek.class);
		criteria.add(Restrictions.eq("daysOfTheWeekID", suplyCode));
		return (DaysOfTheWeek) criteria.uniqueResult();
	}

	public Currency getUniqueObjectResultByCurrencyId(int suplyCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Currency.class);
		criteria.add(Restrictions.eq("CurrencyID", suplyCode));
		return (Currency) criteria.uniqueResult();
	}



	
	public void deleteByid(int supplierID) throws ClassNotFoundException, SQLException {
		supplier = getUniqueObjectResultBySuplyCode(supplierID);

	}


	
	public void ModidyNameSuppliyer(int supplierID, String name) throws ClassNotFoundException, SQLException {
		supplier = getUniqueObjectResultBySuplyCode(supplierID);
		supplier.setName(name);
		saveOrUpdate(supplier);
	}


	
	public void ModidyPhoneSuppliyer(int supplierID, String phone) throws ClassNotFoundException, SQLException {
		supplier = getUniqueObjectResultBySuplyCode(supplierID);
		supplier.setPhone(phone);
		saveOrUpdate(supplier);

	}


	
	public void ModidyWebsiteSuppliyer(int supplierID, String website) throws ClassNotFoundException, SQLException {
		supplier = getUniqueObjectResultBySuplyCode(supplierID);
		supplier.setWebsite(website);
		saveOrUpdate(supplier);

	}


	
	public void ModidyEmailSuppliyer(int supplierID, String email) throws ClassNotFoundException, SQLException {
		supplier = getUniqueObjectResultBySuplyCode(supplierID);
		supplier.setEmail(email);
		saveOrUpdate(supplier);

	}


	
	public void ModidyTaxScanSuppliyer(int supplierID, int tax) throws ClassNotFoundException, SQLException {
		//TODO : make it done.
	}

	
	public void ModidyWorkingDaySuppliyer(int supplierID, String day ,short workingOrNot) throws ClassNotFoundException, SQLException {
		daysOfTheWeek = getUniqueObjectResultByDaysOfTheWeekId(supplierID);
		switch(day){  
		case "sunday": daysOfTheWeek.setSunday(workingOrNot);break;  
		case "monday": daysOfTheWeek.setMonday(workingOrNot);break;
		case "tuesday": daysOfTheWeek.setTuesday(workingOrNot); break;
		case "wednesday": daysOfTheWeek.setWednesday(workingOrNot); break;
		case "thursday": daysOfTheWeek.setThursday(workingOrNot); break;
		case "friday": daysOfTheWeek.setFriday(workingOrNot); break;
		case "saturday": daysOfTheWeek.setSaturday(workingOrNot); ;break;}
		//TODO: case that is not aproval day: Debag the exact error 
		saveOrUpdate(daysOfTheWeek);

	}

	
	public void ModidyCurrencySuppliyer(int supplierID, String currencyName , short exists) throws ClassNotFoundException, SQLException {
		currency = getUniqueObjectResultByCurrencyId(supplierID);

		switch(currencyName) {
		case "UsDollars": currency.setUsDollars(exists);break;
		case "Euro": currency.setEuro(exists);break;
		case "Nis": currency.setNis(exists);break;
		case "Dollars" :currency.setAuDollars(exists);break;}	
		saveOrUpdate(currency);


	}

	
	public void ModidyAdressSuppliyer(int supplierID, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException {
		address = getUniqueObjectResultByAddressId(supplierID);
		switch(addressContent){  
		case "address1": address.setAddress1(newaddressContent);break;  
		case "address2": address.setAddress2(newaddressContent);break;
		case "city": address.setCity(newaddressContent); break;
		case "zipCode": 
			int newaddressContentZip =  Integer.parseInt(newaddressContent);
			address.setZipCode(newaddressContentZip); 
			break;
		case "region": address.setRegion(newaddressContent); break;
		case "country": address.setCountry(newaddressContent); break;}
		System.out.println(address.toString());
		saveOrUpdate(address);
	}


	


}
