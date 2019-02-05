package com.Mao.BackEndDev;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.ItemtsColors;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.hr.Schools.Role;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DropTables;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;
import com.Mao.BackEndDev.datalayer.DaoImplements.CustomersDaoImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.EmployeeDaoImpl;
import com.Mao.BackEndDev.datalayer.DaoImplements.ItemsImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.PurchaseImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.SchoolImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.SellingImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.SuplierDaoImplement;



public class StartNG {

	
	public InitialValues initialValues = new InitialValues();
	public String answer;
	static final Logger LOG = LoggerFactory.getLogger(StartNG.class);

	@Test( enabled = true )
	public  void dropTables() throws Exception {
		DropTables.doit();
	}

	@Test( enabled = true)
	public  void initialHRValues() throws Exception {
				initialValues.initialHRValuesIntoDB();	

		}

	@Test( enabled = true)
	public void addInitialSuppliyer() {
		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
			suplierDaoImplement.addSuppliyerWithHibernate((short)1,(short) 1,(short) 1,(short) 1,(short) 1,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0, "564", "Hen", "036316123", "0542689621", "http://www.mao.com", "maoservices@mao.com", "ginat egoz", null, "pardes hana", "Israel", "Center", 8854715);
			LOG.info("addInitialSuppliyer finished without any problems");

	}
	
	
	@Test( enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "employees")
	public  void addInitiaEmployee(String address1, String address2, String city, int zipCode, String region, String country,
	        String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,String comments,
	        String MAtype,String description,
	        SalTypeEnum salTypeEnum,float amount, Date givenDate,
	        Date startDate,Date endDate , int isInstructor )
	{
		Date date = new Date();
		date.setTime(1497096009);
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
			employeeDaoImpl.addEmployee(  address1,  address2,  city,  zipCode,  region,  country,
			         officialID,  email,  title,  gender, fName,  mName,  lName, phone, comments,
			         salTypeEnum, amount,  givenDate,
			         startDate, endDate,isInstructor);	
			LOG.info("addInitiaEmployee finished without any problems"); 

	}
		
	

	@Test(groups = { "addMATypeAndDiplomaPerInstructor" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addMATypeAndDiplomaPerInstructor")
	public  void addMATypeAndDiplomaPerInstructor(String InstructorofficialId, String type,String belt,int stripes,String diplomaName, String schooleName, Date given)
			{
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.addMAAndDeplomaPerInstructor(InstructorofficialId, type, belt, stripes, diplomaName, schooleName, given);	
		LOG.info("addMATypeAndDiplomaPerInstructor finished without any problems"); 
	}
	
	
	@Test(groups = { "changeBelt" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "changeBelt")
	public  void changeBelt(String personId,String type,String belt)
			{
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.changeBelt(personId, type, belt);
		LOG.info("changeBelt finished without any problems"); 

	}
	
	
	@Test(groups = { "changeNumberOfStripes" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "changeNumberOfStripes")
	public void changeNumberOfStripes(String personId,String type,int stripes)
			{
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.changeNumberOfStripes(personId, type, stripes);
			}
	
	@Test(groups = { "changeDiplomaName" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "changeDiplomaName")
	public  void changeDiplomaName(String personId,String type,String Name)
			{
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.changeDiplomaName(personId, type, Name);
			}
	
	@Test(groups = { "changeDiplomaSchooleName" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "changeDiplomaSchooleName")
	public  void changeDiplomaSchooleName(String personId,String type,String schooleName)
			{
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.changeDiplomaSchool(personId, type, schooleName);
			}
	

	@Test( enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "customers")
	public  void addInitiaCustomer(String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,String comments
			 ,Durationmembership durationmembership, Date startDate,ParticipateClasses participateClasses, String notes,
			 Date birthDay,Date measurementDate, int high, float weight, int bloodPressureSystolic,int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
		     CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
	        	customersDaoImplement.add( address1,  address2,  city,  zipCode,  region,  country,
				 officialID,  email,  title,  gender, fName,  mName,  lName, phone, comments
				 , durationmembership,  startDate, participateClasses,  notes,
				  birthDay, measurementDate,  high,  weight,  bloodPressureSystolic, bloodPressureDiastolic,  pulsePressure,  fatPercentage);
		
	}
	@Test( enabled = true)	
	public  void addInitiaAnOccasionalCustomer() throws ClassNotFoundException, SQLException {
		CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
		customersDaoImplement.addAnOccasionalCustomer();
	}
	
	@Test( enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addDegreeToSpecifiCustomer")
	public  void addDegreeToSpecifiCustomer(String customerID,String MA,String belt,int stripes)
			{
		CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
		customersDaoImplement.createDegreePerMACustomer(customerID, MA, belt, stripes);
		
			}
	
	@Test( enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "changeDegreeToSpecifiCustomer")
	public  void changeDegreeToSpecifiCustomer(String customerID,String MA,String belt,int stripes)
			{
		CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
		customersDaoImplement.changeDegreeForCustomer(customerID, MA, belt, stripes);
		
			}
	
	@Test(groups = { "addItems" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addItems")
	public  void addItems(EnumItemList subitemlist, String name, String model, String manufacturer,
			Date firstArrived, String barCode,  
			float weight, EnumCatergoty category, String comments,
			int mounthsWarrenty, float width, float length, float height, String madeIn,
			String color,String additionalToItemColor , int spuuliersCode) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addItems(subitemlist, name, model, manufacturer, firstArrived, barCode, weight, category, comments, mounthsWarrenty, width, length, height, madeIn);
		itemsImplement.addColors( color, additionalToItemColor, barCode); 
		itemsImplement.addItemsBySpuuliyers(barCode, spuuliersCode, firstArrived);
	}
	
	@Test(groups = { "addAnotherColorToTheItem" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addAnotherColorToTheItem")
	public  void addAnotherColorToTheItem(String barCode,String additionalToItemColor,String color) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addColors( color, additionalToItemColor, barCode); 
	}
	
	@Test(groups = { "addSizeToItem" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addSizeToItem")
	public void addSizeToItem(String barCode,String size,String notes) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addSize(barCode,size, notes); 
	}
	
	@Test(enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "purchaseItemsFromSupplier")
	public void purchaseItemsFromSupplier(Date purchaseDate, int quantityPurchase, String barCode,float pricePurchaseItems) {
		PurchaseImplement purchaseImplement = new PurchaseImplement();
		purchaseImplement.addPurchases(purchaseDate, quantityPurchase, barCode, pricePurchaseItems);
	}
	
	@Test(enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "purchaseItemsFromSupplier")
	public void purchaseItemsFromSupplierAgainSameMount(Date purchaseDate, int quantityPurchase, String barCode,float pricePurchaseItems) {
		PurchaseImplement purchaseImplement = new PurchaseImplement();
		purchaseImplement.addPurchases(purchaseDate, quantityPurchase, barCode, pricePurchaseItems);
	}
	
	@Test(enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "sellItemsExistingCustomer")
	public void saleItemstoExistCustomer(Date sellDate, int quantityPurchase, String barCode,float priceSaleItems,String OfficialID) {
		CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
		SellingImplement sellingImplement =new SellingImplement();
		sellingImplement.addSale(sellDate, quantityPurchase, barCode, priceSaleItems, customersDaoImplement.getUniqueObjectResultByOfficialId(OfficialID).getPersonID());	}
	
	@Test(enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "sellItemsPublicCustomer")
	public void saleItemstoPublicCustomer(Date sellDate, int quantityPurchase, String barCode,float priceSaleItems) {
		SellingImplement sellingImplement =new SellingImplement();
		sellingImplement.addSalePublicCustomer(sellDate, quantityPurchase, barCode, priceSaleItems);	
		}
	
	@Test(enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addNewSchool")
	public void addNewSchool(String uniqueId,String name, String mainTelNumber, String personIdOrSupplierCode,String address1, String address2, String city, int zipCode, String region, String country, String commnets,
			String managerFullName, String email, String wbesite,
			String useNname, String password, Date creationTime) {
		SchoolImplement schoolImplement = new SchoolImplement();
		schoolImplement.addScoole(uniqueId,name, mainTelNumber, personIdOrSupplierCode, address1, address2, city, zipCode, region, country, commnets, managerFullName, email, wbesite, useNname, password, creationTime);
		
	}
	
}



