package com.Mao.BackEndDev.testsPurposes.addingDataToHRContent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.joda.time.DateTime;
import org.springframework.beans.NotWritablePropertyException;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.datalayer.DaoImplements.EmployeeDaoImpl;
import com.Mao.BackEndDev.datalayer.DaoImplements.MaTypeImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.SuplierDaoImplement;



 public class addData {


	public static void addMAtype() {
		MaTypeImplement maTypeImplement = new MaTypeImplement(); 
		maTypeImplement.addMaTypenew(randNumber(),"faaassf",new Date(),"description");
	}





	public static void modifySuppliyer() throws ClassNotFoundException, SQLException {
		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
		suplierDaoImplement.ModidyAdressSuppliyer(1, "address1", "newaddressContent");
	}

	

	public static void modifyAddress() throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		//employeeDaoImpl.ModidyAdressEmployee("36316123", "city", "TiretKarmel");
	}
	
	
	
	
	
	//		
//	public static void deleteByEmpIdExecute(String OfficialId) throws ClassNotFoundException, SQLException {
//		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
//		employeeDaoImpl.deleteByid(OfficialId);
//	}
	
//	public static void modifySalary() throws ClassNotFoundException, SQLException {
//		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
//		employeeDaoImpl.ModifySalaryEmployee("036625418", SalTypeEnum.ByHouer, 50);
//		
//	}
	
//	public static void setSalType() throws HibernateException, SQLException  {
//	    SalaryTypeImlement salaryTypeImlement = new SalaryTypeImlement();
//	    salaryTypeImlement.addSalTypeName();
//	}
	
public static int  randNumber() {
	
	Random ran = new Random();
	int x = ran.nextInt(100) + 10;
	return x;
}
		
		
	}



