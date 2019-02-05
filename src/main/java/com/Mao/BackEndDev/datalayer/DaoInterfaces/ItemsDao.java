package com.Mao.BackEndDev.datalayer.DaoInterfaces;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.LenthSize;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumsizesItems;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;

public interface ItemsDao {
	
	void addItem();
	
	void ModidySubEnumItemListItem(int id, EnumItemList subEnumItemList) throws ClassNotFoundException, SQLException ;
	
	void ModidyietmListItem(int id, EnumItemList ietmlist) throws ClassNotFoundException, SQLException ;
	
	void ModidyModelItem(int id, String model) throws ClassNotFoundException, SQLException ;
	
	void ModidyManufacturerItem(int id, String manufacturer) throws ClassNotFoundException, SQLException ;
	
	void ModidyFirstArrivedItem(int id, Date firstArrived) throws ClassNotFoundException, SQLException ;
	
	void ModidyPurchesPriceItem(int id, float purchesPrice) throws ClassNotFoundException, SQLException ;
	
	void ModidyMarketPriceItem(int id, float marketPrice) throws ClassNotFoundException, SQLException ;
	
	void ModidySupliyerShopsItem(int id, List<Integer> supliyerShops) throws ClassNotFoundException, SQLException ;
	
	void ModidyColorsItem(int id, List<EnumColor> colors) throws ClassNotFoundException, SQLException ;
	
	void ModidySizeItem(int id, List<EnumsizesItems> size) throws ClassNotFoundException, SQLException ;
	
	void ModidyWeightItem(int id, float weight) throws ClassNotFoundException, SQLException ;
	
	void ModidyCategoryItem(int id, EnumCatergoty category) throws ClassNotFoundException, SQLException ;
	
	void ModidyCommentsItem(int id, String comments) throws ClassNotFoundException, SQLException ;
	
	void ModidyMounthsWarrentyItem(int id, int mounthsWarrenty) throws ClassNotFoundException, SQLException ;
	
	void ModidyAcceptetlenthSizeItem(int id, int acceptetPayments) throws ClassNotFoundException, SQLException ;
	
	void ModidyAcceptetMadeInItem(int id, LenthSize lenthSize) throws ClassNotFoundException, SQLException ;
	
	void ModidyAcceptetonStockItem(int id, String madeIn) throws ClassNotFoundException, SQLException ;
	
	void ModidyAcceptetPaymentsItem(int id, boolean onStock) throws ClassNotFoundException, SQLException ;
	
	
	
	
	
	
	
	
	
	
	

	

}


