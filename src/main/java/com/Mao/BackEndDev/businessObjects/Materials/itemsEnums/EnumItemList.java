package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum EnumItemList {
	
    Pants("Pants"),
    Shirts("Shirts"),
    Shoes("Shoes"),
	HeadProtectors("Head-Protectors"),
	TeethProtectors("TeethProtectors"),
	ChestProtectors("ChestProtectors"),
	GroinProtectors("GroinProtectors"),
	LegsProtectors("LegsProtectors"),
	Vitamins("Vitamins"),
	PainKillers("PainKillers"),
	Suites("Suites"),
	Belts("Belts"),
    BoxingGloves("BoxingGloves"),
    BagsGloves("BagsGloves"),
    warpsGloves("warpsGloves"),
    MMAGloves("MMAGloves"),
	MMaTrainingGloves("MMaTrainingGloves");
	
 

    private EnumItemList(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}


