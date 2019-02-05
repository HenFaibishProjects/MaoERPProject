package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;


import java.util.ArrayList;


public enum RegionEnum {


	North("North") , South("South") , Hasharon("Hasharon") , Merkaz("Merkaz") , Shfala("Shfala");
	
	
	   private final String name;
	   public static ArrayList<RegionEnum> continent = new ArrayList<RegionEnum>();
	   
	   
	 		
	    private RegionEnum(String name) {
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
