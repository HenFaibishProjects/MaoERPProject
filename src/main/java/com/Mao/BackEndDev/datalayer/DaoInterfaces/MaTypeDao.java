package com.Mao.BackEndDev.datalayer.DaoInterfaces;

import java.util.Date;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;

public interface MaTypeDao {
	

	public void addMaTypenew(int val, String valstring, Date date, String description);
	public void changeTypeById(int id, String type);
	public void changeMaDescriptionbyId(int id, String description);
}
