package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

public enum PaymentConception {
	

		 Memebership ("Memebership")
		,Insurance ("Insurance")
		,Items ("Items")
		,Other ("Other");

		   private String name;       

		    private PaymentConception(String s) {
		        name = s;
		    }

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		

}
