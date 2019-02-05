package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity (name = "MaTypeEntity") // the name of the Entity
@Table  (name = "MaTypeTable") // the name of the table from the DB
public class MaTypenew {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column (name="id_MA_type")
	private int id;
	@Column (name="name_MA_type")
	private String type;
	@Lob     // This is a large object 
	private String description;
	
	//****** Constructor ******************

	public MaTypenew() {
	}
	
	
	public MaTypenew(String type,String description) {
		this.type = type;
		this.description = description;
	}
	
	
	public MaTypenew(String type) {
		this.type = type;
		this.description = "";
	}
	
	//****** Getters and Setters ******************
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	
	
	
	
}
