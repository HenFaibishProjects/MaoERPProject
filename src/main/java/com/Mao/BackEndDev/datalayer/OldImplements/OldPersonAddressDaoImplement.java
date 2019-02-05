//package main.java.com.Mao.BackEndDev.datalayer.OldImplements;//package com.Mao.BackEndDev.datalayer.OldImplements;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import com.Mao.BackEndDev.datalayer.DaoInterfaces.PersonAddressDao;
//import com.Mao.BackEndDev.datalayer.DbConnections.JdbcDbData;
//
//class PersonAddressDaoImplement extends JdbcDbData implements PersonAddressDao {
//
//	
//	public void setAddress(float personID,String address1,String address2,String city,int zipCode,String region,String country) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("INSERT INTO defaultaddress (personID,address1,address2,city,zipCode,region,country) values (?,?,?,?,?,?,?)");
//		insertQuery.setFloat(1, personID);
//		insertQuery.setString(2, address1);
//		insertQuery.setString(3, address2);
//		insertQuery.setString(4, city);
//		insertQuery.setInt(5, zipCode);
//		insertQuery.setString(6, region);
//		insertQuery.setString(7, country);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public  void ModidyAddressOnePerson(int id ,String addressOne) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET address1= ? where personID = ? )");
//		insertQuery.setString(1, addressOne);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//	}
//	
//	
//	public  void ModidyAddressTwoPerson(int id ,String addressTwo) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET address2= ? where personID = ? )");
//		insertQuery.setString(1, addressTwo);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//	}
//	
//	
//	public  void ModidyZipCodePerson(int id ,int zip) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET zipcode = ? where personID = ? )");
//		insertQuery.setInt(1, zip);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//	}
//	
//	
//	public  void ModidyRegionPerson(int id ,String region) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET region = ? where personID = ? )");
//		insertQuery.setString(1, region);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//	}
//	
//	
//	public  void ModidyCityPerson(int id ,String city) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET city= ? where personID = ? )");
//		insertQuery.setString(1, city);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//	}
//	
//	
//	public  void ModidyConutryPerson(int id ,String country) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement("UPDATE defaultaddress SET country= ? where personID = ? )");
//		insertQuery.setString(1, country);
//		insertQuery.setInt(2, id);
//		insertQuery.executeUpdate();
//
//}
//	
//}
