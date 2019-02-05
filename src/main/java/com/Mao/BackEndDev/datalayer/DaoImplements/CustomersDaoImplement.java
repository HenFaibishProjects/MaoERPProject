package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.PaymentConception;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.PaymentMembership;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.PaymentSystem;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Customers;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Indices;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.MaTypeTrainer;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.MemberType;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;


public class CustomersDaoImplement extends HibernateStructInfo  {

	static final Logger LOG = LoggerFactory.getLogger(CustomersDaoImplement.class);
	public Customers customers ;
	public Address address;
	public MemberType memberType;
	public Indices indices;
	public PaymentMembership paymentMembership;



	public Customers getUniqueObjectResultByOfficialId(String customerID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Customers.class);
		criteria.add(Restrictions.eq("officialID", customerID));
		return (Customers) criteria.uniqueResult();

	}


	public Address getUniqueObjectResultByOfficialIdAddress(String personIdOrSupplierCode){  
		beginTranscation();
		Criteria criteriaAddress = session.createCriteria(Address.class);
		criteriaAddress.add(Restrictions.eq("personIdOrSupplierCode", personIdOrSupplierCode));
		return (Address) criteriaAddress.uniqueResult();

	}

	public Indices getUniqueObjectResultByOfficialIdIndices(String customerID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Customers.class);
		Criteria criteriaIndices = session.createCriteria(Indices.class);
		criteria.add(Restrictions.eq("customerID", customerID));
		Customers tmp = (Customers) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getIndices().getIndicesID();
		criteriaIndices.add(Restrictions.eq("indicesID" ,tmpAddIdInt));
		return (Indices) criteriaIndices.uniqueResult();

	}

	public MemberType getUniqueObjectResultByOfficialIdMemberType(String customerID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Customers.class);
		Criteria criteriMemberType = session.createCriteria(MemberType.class);
		criteria.add(Restrictions.eq("customerID", customerID));
		Customers tmp = (Customers) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getMemberType().getMemberTypeID();
		criteriMemberType.add(Restrictions.eq("memberTypeID" ,tmpAddIdInt));
		return (MemberType) criteriMemberType.uniqueResult();

	}

	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,String comments
			,Durationmembership durationmembership, Date startDate,ParticipateClasses participateClasses, String notes,
			Date birthDay,
			Date measurementDate, int high, float weight, int bloodPressureSystolic,int bloodPressureDiastolic, int pulsePressure, float fatPercentage)
					throws ClassNotFoundException, SQLException {

		Customers newCustomers = new Customers(address1, address2, city, zipCode, region, country,
				officialID, email, title, gender, fName, mName, lName, phone, comments, 
				durationmembership, startDate, participateClasses, notes, birthDay, measurementDate, high, weight, bloodPressureSystolic,
				bloodPressureDiastolic,
				pulsePressure, fatPercentage);
		Address defaultAddress = new Address(officialID,address1, address2, city, zipCode, region, country);

		super.saveObject(defaultAddress);
		super.saveObject(newCustomers);  
	} 



	public void addAnOccasionalCustomer() throws ClassNotFoundException, SQLException {
		Customers newCustomers = new Customers(true);
		super.saveObject(newCustomers);  } 




	public void deleteByid(String customerID) throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setIsActive((byte)0);
		super.saveObject(customers);

	}


	public void ModidyNameCustomer(String customerID, String firstName , String lastName ) throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setFirstName(firstName);
		customers.setLastName(lastName);
		super.saveObject(customers);

	}





	public void ModidyDatebirthdayCustomer(String customerID, Date birthday)
			throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setBirthDay(birthday);
		super.saveObject(customers);

	}


	public void ModidyEmailCustomer(String customerID, String email) throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setEmail(email);
		super.saveObject(customers);

	}


	public void ModidyPhoneCustomer(String customerID, String phone) throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setPhone(phone);
		super.saveObject(customers);

	}



	public void ModidyMembershipCustomer(Boolean shouldUpdatePayment , String customerID, PaymentMembership paymets,Durationmembership durationmembership,Date startDate
			,ParticipateClasses participateClasses,String notes ,
			float mount, PaymentSystem paymentSystem,PaymentConception paymentConception
			) throws ClassNotFoundException, SQLException {
		memberType = getUniqueObjectResultByOfficialIdMemberType(customerID);
		memberType.setDurationmembership(durationmembership);
		memberType.setStartDate(startDate);
		memberType.setNotes(notes);
		memberType.setParticipateClasses(participateClasses);
		super.saveObject(memberType);
		if (shouldUpdatePayment) {
			PaymentMembership newpay = new PaymentMembership(customerID, mount, startDate, paymentSystem, paymentConception);	
			super.saveObject(newpay);

		}



	}

	public void ModidyInsuranceCustomerBP(String customerID , int bloodPressureSystolic , int bloodPressureDiastolic){
		indices = getUniqueObjectResultByOfficialIdIndices(customerID);
		indices.setBloodPressureDiastolic(bloodPressureSystolic);
		indices.setBloodPressureSystolic(bloodPressureDiastolic);
		super.saveObject(indices);

	}



	public void ModidyInsuranceCustomerFatPercentage(String customerID , float fatPercentage){
		indices = getUniqueObjectResultByOfficialIdIndices(customerID);
		indices.setFatPercentage(fatPercentage);
		super.saveObject(indices);

	}

	public void ModidyInsuranceCustomerHigh(String customerID , int high){
		indices = getUniqueObjectResultByOfficialIdIndices(customerID);
		indices.setHigh(high);
		super.saveObject(indices);

	}
	public void ModidyInsuranceCustomerPulsePressure(String customerID , int pulsePressure){
		indices = getUniqueObjectResultByOfficialIdIndices(customerID);
		indices.setPulsePressure(pulsePressure);
		super.saveObject(indices);

	}
	public void ModidyInsuranceCustomereight(String customerID , float weight){
		indices = getUniqueObjectResultByOfficialIdIndices(customerID);
		indices.setWeight(weight);
		super.saveObject(indices);

	}

	public void ModidyCommnetnsCustomer(String customerID, String commnetns) throws ClassNotFoundException, SQLException {
		customers = getUniqueObjectResultByOfficialId(customerID);
		customers.setCommentns(commnetns);

	}

	public void setNewIndices(Date measurementDate, int high, float weight, int bloodPressureSystolic,
			int bloodPressureDiastolic, int pulsePressure, float fatPercentage){
		Indices indicesnew = new Indices(measurementDate, high, weight, bloodPressureSystolic, bloodPressureDiastolic, pulsePressure, fatPercentage);
		super.saveObject(indicesnew);	
	}

	public void ModidyAdressCustomer(String customerID, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException {
		address = getUniqueObjectResultByOfficialIdAddress(customerID);
		switch(addressContent){
		case "address1": address.setAddress1(newaddressContent);break;  
		case "address2": address.setAddress2(newaddressContent);break;
		case "city":     address.setCity(newaddressContent); break;
		case "zipCode":  address.setZipCode(Integer.parseInt(newaddressContent));break; 	
		case "region":   address.setRegion(newaddressContent); break;
		case "country":  address.setCountry(newaddressContent); break;}
		saveOrUpdate(address);
	}

	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender, String fName, String mName, String lName,
			String phone, String comments, Durationmembership durationmembership,
			java.util.Date startDate, ParticipateClasses participateClasses, String notes, java.util.Date birthDay,
			java.util.Date measurementDate, int high, float weight, int bloodPressureSystolic, int bloodPressureDiastolic,
			int pulsePressure, float fatPercentage) {

		Customers customer = new Customers(address1, address2, city, zipCode, region, country, 
				officialID, email, title, gender, fName, mName, lName, phone, 
				comments, durationmembership, startDate, participateClasses, notes, birthDay,
				measurementDate, high, weight, bloodPressureSystolic, bloodPressureDiastolic, pulsePressure, fatPercentage);
		super.saveObject(customer); 
	}


	public int getUniqueMaTypenewResultByOfficialMAType(String type){  
		beginTranscation();
		Criteria criteria = session.createCriteria(MaTypenew.class);
		criteria.add(Restrictions.eq("type", type));
		MaTypenew maTypenew = (MaTypenew) criteria.uniqueResult();
		return maTypenew.getId();
	}



	@SuppressWarnings("unchecked")
	public MaTypeTrainer getUniqueMaTypenewResultByOfficialidAndMAType(String customerID,String type){  
		beginTranscation();
		List<MaTypeTrainer> list = session.createCriteria(MaTypeTrainer.class).list();
		for (MaTypeTrainer tmpList : list) {
			{
				if ((tmpList.getTrainerId() == getUniqueObjectResultByOfficialId(customerID).getPersonID()) && (tmpList.getMaId() == getUniqueMaTypenewResultByOfficialMAType(type)));
				return tmpList;						
			}
		}
		return null;

	}




	public void createDegreePerMACustomer(String customerID,String MA,String belt,int stripes) {
		MaTypeTrainer maTypeTrainer = new MaTypeTrainer(getUniqueObjectResultByOfficialId(customerID).getPersonID(), getUniqueMaTypenewResultByOfficialMAType(MA), belt, stripes);
		super.saveOrUpdate(maTypeTrainer);

	}

	public void changeDegreeForCustomer(String customerID,String MA,String belt,int stripes) {
		MaTypeTrainer maTypeTrainer = getUniqueMaTypenewResultByOfficialidAndMAType( customerID, MA);
		maTypeTrainer.setBelt(belt);
		maTypeTrainer.setStripes(stripes);
		super.saveOrUpdate(maTypeTrainer);

	}

}
