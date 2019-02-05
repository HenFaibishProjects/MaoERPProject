package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum EnumCatergoty {
	
    Amature("Amature"),
    Standart("Standart"),
    Pro("professional");
 

    private EnumCatergoty(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}
