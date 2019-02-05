package com.Mao.BackEndDev.datalayer.DaoInterfaces;

import java.sql.SQLException;


public interface SuplierDao {
  
	 
	public void addSuppliyerWithHibernate(short usDollars, short nis, short euro, short auDollars, short sunday, short monday, short tuesday, short wednesday, short thursday, short friday, short saturday,
                                          int suplyCode, String name, String id, String phone, String website, String email,
                                          String address1, String address2, String city, String country, String region, int zipCode);
	
	public void deleteByid(int supplierID) throws ClassNotFoundException, SQLException; 
	
	public void ModidyNameSuppliyer(int supplierID, String name) throws ClassNotFoundException, SQLException;
	
	public void ModidyPhoneSuppliyer(int supplierID, String phone) throws ClassNotFoundException, SQLException;

	public void ModidyWebsiteSuppliyer(int supplierID, String website) throws ClassNotFoundException, SQLException; 

	public void ModidyEmailSuppliyer(int supplierID, String email) throws ClassNotFoundException, SQLException; 
	
	public void ModidyWorkingDaySuppliyer(int supplierID, String day, short workingOrNot) throws ClassNotFoundException, SQLException;
 
	public void ModidyCurrencySuppliyer(int supplierID, String currencyName, short exists) throws ClassNotFoundException, SQLException;
	
    public void ModidyAdressSuppliyer(int supplierID, String addressContent, String newaddressContent) throws ClassNotFoundException, SQLException;

    public void ModidyTaxScanSuppliyer(int supplierID, int tax) throws ClassNotFoundException, SQLException;
        
         


}
