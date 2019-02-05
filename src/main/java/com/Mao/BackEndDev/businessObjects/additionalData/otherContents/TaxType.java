package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.ArrayList;
import java.util.Scanner;


public enum TaxType {


	MAS("sunday") , TY("monday") , RS("tuesday") ;
	
	
	   private final String name;
	   public static ArrayList<TaxType> taxType = new ArrayList<TaxType>();
	   
	   
		static String setByScannerTaxType() {
			
	    	Scanner in = new Scanner(System.in);
	    	String taxTypeString;
	    	taxTypeString = in.next();  
	        return taxTypeString;
	}
		
	   
	    private TaxType(String name) {
	        this.name = name;
	    }

		public static ArrayList<TaxType> getDaysOfTheWeek() {
			return taxType;
		}

		public static void setDaysOfTheWeek(ArrayList<TaxType> daysOfTheWeek) {
			TaxType.taxType = daysOfTheWeek;
		}

		public String getName() {
			return name;
		}

}