package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.ArrayList;
import java.util.Scanner;

public enum CurrencyEnum {


	Dollars("dollars") , Shekel("nis") , Euro("euo") ;
	
	
	   private final String name;
	   public static ArrayList<CurrencyEnum> curency = new ArrayList<CurrencyEnum>();
	   

		static ArrayList<CurrencyEnum> setByScannerCurency() {
			
	    	Scanner in = new Scanner(System.in);
	    	for(int i = 0;i < curency.size(); i++){
	        try {
	            String daysOfTheWeekString = in.next();
	            if( daysOfTheWeekString instanceof String )  
	            	continue;
	            }

	        catch (Exception e) {
	            System.out.println("You must choose a valid working day, Start Over");
	        }
	return curency;
	    	}
			return curency;}
		
		
		
	   
	    private CurrencyEnum(String name) {
	        this.name = name;
	        
	    }

		public static ArrayList<CurrencyEnum> getCurency() {
			return curency;
		}

		public static void setCurency(ArrayList<CurrencyEnum> curency) {
			CurrencyEnum.curency = curency;
		}

		public String getName() {
			return name;
		}
}
