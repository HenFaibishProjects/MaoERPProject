package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.ArrayList;
import java.util.Scanner;

public enum DaysOfTheWeekEnum {


	SUNDAY("sunday") , MONDAY("monday") , TUESDAY("tuesday") ,  WEDNESDAY("wednesday") , THURSDAY("thursday") ,  FRIDAY("friday") , SATURDAY("saterday");

	
	
	   private final String name;
	   public static ArrayList<DaysOfTheWeekEnum> daysOfTheWeek = new ArrayList<DaysOfTheWeekEnum>();
	   
	    private DaysOfTheWeekEnum(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
		static void setByScannerTheWorkingDaysOfTheWeek() {
			
	    	Scanner in = new Scanner(System.in);
	    	for(int i = 0;i < daysOfTheWeek.size(); i++){
	        try {
	            String daysOfTheWeekString = in.next();
	            if( daysOfTheWeekString instanceof String )  
	            	continue;
	            }

	        catch (Exception e) {
	            System.out.println("You must choose a valid working day, Start Over");
	        }
	}}

		public static ArrayList<DaysOfTheWeekEnum> getDaysOfTheWeek() {
			return daysOfTheWeek;
		}

		public static void setDaysOfTheWeek(ArrayList<DaysOfTheWeekEnum> daysOfTheWeek) {
			DaysOfTheWeekEnum.daysOfTheWeek = daysOfTheWeek;
		}

}
	

	

