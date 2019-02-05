package com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Mao.BackEndDev.API.publicAPI.rest.AbstractController;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.ArivedFrom;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.ClassLevel;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Currency;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.hr.Schools.Role;
import com.Mao.BackEndDev.datalayer.DaoImplements.CustomersDaoImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.EmployeeDaoImpl;
import com.Mao.BackEndDev.datalayer.DaoImplements.SuplierDaoImplement;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class InitialValues extends HibernateStructInfo{

	static final Logger LOG = LoggerFactory.getLogger(InitialValues.class);

	public void initialHRValuesIntoDB(){

		try {
			addRoles();
		} catch (Exception e) {
			LOG.error("Can not populate table Role");
			e.printStackTrace();
		}
		
		try {
			addArivedFrom();
		} catch (Exception e) {
			LOG.error("Can not populate table ArivedFrom");
			e.printStackTrace();
		}
		try {
			Currency currency = new Currency();
			super.saveObject(currency);
		} catch (Exception e) {
			LOG.error("Can not populate table Currency");
			e.printStackTrace();
		}
		try {
			addClassLevel();
		} catch (Exception e) {
			LOG.error("Can not populate table ClassLevel");
			e.printStackTrace();
		}
		try {
			addDegrees();
		} catch (Exception e) {
			LOG.error("Can not populate table Degrees");
			e.printStackTrace();
		}

		try {
			addmatype();
		} catch (Exception e) {
			LOG.error("Can not populate table atype");
			e.printStackTrace();
		}

	}


	private void addRoles() {
		
		Role role = new Role("MAOAdmin");
		super.saveObject(role);
		Role role1 = new Role("SchoolAdmin");
		super.saveObject(role1);
		Role role2 = new Role("OutPostAdmin");
		super.saveObject(role2);
		Role role3 = new Role("SchoolOperator");
		super.saveObject(role3);
		Role role4 = new Role("OutpostOperator");
		super.saveObject(role4);
		Role role5 = new Role("SchoolViewer");
		super.saveObject(role5);
		Role role6 = new Role("OutpostViewer");
		super.saveObject(role6);
		
	}


	public void addArivedFrom(){
		ArivedFrom arrivefrom1 = new ArivedFrom("Flyer");
		super.saveObject(arrivefrom1);
		ArivedFrom arrivefrom2 = new ArivedFrom("InternetGoogle");
		super.saveObject(arrivefrom2);
		ArivedFrom arrivefrom3 = new ArivedFrom("InternetWebSite");
		super.saveObject(arrivefrom3);
		ArivedFrom arrivefrom4 = new ArivedFrom("Friend");
		super.saveObject(arrivefrom4);
		ArivedFrom arrivefrom5 = new ArivedFrom("Show");
		super.saveObject(arrivefrom5);
		ArivedFrom arrivefrom6 = new ArivedFrom("Other");
		super.saveObject(arrivefrom6);
	}

	public void addClassLevel(){
		ClassLevel classLevel1 = new ClassLevel("Beginners");
		super.saveObject(classLevel1);
		ClassLevel classLevel2 = new ClassLevel("Pro");
		super.saveObject(classLevel2);
		ClassLevel classLevel3 = new ClassLevel("Experct");
		super.saveObject(classLevel3);
		ClassLevel classLevel4 = new ClassLevel("Generic");
		super.saveObject(classLevel4);


	}




	public void addDegrees(){
		Degree degree001 = new Degree(DegreeName.white.toString(), Stripes.Three.toString());
		super.saveObject(degree001);
		Degree degree002 = new Degree(DegreeName.white.toString(), Stripes.Four.toString());
		super.saveObject(degree002);
		Degree degree003 = new Degree(DegreeName.white.toString(), Stripes.Three.toString());
		super.saveObject(degree003);
		Degree degree004 = new Degree(DegreeName.white.toString(), Stripes.Three.toString());
		super.saveObject(degree004);
		Degree degree005 = new Degree(DegreeName.white.toString(), Stripes.Four.toString());
		super.saveObject(degree005);

		Degree degree006 = new Degree(DegreeName.gray.toString(), Stripes.Three.toString());
		super.saveObject(degree006);
		Degree degree007 = new Degree(DegreeName.gray.toString(), Stripes.Four.toString());
		super.saveObject(degree007);
		Degree degree008 = new Degree(DegreeName.gray.toString(), Stripes.Three.toString());
		super.saveObject(degree008);
		Degree degree009 = new Degree(DegreeName.gray.toString(), Stripes.Three.toString());
		super.saveObject(degree009);
		Degree degree010 = new Degree(DegreeName.gray.toString(), Stripes.Four.toString());
		super.saveObject(degree010);

		Degree degree011 = new Degree(DegreeName.yellow.toString(), Stripes.Three.toString());
		super.saveObject(degree011);
		Degree degree012 = new Degree(DegreeName.yellow.toString(), Stripes.Four.toString());
		super.saveObject(degree012);
		Degree degree013 = new Degree(DegreeName.yellow.toString(), Stripes.Three.toString());
		super.saveObject(degree013);
		Degree degree014 = new Degree(DegreeName.yellow.toString(), Stripes.Three.toString());
		super.saveObject(degree014);
		Degree degree015 = new Degree(DegreeName.yellow.toString(), Stripes.Four.toString());
		super.saveObject(degree015);

		Degree degree016 = new Degree(DegreeName.orange.toString(), Stripes.Three.toString());
		super.saveObject(degree016);
		Degree degree017 = new Degree(DegreeName.orange.toString(), Stripes.Four.toString());
		super.saveObject(degree017);
		Degree degree018 = new Degree(DegreeName.orange.toString(), Stripes.Three.toString());
		super.saveObject(degree018);
		Degree degree019 = new Degree(DegreeName.orange.toString(), Stripes.Three.toString());
		super.saveObject(degree019);
		Degree degree020 = new Degree(DegreeName.orange.toString(), Stripes.Four.toString());
		super.saveObject(degree020);

		Degree degree021 = new Degree(DegreeName.green.toString(), Stripes.Three.toString());
		super.saveObject(degree021);
		Degree degree022 = new Degree(DegreeName.green.toString(), Stripes.Four.toString());
		super.saveObject(degree022);
		Degree degree023 = new Degree(DegreeName.green.toString(), Stripes.Three.toString());
		super.saveObject(degree023);
		Degree degree024 = new Degree(DegreeName.green.toString(), Stripes.Three.toString());
		super.saveObject(degree024);
		Degree degree025 = new Degree(DegreeName.green.toString(), Stripes.Four.toString());
		super.saveObject(degree025);

		Degree degree026 = new Degree(DegreeName.blue.toString(), Stripes.Three.toString());
		super.saveObject(degree026);
		Degree degree1 = new Degree(DegreeName.blue.toString(), Stripes.Four.toString());
		super.saveObject(degree1);
		Degree degree027 = new Degree(DegreeName.blue.toString(), Stripes.Three.toString());
		super.saveObject(degree027);
		Degree degree028 = new Degree(DegreeName.blue.toString(), Stripes.Three.toString());
		super.saveObject(degree028);
		Degree degree029 = new Degree(DegreeName.blue.toString(), Stripes.Four.toString());
		super.saveObject(degree029);

		Degree degree030 = new Degree(DegreeName.purple.toString(), Stripes.Three.toString());
		super.saveObject(degree030);
		Degree degree031 = new Degree(DegreeName.purple.toString(), Stripes.Four.toString());
		super.saveObject(degree031);
		Degree degree032 = new Degree(DegreeName.purple.toString(), Stripes.Three.toString());
		super.saveObject(degree032);
		Degree degree033 = new Degree(DegreeName.purple.toString(), Stripes.Three.toString());
		super.saveObject(degree033);
		Degree degree034 = new Degree(DegreeName.purple.toString(), Stripes.Four.toString());
		super.saveObject(degree034);

		Degree degree035 = new Degree(DegreeName.brown.toString(), Stripes.Three.toString());
		super.saveObject(degree035);
		Degree degree036 = new Degree(DegreeName.brown.toString(), Stripes.Four.toString());
		super.saveObject(degree036);
		Degree degree037 = new Degree(DegreeName.brown.toString(), Stripes.Three.toString());
		super.saveObject(degree037);
		Degree degree038 = new Degree(DegreeName.brown.toString(), Stripes.Three.toString());
		super.saveObject(degree038);
		Degree degree039 = new Degree(DegreeName.brown.toString(), Stripes.Four.toString());
		super.saveObject(degree039);

		Degree degreeb1 = new Degree(DegreeName.black.toString(), Stripes.Three.toString());
		super.saveObject(degreeb1);
		Degree degreeb2 = new Degree(DegreeName.black1.toString(), Stripes.Three.toString());
		super.saveObject(degreeb2);
		Degree degreeb3 = new Degree(DegreeName.black2.toString(), Stripes.Three.toString());
		super.saveObject(degreeb3);
		Degree degreeb4 = new Degree(DegreeName.black3.toString(), Stripes.Three.toString());
		super.saveObject(degreeb4);
		Degree degreeb5 = new Degree(DegreeName.black4.toString(), Stripes.Three.toString());
		super.saveObject(degreeb5);
		Degree degreeb6 = new Degree(DegreeName.black5.toString(), Stripes.Three.toString());
		super.saveObject(degreeb6);
		Degree degreeb7 = new Degree(DegreeName.black6.toString(), Stripes.Three.toString());
		super.saveObject(degreeb7);
		Degree degreeb8 = new Degree(DegreeName.black7.toString(), Stripes.Three.toString().toString());
		super.saveObject(degreeb8);
		Degree degreeb9 = new Degree(DegreeName.black8.toString(), Stripes.Three.toString());
		super.saveObject(degreeb9);
		Degree degreeb10 = new Degree(DegreeName.black9.toString(), Stripes.Three.toString());
		super.saveObject(degreeb10);


	}


	public void addmatype(){
		MaTypenew maTypenew1 = new MaTypenew("Karate", null);
		super.saveObject(maTypenew1);

		MaTypenew maTypenew2 = new MaTypenew("Arnis", null);
		super.saveObject(maTypenew2);

		MaTypenew maTypenew3 = new MaTypenew("KravMaga", null);
		super.saveObject(maTypenew3);

		MaTypenew maTypenew4 = new MaTypenew("Boxing", null);
		super.saveObject(maTypenew4);

		MaTypenew maTypenew5 = new MaTypenew("MMA", null);
		super.saveObject(maTypenew5);

		MaTypenew maTypenew6 = new MaTypenew("Bjj", null);
		super.saveObject(maTypenew6);

		MaTypenew maTypenew7 = new MaTypenew("Wresling", null);
		super.saveObject(maTypenew7);

		MaTypenew maTypenew8 = new MaTypenew("Sambo", null);
		super.saveObject(maTypenew8);
		
		MaTypenew maTypenew9 = new MaTypenew("ThaiBoxing", null);
		super.saveObject(maTypenew9);

		MaTypenew maTypenew10 = new MaTypenew("Aikido", null);
		super.saveObject(maTypenew10);

		MaTypenew maTypenew11 = new MaTypenew("Judo", null);
		super.saveObject(maTypenew11);

		MaTypenew maTypenew12 = new MaTypenew("Ninjitsu", null);
		super.saveObject(maTypenew12);

		MaTypenew maTypenew13 = new MaTypenew("CMA", null);
		super.saveObject(maTypenew13);

		MaTypenew maTypenew14 = new MaTypenew("KongFu", null);
		super.saveObject(maTypenew14);


	}

}


