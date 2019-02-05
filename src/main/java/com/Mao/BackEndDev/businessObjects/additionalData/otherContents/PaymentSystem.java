package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

public enum PaymentSystem {
	
	 CreditCard ("CreditCard")
	,Cach ("Cach")
	,Check ("Check");

	   private String name;       

	    private PaymentSystem(String s) {
	        name = s;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
	

}
