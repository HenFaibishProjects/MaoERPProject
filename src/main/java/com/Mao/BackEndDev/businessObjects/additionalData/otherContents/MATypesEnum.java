package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

public enum MATypesEnum {

	 Bjj ("Bjj")
	,ThaiBoxing ("ThaiBoxing")
	,Judo ("Judo")
	,Ningitsu ("Ningitsu")
	,Arnis ("Arnis")
	,MMA ("MMA")
	,OpenMath ("OpenMath");

	   private String name;       

	    private MATypesEnum(String s) {
	        name = s;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
	
	
}
