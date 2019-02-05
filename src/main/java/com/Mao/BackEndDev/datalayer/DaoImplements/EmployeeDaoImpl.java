package com.Mao.BackEndDev.datalayer.DaoImplements;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Employee;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.MaTypeToInstructor;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Salary;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class EmployeeDaoImpl extends HibernateStructInfo  {

	static final Logger LOG = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	private Employee employee;
	private Address address;
	private Salary salary;
	public InitialValues initialValues = new InitialValues();


	public void addEmployee (String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,String comments,
			SalTypeEnum salTypeEnum,float amount, Date givenDate,
			Date startDate,Date endDate , int isInstructor) {

		Employee createEmployee = new Employee(address1,  address2,  city,  zipCode,  region,  country,
				officialID,  email,  title,  gender, fName,  mName,  lName, phone,  comments,
				salTypeEnum, amount,  givenDate,
				startDate, endDate,isInstructor);
		Address defaultAddress = new Address(officialID ,address1, address2, city, zipCode, region, country);
		this.salary = new Salary(salTypeEnumnumber(salTypeEnum), amount, givenDate);
		super.saveObject(defaultAddress);
		super.saveObject(createEmployee);
	}


	public void addMAAndDeplomaPerInstructor(String instructorofficialId, String type,String belt,int stripes,String diplomaName, String schooleName, Date given)
	{

		Diploma dimploma = new Diploma(diplomaName, schooleName, given);
		MaTypeToInstructor maTypeToInstructor = new MaTypeToInstructor(getUniqueObjectResultByOfficialId(instructorofficialId).getPersonID(), getUniqueMaTypenewResultByOfficialMAType(type), belt, stripes,dimploma);
		super.saveObject(maTypeToInstructor);

	} 

	public Employee getUniqueObjectResultByOfficialId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		return (Employee) criteria.uniqueResult();

	}

	public int getUniqueMaTypenewResultByOfficialMAType(String type){  
		beginTranscation();
		Criteria criteria = session.createCriteria(MaTypenew.class);
		criteria.add(Restrictions.eq("type", type));
		MaTypenew maTypenew = (MaTypenew) criteria.uniqueResult();
		if (maTypenew != null) {
			return maTypenew.getId();
		}
		else 
			return addNewMAType(type);

	}

	@SuppressWarnings("unchecked")
	public MaTypeToInstructor getUniqueByPersonIDAndMA(String personId,String type){ 
		beginTranscation();
		List<MaTypeToInstructor> list = session.createCriteria(MaTypeToInstructor.class).list();
		for (MaTypeToInstructor tmpList : list) {
			{
				if ((tmpList.getInstructorId() == getUniqueObjectResultByOfficialId(personId).getPersonID()) && (tmpList.getMaId() == getUniqueMaTypenewResultByOfficialMAType(type)));
				return tmpList;						
			}
		}
		return null;

	}

	public void changeBelt (String personId,String type,String belt) {
		beginTranscation();
		Criteria criteria = session.createCriteria(MaTypeToInstructor.class);
		criteria.add(Restrictions.eq("maTypeToInstructorId", getUniqueByPersonIDAndMA(personId, type).getMaTypeToInstructorId()));
		MaTypeToInstructor maTypeToInstructor = (MaTypeToInstructor) criteria.uniqueResult();
		maTypeToInstructor.setBelt(belt);
		saveOrUpdate(maTypeToInstructor);
	}


	public void changeNumberOfStripes (String personId,String type,int stripes) {
		beginTranscation();
		Criteria criteria = session.createCriteria(MaTypeToInstructor.class);
		criteria.add(Restrictions.eq("maTypeToInstructorId", getUniqueByPersonIDAndMA(personId, type).getMaTypeToInstructorId()));
		MaTypeToInstructor maTypeToInstructor = (MaTypeToInstructor) criteria.uniqueResult();
		maTypeToInstructor.setStripes(stripes);
		saveOrUpdate(maTypeToInstructor);
	}


	public void changeDiplomaSchool(String personId,String type,String schooleName) {
		beginTranscation();
		Criteria criteria = session.createCriteria(Diploma.class);
		Diploma diploma = getUniqueByPersonIDAndMA(personId, type).getDiploma();
		criteria.add(Restrictions.eq("DiplomaID", diploma.getDiplomaID()));
		diploma.setSchooleName(schooleName);
		saveOrUpdate(diploma);

	}


	public void changeDiplomaGivenDate(String personId,String type,Date given ) {
		beginTranscation();
		Criteria criteria = session.createCriteria(Diploma.class);
		Diploma diploma = getUniqueByPersonIDAndMA(personId, type).getDiploma();
		criteria.add(Restrictions.eq("DiplomaID", diploma.getDiplomaID()));
		diploma.setGiven(given);
		saveOrUpdate(diploma);

	}

	public void changeDiplomaName(String personId,String type,String Name) {
		beginTranscation();
		Criteria criteria = session.createCriteria(Diploma.class);
		Diploma diploma = getUniqueByPersonIDAndMA(personId, type).getDiploma();
		criteria.add(Restrictions.eq("DiplomaID", diploma.getDiplomaID()));
		diploma.setDiplomaName(Name);
		saveOrUpdate(diploma);

	}

	private int addNewMAType(String type) {
		MaTypenew maTypenew = new MaTypenew(type);
		super.saveObject(maTypenew);
		return maTypenew.getId();
	}

	private int salTypeEnumnumber(SalTypeEnum salTypeEnum) {
		int salTypeById=0;

		switch (salTypeEnum.toString()) {
		case ("ByHouer"):
			salTypeById = 1;break;
		case ("ByClass"):
			salTypeById = 2;break;
		case ("ByWeek"):
			salTypeById = 3;break;
		case ("ByMounth"):
			salTypeById = 4;break;
		case ("ByYear"):
			salTypeById = 5;break;
		}
		return salTypeById;
	}
	public Address getUniqueObjectResultByOfficialIdAddress(String personIdOrSupplierCode){  
		beginTranscation();
		Criteria criteriaAddress = session.createCriteria(Address.class);
		criteriaAddress.add(Restrictions.eq("personIdOrSupplierCode", personIdOrSupplierCode));
		return (Address) criteriaAddress.uniqueResult();

	}



	public Salary getUniqueObjectResultBySallId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		Criteria criteriaSalary = session.createCriteria(Salary.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		Employee tmp = (Employee) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getSalary().getSalCode();
		criteriaSalary.add(Restrictions.eq("salCode", tmpAddIdInt));
		return (Salary) criteriaSalary.uniqueResult();

	}



	public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setIsActive((byte) (0));
		saveOrUpdate(employee);

	}




	public void ModifyNameEmployeeFirstName(String OfficialId, String firstName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setFirstName(firstName);
		saveOrUpdate(employee);

	}

	public void ModifyNameEmployeeMiddleName(String OfficialId, String middleName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setMiddleName(middleName);
		saveOrUpdate(employee);

	}

	public void ModifyNameEmployeeLastName(String OfficialId, String lastName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setLastName(lastName);
		saveOrUpdate(employee);

	}

	public void ModifyPhoneEmployee(String OfficialId, String phone) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setPhone(phone);
		saveOrUpdate(employee);

	}



	public void ModifyEndWorkingDateEmployee(String OfficialId, Date date) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEndDate(date);
		saveOrUpdate(employee);

	}



	public void ModifyEmailEmployee(String OfficialId, String email) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEmail(email);
		saveOrUpdate(employee);

	}


	public void ModifyNotesEmployee(String OfficialId, String commnetns) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setCommentns(commnetns);
		saveOrUpdate(employee);
	}



	public void ModidyAdressEmployee(String OfficialId, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException {
		address = getUniqueObjectResultByOfficialIdAddress(OfficialId);
		switch(addressContent){
		case "address1": address.setAddress1(newaddressContent);break;  
		case "address2": address.setAddress2(newaddressContent);break;
		case "city":     address.setCity(newaddressContent); break;
		case "zipCode":  address.setZipCode(Integer.parseInt(newaddressContent));break; 	
		case "region":   address.setRegion(newaddressContent); break;
		case "country":  address.setCountry(newaddressContent); break;}
		saveOrUpdate(address);
	}

	public void ModifySalEmployee(String OfficialId,float amount) throws ClassNotFoundException, SQLException {
		Date date = new Date();
		salary = getUniqueObjectResultBySallId(OfficialId);
		salary.setGivenDate(date);
		salary.setAmount(amount);
		saveOrUpdate(salary);

	}







}
