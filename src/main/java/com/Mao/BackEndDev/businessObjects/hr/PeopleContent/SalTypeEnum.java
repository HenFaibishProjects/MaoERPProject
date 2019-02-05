package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

public enum SalTypeEnum {

	ByHouer("ByHouer") , ByClass("ByClass") , ByWeek("ByWeek")  , ByMounth ("ByMounth") , ByYear("ByYear");


    private SalTypeEnum(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }


		
	
}
