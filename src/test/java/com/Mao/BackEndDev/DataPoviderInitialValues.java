package com.Mao.BackEndDev;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumsizesItems;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.datalayer.DaoImplements.CustomersDaoImplement;

public class DataPoviderInitialValues {



	@DataProvider(name = "customers")
	public static Object[][] addingCustomers() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{
				"Lea-David", "", "Haifa", 2342342, "Haifa-Krayot", "Israel", "234234234423", "Roy.Dekel@solaredge.com", "MR", "Male", "Roy", "TheRock", "Dekel", "052-858745847", "An exemple Customer", Durationmembership.Semester, date, ParticipateClasses.TwoTimesPerWeek, "An exemple Customer", date, date, 178, 85f, 160, 80, 85, 18f},
		};
	}

	@DataProvider(name = "employees")
	public static Object[][] addingEmployees() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {

			{"ballon 12", "shdera", "Nesher",   221454,  "North",  "Israel", "2221414113", "davidlevi@gmail.com",   "Mister", "Mail",   "David",   " " ,   "Levi",  "054-51125252", "Exemple-Employee",     "test The System", "GCenter", SalTypeEnum.ByClass, 180f, date, date, date,1},
			{"harduf 36", "hatzav", "TelAviv", 34234, "Center", "Israel", "3321414123", "tonimanda@gmail.com", "Miss",   "Femail", "Toni", "Laura", "Manda", "052-52525252", "Exemple-Employee",  "test The System",  "GCenter", SalTypeEnum.ByHouer, 85f, date, date, date,0},
			{"dardan 80", "etzyon", "Haifa",   2232,  "North",  "Israel", "3321414113", "elilevi@gmail.com",   "Mister", "Mail",   "Eli",   " " ,   "Levi",  "052-52525252", "Exemple-Employee",    "test The System", "GCenter", SalTypeEnum.ByWeek, 18f, date, date, date,1},
		};
	}


	@DataProvider(name = "addItems")
	public static Object[][] addItems() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{ EnumItemList.BagsGloves,"GlovesPro","DR5","J324X",date,"FSD32DSAAD",35.5f,EnumCatergoty.Pro,"comment2",36,20f,30f,1.6f,"Israel",EnumColor.LIGHTBLUE.toString(),AdditionalToItemColor.mixedColors.toString(),1}
		};
	}  



	@DataProvider(name = "addAnotherColorToTheItem")
	public static Object[][] addAnotherColorToTheItem() throws Exception {
		return new Object[][] {
			{  "FSD32DSAAD",AdditionalToItemColor.logo.toString(),EnumColor.GREY.toString()}
		};
	} 

	@DataProvider(name = "addSizeToItem")
	public static Object[][] addSizeToItem() throws Exception {
		return new Object[][] {
			{"FSD32DSAAD", EnumsizesItems.A4.toString(),"notes",}
		};
	} 
	@DataProvider(name = "addMATypeAndDiplomaPerInstructor")
	public static Object[][] addMATypeAndDiplomaPerInstructor() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{   
				"2221414113", "karate", "Black01", 0, "General", "Winagte", date	
			}
		};
	} 

	@DataProvider(name = "changeBelt")
	public static Object[][] changeBelt() throws Exception {
		return new Object[][] {
			{   
				"2221414113", "karate", "Black02"	
			}
		};
	} 

	@DataProvider(name = "changeNumberOfStripes")
	public static Object[][] changeNumberOfStripes() throws Exception {
		return new Object[][] {
			{   
				"2221414113", "karate", 1	
			}
		};
	} 

	@DataProvider(name = "changeDiplomaName")
	public static Object[][] changeDiplomaName() throws Exception {
		return new Object[][] {
			{   
				"2221414113", "karate", "Special"	
			}
		};
	} 

	@DataProvider(name = "changeDiplomaSchooleName")
	public static Object[][] changeDiplomaSchooleName() throws Exception {
		return new Object[][] {
			{   
				"2221414113", "karate", "UN-Tel Aviv"	
			}
		};
	} 


	@DataProvider(name = "addDegreeToSpecifiCustomer")
	public static Object[][] addDegreeToSpecifiCustomer() throws Exception {
		return new Object[][] {
			{   
				"234234234423", "karate", "Blue",2	
			}
		};
	} 


	@DataProvider(name = "changeDegreeToSpecifiCustomer")
	public static Object[][] changeDegreeToSpecifiCustomer() throws Exception {

		return new Object[][] {
			{   
				"234234234423", "karate", "Blue",3
			}
		};
	} 

	@DataProvider(name = "purchaseItemsFromSupplier")
	public static Object[][] purchaseItemsFromSupplier() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{   // Date purchaseDate, int quantityPurchase, String barCode,float pricePurchaseItems
				date, 10, "FSD32DSAAD",45f
			}
		};
	} 

	@DataProvider(name = "sellItemsExistingCustomer")
	public static Object[][] sellItemsExistingCustomer() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{    // Date sellDate, int quantityPurchase, String barCode,float priceSaleItems,String OfficialID
				date, 2, "FSD32DSAAD",75f,"234234234423"
			}
		};
	} 

	@DataProvider(name = "sellItemsPublicCustomer")
	public static Object[][] sellItemsPublicCustomer() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{    // Date sellDate, int quantityPurchase, String barCode,float priceSaleItems
				date, 2, "FSD32DSAAD",80f
			}
		};
	} 

	@DataProvider(name = "addNewSchool")
	public static Object[][] addNewSchool() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		//String name, String mainTelNumber, String personIdOrSupplierCode,String address1, String address2, String city, int zipCode, String region, String country, String commnets,
		//String managerFullName, String email, String wbesite,
		//String useNname, String password, Date creationTime
		return new Object[][] {
			{"HP99123","MMA Israel","09-9873231","999209320","David Pinkas",null,"Netania",23121,"Sharon","Israel",null,"Amir Boaron","mmaisrael@mma.com","www.mmaisrael.co.il","amirb","password",date}};

	}




}
