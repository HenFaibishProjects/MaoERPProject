package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

public enum Stripes {

		None("None") ,One("One") , Two("Two") , Three("Three") , Four("Four");
		

		    		
		    private String name;



			private Stripes(String name) {
		        this.name = name;
		    }



			public String getName() {
				return name;
			}



	

}
