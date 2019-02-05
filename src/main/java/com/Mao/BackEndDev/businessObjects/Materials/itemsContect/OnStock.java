package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import java.util.ArrayList;

public interface OnStock {
	
	public Void onStockOnAnyOfTheSupplier(String barode);
	public  ArrayList<Integer> sentMeTheSuppliierListWhereOnStock(String barode);

}
