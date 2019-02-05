package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum AdditionalToItemColor {

	
	    stripes("stripes"),
	    logo("log"),
	    mixedColors("mixedColors");
	        

	    private AdditionalToItemColor(final String string) {
	        this.string = string;
	    }

	    private final String string;

	    public String getColor() {
	        return string;
	    }
	    
	    
}
