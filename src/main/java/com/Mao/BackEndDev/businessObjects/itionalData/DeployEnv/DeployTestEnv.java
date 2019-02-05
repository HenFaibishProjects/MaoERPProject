package com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv;

public class DeployTestEnv {
	public InitialValues initialValues = new InitialValues();
	
	
	public void deployEnv() throws Exception{
		DropTables.doit();
		//initialValues.initialValuesIntoDB();
	}

}
