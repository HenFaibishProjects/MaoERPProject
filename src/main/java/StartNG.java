package main.java;//import org.testng.annotations.Test;
//
//import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DeployTestEnv;
//import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DropTables;
//import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;
//
//
//public class StartNG {
//	
//	public InitialValues initialValues = new InitialValues();
//
//	@Test(groups = { "siteTreesWithStorage" }, enabled = true,dataProviderClass = DataProviderSitesBuilderWithStorage.class, dataProvider = "basic1phInvWithOptimizerSemWithProductionNoStorageData")
//	public  void dropTables() throws Exception {
//		DropTables.doit();
//
//	}
//
//	@Test
//	public  void initialHRValues() throws Exception {
//		InitialValues initialValues = new InitialValues();
//		initialValues.initialHRValuesIntoDB();
//
//	}
//	
//	@Test
//	public  void initialItemsValues() throws Exception {
//	
//
//	}
//}
