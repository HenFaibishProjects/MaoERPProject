package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Items;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.SaleItems;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Stock;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class SellingImplement extends HibernateStructInfo {

	static final Logger LOG = LoggerFactory.getLogger(PurchaseImplement.class);
	SaleItems saleItems;
	Stock stock;


	public SaleItems getUniqueObjectResultByPurchaseItemId(int purchaseId){  
		beginTranscation();
		Criteria criteria = session.createCriteria(SaleItems.class);
		criteria.add(Restrictions.eq("purchaseId", purchaseId));
		return (SaleItems) criteria.uniqueResult();

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
	
	public void addSale(Date sellDate, int quantityPurchase, String barCode,float pricePurchaseItems,int customerID){
		Items item = getUniqueObjectResultByBarCode(barCode);
		saleItems = new SaleItems(sellDate, quantityPurchase, item, pricePurchaseItems,customerID);
		stock = getUniqueObjectStockResultByItemId(barCode);
		if (stock == null)
			LOG.error("No Such Product On Stock , Try another Barcode");
		else if(stock.getQuantity()==0)
			LOG.error("Quantity of this product is 0 , Cannot sale to the customer");
		else {
		stock.setItems(item);
		stock.setCurrentMarketPrice(pricePurchaseItems);
		stock.setQuantity(stock.getQuantity()-quantityPurchase);
		super.saveObject(saleItems);
		super.saveOrUpdate(stock); 
		LOG.info("Product with barcode " + barCode + " sold in the quantity " + quantityPurchase + " to customerID " + customerID);}

	}
	
	public void addSalePublicCustomer(Date sellDate, int quantityPurchase, String barCode,float pricePurchaseItems){
		Items item = getUniqueObjectResultByBarCode(barCode);
		saleItems = new SaleItems(sellDate, quantityPurchase, item, pricePurchaseItems);
		stock = getUniqueObjectStockResultByItemId(barCode);
		if (stock == null)
			LOG.error("No Such Product On Stock , Try another Barcode");
		else if(stock.getQuantity()==0)
			LOG.error("Quantity of this product is 0 , Cannot sale to the customer");
		else {
		stock.setItems(item);
		stock.setCurrentMarketPrice(pricePurchaseItems);
		stock.setQuantity(stock.getQuantity()-quantityPurchase);
		super.saveObject(saleItems);
		super.saveOrUpdate(stock); 
		LOG.info("Product with barcode " + barCode + " sold in the quantity " + quantityPurchase + " to Public Customer");
		}
	}

	public void updateSaleDate(int saleId,Date saleDate){
		saleItems = getUniqueObjectResultByPurchaseItemId(saleId);
		saleItems.setSaleDate(saleDate);
		super.saveObject(saleItems);

	}

	public void updateSaleQuantity(int saleId,int quantitySale){
		saleItems = getUniqueObjectResultByPurchaseItemId(saleId);
		saleItems.setQuantitySale(quantitySale);
		super.saveObject(saleItems);

	}

	public void updatepricePurchaseItems(int saleId,float priceSaleItems){
		saleItems = getUniqueObjectResultByPurchaseItemId(saleId);
		saleItems.setPriceSaleItem(priceSaleItems);
		super.saveObject(saleItems);
	}

	public void removePurchase(int purchaseId){
		 
		super.saveObject(stock);


	}
}
