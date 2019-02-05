package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

public enum Durationmembership {


	OneTime("OneTime"),
	FullDay("FullDay"),
	Week("Week"),
	Month("Month"),
	Semester("Semester"),
	SixMonths("SixMonths"),
	Year("Year");

	private String name;



	private Durationmembership(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}




}
