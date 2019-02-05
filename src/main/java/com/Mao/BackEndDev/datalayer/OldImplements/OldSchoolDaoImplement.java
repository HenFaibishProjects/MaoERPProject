//package main.java.com.Mao.BackEndDev.datalayer.OldImplements;//package com.Mao.BackEndDev.datalayer.OldImplements;
//
//import java.io.File;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Random;
//
//import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MATypesEnum;
//import com.Mao.BackEndDev.datalayer.DaoInterfaces.SchoolDao;
//
//class SchoolDaoImplement  extends PersonAddressDaoImplement implements SchoolDao{
//
//	
//	public void add(String address1, String address2, String city, int zipCode, String region, String country,
//			String name, String managerName, int numberOfChapters, String email, String wbesite, MATypesEnum mainMAtype,
//			File logo) throws ClassNotFoundException, SQLException {
//  	
//		float personID = zipCode +RandID();
//		setAddress(personID, address1, address2, city, zipCode, region, country);
//		setSchool(personID, name,  managerName,  numberOfChapters,  email,  wbesite,  mainMAtype, logo);
//		
//	}
//   private void setSchool(float id ,String name, String managerName, int numberOfChapters, String email, String wbesite, MATypesEnum mainMAtype,File logo) throws SQLException {
//	   
//        String mainMAtypeName = mainMAtype.toString();	
//        String fileName = logo.toString();
//		PreparedStatement insertQuery =   conn.prepareStatement("INSERT INTO school ( id ,name,  managerName,  numberOfChapters,  email,  wbesite,  mainMAtype, logo) values (?,?,?,?,?,?,?,?)");
//		insertQuery.setFloat(1, id);
//		insertQuery.setString(2, name);
//		insertQuery.setString(3, managerName);
//		insertQuery.setInt(4, numberOfChapters);
//		insertQuery.setString(5, email);
//		insertQuery.setString(6, wbesite);
//		insertQuery.setString(7, mainMAtypeName);
//		insertQuery.setString(7, fileName);
//		insertQuery.executeUpdate();
//		
//	}
//
//	public void deleteByid(int schooID) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school  SET active = 0 where schooID = " + schooID);
//		insertQuery.executeUpdate();
//
//	}
//
//   
//   public void ModidyManagerNameSchool(int schooID, String managerName) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET managerName= ? where customerID = ? ");
//		insertQuery.setString(1, managerName);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//	
//   
//	public void ModidyNumberOfChaptersSchool(int schooID, int numberOfChapters) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET numberOfChapters= ? where customerID = ? ");
//		insertQuery.setInt(1, numberOfChapters);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//   
//	public void ModidyEmailSchool(int schooID, String email) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET email= ? where customerID = ? ");
//		insertQuery.setString(1, email);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//   
//	public void ModidyWebsiteSchool(int schooID, String wbesite) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET wbesite= ? where customerID = ? ");
//		insertQuery.setString(1, wbesite);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//   
//	public void ModidyMATypesSchool(int schooID, MATypesEnum mainMAtype) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET mainMAtype= ? where customerID = ? ");
//		String ma = mainMAtype.name();
//		insertQuery.setString(1, ma);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//   
//	public void ModidyLogoSchool(int schooID, File logo) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE school SET name= ? where customerID = ? ");
//		String file = logo.toString();
//		insertQuery.setString(1, file);
//		insertQuery.setInt(2, schooID);
//		insertQuery.executeUpdate();
//
//	}
//		
//   public float RandID(){
//		  float LOWER_RANGE = 1000000001; 
//		  float UPPER_RANGE = 1999999999; 
//		  int intRand1;
//		  int intRand2;
//		  int intRand3;
//		  int intRand4;
//		  Random random = new Random();
//		  intRand1 = random.nextInt();
//		  intRand2 = random.nextInt();
//		  intRand3 = random.nextInt();
//		  intRand4 = random.nextInt();
//		  int FainalRand = ((intRand1 + intRand2)/2)+intRand3-intRand4;
//		  float randomValue = LOWER_RANGE + (float)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));
//		  float finalRandomValue = randomValue - FainalRand; 
//       return finalRandomValue;
//
//}
//}