
package com.Mao.BackEndDev.datalayer.DaoInterfaces;

import java.io.File;
import java.sql.SQLException;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MATypesEnum;


public interface SchoolDao  {

	 void add(String address1, String address2, String city, int zipCode, String region, String country, String name, String managerName, int numberOfChapters, String email,
              String wbesite, MATypesEnum mainMAtype, File logo)  throws ClassNotFoundException, SQLException ; ;
	 
			 void deleteByid(int id) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyManagerNameSchool(int id, String managerName) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyNumberOfChaptersSchool(int id, int numberOfChapters) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyEmailSchool(int id, String email) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyWebsiteSchool(int id, String wbesite) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyMATypesSchool(int id, MATypesEnum mainMAtype) throws ClassNotFoundException, SQLException ;
			 
			 void ModidyLogoSchool(int id, File logo) throws ClassNotFoundException, SQLException ;
	 
}
				
				
				
				
				
				
				
				
				