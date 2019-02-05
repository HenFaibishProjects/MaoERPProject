package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.ArrayList;

public enum DegreeName {


	white("white") , yellow("yellow") , orange("orange") , Merkaz("Merkaz") , green("green") ,
	blue("blue") , purple("purple") , brown("brown") , black("black") , black1("black1") , gray("gray") ,
	black2("black2") , black3("black3") , black4("black4") , black5("black5") , black6("black6") ,
	black7("black7") , black8("black8") , black9("black9") , black10("black10") , red("red") ;
	
	
	
	   private final String name;
	   public static ArrayList<RegionEnum> continent = new ArrayList<RegionEnum>();
	   
	   
	 		
	    private DegreeName(String name) {
	        this.name = name;
	    }

		public static ArrayList<RegionEnum> getContinent() {
			return continent;
		}

		public static void setContinent(ArrayList<RegionEnum> continent) {
			RegionEnum.continent = continent;
		}

		public String getName() {
			return name;
		}



}
