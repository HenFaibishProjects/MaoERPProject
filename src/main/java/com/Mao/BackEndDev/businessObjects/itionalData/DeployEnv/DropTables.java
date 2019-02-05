package com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv;



import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.Mao.BackEndDev.datalayer.DbConnections.JdbcDbData;


public class DropTables extends JdbcDbData {

	public DropTables() throws ClassNotFoundException, SQLException {
		super();

	}

	public static String dropFK = "SET FOREIGN_KEY_CHECKS = 0";
	public static String dropEmployees = "DROP TABLE employee";
	public static String dropArivedFrom = "DROP TABLE arivedFrom";
	public static String dropSalaryType = "DROP TABLE salaryType";
	public static String dropClassLevel = "DROP TABLE classLevel";
	public static String dropMaTypeToTrainer = "DROP TABLE MaTypeToTrainer";
	public static String dropDegrees = "DROP TABLE degree";
	public static String dropmatype = "DROP TABLE maTypeTable";
	public static String dropMemberType = "DROP TABLE memberType";                
	public static String dropDiploma = "DROP TABLE diploma";                
	public static String dropdefaultaddress = "DROP TABLE defaultaddress";               
	public static String dropMaTypeTable = "DROP TABLE maTypeTable";               
	public static String dropSalType = "DROP TABLE salType";                
	public static String dropSalary = "DROP TABLE salary";               
	public static String dropSupplier = "DROP TABLE supplier";               
	public static String dropdaysoftheweek = "DROP TABLE daysoftheweek";               
	public static String dropcurency = "DROP TABLE currency";               
	public static String droplevel = "DROP TABLE level";               
	public static String dropCustomers = "DROP TABLE customers";
	public static String dropPayment = "DROP TABLE PaymentMembership";
	public static String dropInsurance = "DROP TABLE insurance";
	public static String dropindices = "DROP TABLE indices";
	public static String dropItemsColors = "DROP TABLE itemtscolors ";
	public static String dropLenthsize = "DROP TABLE lenthsize ";
	public static String droSsizeItems = "DROP TABLE  sizesitems";
	public static String dropItems = "DROP TABLE Items";
	public static String dropMatypetoinstructor = "DROP TABLE matypetoinstructor ";
	public static String dropItemsbyspuuliyers = "DROP TABLE itemsbyspuuliyers ";
	public static String dropMatypetrainer = "DROP TABLE matypetrainer ";
	public static String dropStock = "DROP TABLE stock ";
	public static String dropPurchaseitems = "DROP TABLE purchaseitems";
	public static String dropSaleitems = "DROP TABLE saleitems";
	public static String dropAccount= "DROP TABLE Account";
	public static String dropRole= "DROP TABLE Role";
	public static String dropSchool= "DROP TABLE School";
	public static String dropSchoolOutpostAddress = "DROP TABLE SchoolOutpostAddress";
	public static String dropOutpost = "DROP TABLE Outpost";


	public static void doittest() throws Exception {

		initdb();
		executeTheQuerty(dropFK).executeUpdate();
		System.out.println("all FOREIGN_KEY deleted");
	}

		public static void doit() throws Exception {

		initdb();
		executeTheQuerty(dropFK).executeUpdate();
		System.out.println("all FOREIGN_KEY deleted"); 
		
		if (checkifTableExists("employee")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropEmployees).executeUpdate();
			System.out.println("employees deleted"); }

		if (checkifTableExists("supplier")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSupplier).executeUpdate();
			System.out.println("supplier deleted"); }

		if (checkifTableExists("customers")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropCustomers).executeUpdate();
			System.out.println("customers deleted"); }

		if (checkifTableExists("arivedFrom")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropArivedFrom).executeUpdate();
			System.out.println("arivedFrom deleted"); }

		if (checkifTableExists("salaryType")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSalaryType).executeUpdate();
			System.out.println("salaryType deleted"); }

		if (checkifTableExists("classLevel")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropClassLevel).executeUpdate();
			System.out.println("classLevel deleted"); }

		if (checkifTableExists("MaTypeToTrainer")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropMaTypeToTrainer).executeUpdate();
			System.out.println("MaTypeToTrainer deleted"); }

		if (checkifTableExists("degree")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropDegrees).executeUpdate();
			System.out.println("degrees deleted"); }

		if (checkifTableExists("maTypeTable")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropmatype).executeUpdate();
			System.out.println("maTypeTable deleted"); }

		if (checkifTableExists("matypetoinstructor")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropMatypetoinstructor).executeUpdate();
			System.out.println("Matypetoinstructor deleted"); }


		if (checkifTableExists("diploma")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropDiploma).executeUpdate();
			System.out.println("diploma deleted"); }

		if (checkifTableExists("defaultaddress")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropdefaultaddress).executeUpdate();
			System.out.println("defaultaddress deleted"); }

		if (checkifTableExists("salType")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSalType).executeUpdate();
			System.out.println("salType deleted"); }

		if (checkifTableExists("salary")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSalary).executeUpdate();
			System.out.println("salary deleted"); }

		if (checkifTableExists("daysoftheweek")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropdaysoftheweek).executeUpdate();
			System.out.println("daysoftheweek deleted"); }

		if (checkifTableExists("currency")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropcurency).executeUpdate();
			System.out.println("curency deleted"); }

		if (checkifTableExists("memberType")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropMemberType).executeUpdate();
			System.out.println("memberType deleted"); }

		if (checkifTableExists("PaymentMembership")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropPayment).executeUpdate();
			System.out.println("payment deleted"); }

		if (checkifTableExists("insurance")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropInsurance).executeUpdate();
			System.out.println("insurance deleted"); }

		if (checkifTableExists("indices")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropindices).executeUpdate();
			System.out.println("indices deleted"); }

		if (checkifTableExists("itemtscolors")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropItemsColors).executeUpdate();
			System.out.println("ItemsColors deleted"); }

		if (checkifTableExists("lenthsize")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropLenthsize).executeUpdate();
			System.out.println("lenthsize deleted"); }

		if (checkifTableExists("sizesitems")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(droSsizeItems).executeUpdate();
			System.out.println("sizeItems deleted"); }


		if (checkifTableExists("purchaseitems")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropPurchaseitems).executeUpdate();
			System.out.println("purchaseitems deleted"); }

		
		if (checkifTableExists("saleitems")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSaleitems).executeUpdate();
			System.out.println("saleitems deleted"); }
		
		
		if (checkifTableExists("stock")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropStock).executeUpdate();
			System.out.println("stock deleted"); }

		if (checkifTableExists("Items")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropItems).executeUpdate();
			System.out.println("Items deleted"); }

		if (checkifTableExists("itemsbyspuuliyers")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropItemsbyspuuliyers).executeUpdate();
			System.out.println("Itemsbyspuuliyers deleted"); }

		if (checkifTableExists("matypetrainer")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropMatypetrainer).executeUpdate();
			System.out.println("matypetrainer deleted"); }
		
		if (checkifTableExists("outpost")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropOutpost).executeUpdate();
			System.out.println("Outpost  deleted"); }
		
		if (checkifTableExists("School")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSchool).executeUpdate();
			System.out.println("School  deleted"); }	


		if (checkifTableExists("schoolOutpostAddress")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropSchoolOutpostAddress).executeUpdate();
			System.out.println("SchoolOutpostAddress  deleted"); }
		
		if (checkifTableExists("Account")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
		executeTheQuerty(dropAccount).executeUpdate();
		System.out.println("Account  deleted"); }
		
		if (checkifTableExists("Role")==1)  {
			executeTheQuerty(dropFK).executeUpdate();
			executeTheQuerty(dropRole).executeUpdate();
			System.out.println("Role deleted"); }

	}
}
