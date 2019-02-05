package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

public enum ParticipateClasses {
	


			OneTimePerWeek("OneTimePerWeek") ,TwoTimesPerWeek("TwoTimesPerWeek") , ThreeTimesPerWeek("ThreeTimesPerWeek") , FourTimesPerWeek("FourTimesPerWeek") , FullWeek("FullWeek");
			

			    		
			    private String name;



				private ParticipateClasses(String name) {
			        this.name = name;
			    }



				public String getName() {
					return name;
				}






}
