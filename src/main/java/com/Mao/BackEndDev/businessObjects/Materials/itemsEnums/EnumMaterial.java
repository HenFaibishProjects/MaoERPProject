package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum EnumMaterial {
	    ArtificialLeather("Artificial leather"),
	    RealLeather("RealLeather"),
	    PVC("PVC"),
	    Cotton("Cotton"),
	    Satin ("Satin");    

	    private EnumMaterial(final String string) {
	        this.string = string;
	    }

	    private final String string;

	    public String getColor() {
	        return string;
	    }
	}
