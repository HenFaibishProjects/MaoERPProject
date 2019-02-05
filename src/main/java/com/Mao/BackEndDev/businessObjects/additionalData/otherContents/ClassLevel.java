package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClassLevel")
public class ClassLevel {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ClassLevelID")
	int classLevelID;
	@Column(name="ClassLevelName")
	String ClassLevelName;


	public ClassLevel() {
	}
	
	public ClassLevel(String ClassLevelName) {
		this.ClassLevelName = ClassLevelName;
	}


	public int getclassLevelID() {
		return classLevelID;
	}


	public void setclassLevelID(int classLevelID) {
		this.classLevelID = classLevelID;
	}


	public String getClassLevelName() {
		return ClassLevelName;
	}


	public void setClassLevelName(String classLevelName) {
		ClassLevelName = classLevelName;
	}





}
