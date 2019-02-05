package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.datalayer.DaoInterfaces.MaTypeDao;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class MaTypeImplement  extends HibernateStructInfo  implements MaTypeDao{
	
	static final Logger LOG = LoggerFactory.getLogger(MaTypeImplement.class);
	MaTypenew maTypenew;
	
	
	public MaTypenew getUniqueObjectResultById(int id){  
		beginTranscation();
		Criteria criteria = session.createCriteria(MaTypenew.class);
		criteria.add(Restrictions.eq("id", id));
		return (MaTypenew) criteria.uniqueResult();

	}
	
	@Override
	public void addMaTypenew(int val , String valstring , Date date , String description)
	{
		MaTypenew matype = new MaTypenew (valstring,description);
        super.saveObject(matype); 
	}

	
	@Override
	public void changeTypeById(int id, String type) {
		maTypenew = getUniqueObjectResultById(id);
		maTypenew.setType(type);
		saveObject(maTypenew);
		
	}

	@Override
	public void changeMaDescriptionbyId(int id, String description) {
		maTypenew = getUniqueObjectResultById(id);
		maTypenew.setType(description);
		saveObject(maTypenew);
		
	}

	



}
