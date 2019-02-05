//package main.java.com.Mao.BackEndDev.datalayer.OldImplements;//package com.Mao.BackEndDev.datalayer.OldImplements;
//
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.Mao.BackEndDev.datalayer.DbConnections.JdbcDbData;
//
//
//public class OldEmployeeDaoImpl extends JdbcDbData  {
//
//	static int timesEmployeeDetailsHasChanged = 0;
//	static int timesEmployeeAddressHasChanged = 0;
//	static int timesEmployeeSalaryHasChanged = 0;
//
//
//	
//	public void add(String address1, String address2, String city, int zipCode, String region, String country,
//			Date Sdate , Date Edate , String name, float employeeID, String phone, String email,int salaryrate,int  degree, int Dimploma , String notes)
//					throws ClassNotFoundException, SQLException {
//
////		setAddress(employeeID,address1,address2,city,zipCode,region,country);
//		setEmpoyee( employeeID ,  Sdate, null,  1 ,   name,  phone,  email, salaryrate, degree, Dimploma,  notes , 1);
//
//	}
//
//	public void showEmpoyees() throws SQLException{
//		Statement simpleSelect = conn.createStatement();
//		simpleSelect.executeQuery("select * from employees");
//		
//	}
//	
//	
//	private void setEmpoyee(float employeeID , Date Sdate,Date Edate, int active ,  String name, String phone, String email,int salaryrate,int degree,int Dimploma, String notes , int schoolID) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("INSERT INTO employees (employeeID , StartWorkDay , EndWorkDay , Active , name , phone, email, salaryrate , matype , degree , Dimploma , notes , schoolID) values (?,?,?,?,?,?,?,?,?,?,?,?)");
//		insertQuery.setFloat(1, employeeID);
//		insertQuery.setDate(2, Sdate);
//		insertQuery.setDate(3, Edate);
//		insertQuery.setInt(4, active);
//		insertQuery.setString(5, name);
//		insertQuery.setString(6, phone);
//		insertQuery.setString(7, email);
//		insertQuery.setInt(8, salaryrate);
//		insertQuery.setInt(9, degree);
//		insertQuery.setInt(10, Dimploma);
//		insertQuery.setString(11, notes);
//		insertQuery.setInt(12, schoolID);
//		insertQuery.executeUpdate();
//	}
//
//
//	
//	public void deleteByid(int employeeID) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery = conn.prepareStatement ("UPDATE employees  SET active=0 where employeeID = " + employeeID);
//		insertQuery.executeUpdate();
//	}
//
//	
//	public void ModidyNameEmployee(int employeeID, String name) throws ClassNotFoundException, SQLException {	
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET name= ? where employeeID = ? ");
//		insertQuery.setString(1, name);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModidyPhoneEmployee(int employeeID, String phone) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET phone= ? where employeeID = ? ");
//		insertQuery.setString(1, phone);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModifyEndWorkingDateEmployee(int employeeID, Date date) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET endWorkDay = ? where employeeID = ? ");
//		insertQuery.setDate(1, date);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModidyEmailEmployee(int employeeID, String email) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET email= ? where id = ? ");
//		insertQuery.setString(1, email);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModidyEmailEmployee(int employeeID, int salaryRate) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET salaryRate = ? where id = ? ");
//		insertQuery.setInt(1, salaryRate);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//
//	
//	public void ModidyMAtypeEmployee(int employeeID, int MAtype) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET MAtype = ? where id = ? ");
//		insertQuery.setInt(1, MAtype);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//
//	
//	public void ModidyDegreeEmployee(int employeeID, int degree) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET degree = ? where id = ? ");
//		insertQuery.setInt(1, degree);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModidyDimplomaEmployee(int employeeID, int dimploma) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET dimploma = ? where id = ? ");
//		insertQuery.setInt(1, dimploma);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//	
//	public void ModidyNotesEmployee(int employeeID, String notes) throws ClassNotFoundException, SQLException {
//		PreparedStatement insertQuery =   conn.prepareStatement ("UPDATE employees SET notes = ? where id = ? ");
//		insertQuery.setString(1, notes);
//		insertQuery.setInt(2, employeeID);
//		insertQuery.executeUpdate();
//
//	}
//
//}
