package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Items;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.PurchaseItems;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Stock;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class PurchaseImplement extends HibernateStructInfo {

	static final Logger LOG = LoggerFactory.getLogger(PurchaseImplement.class);
	PurchaseItems purchaseItems;
	Stock stock;


	public PurchaseItems getUniqueObjectResultByPurchaseItemId(int purchaseId){  
		beginTranscation();
		Criteria criteria = session.createCriteria(PurchaseItems.class);
		criteria.add(Restrictions.eq("purchaseId", purchaseId));
		return (PurchaseItems) criteria.uniqueResult();

	}

	public Items getUniqueObjectResultByBarCode(String barCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Items.class);
		criteria.add(Restrictions.eq("barCode", barCode));
		return (Items) criteria.uniqueResult();

	}

	public Stock getUniqueObjectStockResultByItemId(String barCode){  
		beginTranscation();
		Criteria criteriaItems = session.createCriteria(Items.class);
		Criteria criteriaStock = session.createCriteria(Stock.class);
		criteriaItems.add(Restrictions.eq("barCode", barCode));
		Items tmp = (Items) criteriaItems.uniqueResult();
		int tmpAddIdInt = tmp.getItemnumber();
		criteriaStock.add(Restrictions.eq("stockId", tmpAddIdInt));
		return (Stock) criteriaStock.uniqueResult();
	}

	public void addPurchases(Date purchaseDate, int quantityPurchase, String barCode,float pricePurchaseItems){
		Items item = getUniqueObjectResultByBarCode(barCode);
		purchaseItems = new PurchaseItems(purchaseDate, quantityPurchase, item, pricePurchaseItems);
		stock = getUniqueObjectStockResultByItemId(barCode);
		if (stock == null)
		{
			Stock stocknewCreation = new Stock(getUniqueObjectResultByBarCode(barCode), quantityPurchase, pricePurchaseItems);
			super.saveObject(purchaseItems);
			super.saveObject(stocknewCreation);
		}
		else {
		stock.setItems(item);
		stock.setCurrentMarketPrice(pricePurchaseItems);
		stock.setQuantity(stock.getQuantity()+quantityPurchase);
		super.saveObject(purchaseItems);
		super.saveOrUpdate(stock);
		}
		

	}

	public void updatePurchaseDate(int purchaseId,Date purchaseDate){
		purchaseItems = getUniqueObjectResultByPurchaseItemId(purchaseId);
		purchaseItems.setPurchaseDate(purchaseDate);
		super.saveObject(purchaseItems);

	}

	public void updatePurchasequantityPurchase(int purchaseId,int quantityPurchase){
		purchaseItems = getUniqueObjectResultByPurchaseItemId(purchaseId);
		purchaseItems.setQuantityPurchase(quantityPurchase);
		super.saveObject(purchaseItems);

	}

	public void updatepricePurchaseItems(int purchaseId,float pricePurchaseItems){
		purchaseItems = getUniqueObjectResultByPurchaseItemId(purchaseId);
		purchaseItems.setPricePurchaseItems(pricePurchaseItems);
		super.saveObject(purchaseItems);
	}

	public void removePurchase(int purchaseId){
		purchaseItems = getUniqueObjectResultByPurchaseItemId(purchaseId);
		stock = getUniqueObjectStockResultByItemId(purchaseItems.getItems().getBarode());
		stock.setQuantity(stock.getQuantity()-purchaseItems.getQuantityPurchase());
		session.delete(purchaseItems);
		super.saveObject(stock);


	}
}
