package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum EnumsizesItems {
	
    XS("Exstra Small"),
    S("Small"),
    M("Medium"),
    L("Large"),
    XL ("Extra Large"),  
	XXL ("Double Extra Large"), 
	A1 ("A1"),
	A2 ("A2"),
	A3 ("A3"),
	A4 ("A4"),
	A5 ("A5"),
	A6 ("A6"),
	A7 ("A7"),
	A8 ("A8"),
	one  ("1"),
	two  ("2"),
	three("3"),
	four ("4"),
	five ("5"),
	six  ("6"),
	seven("7"),
	eight("8");

    private EnumsizesItems(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}

