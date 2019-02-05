package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LenthSize")
public class LenthSize {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lenthSizeID;
	float width;
	float length;
	float height;
	

	public LenthSize() {
	}


	public LenthSize(float width, float length, float height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public int getLenthSizeID() {
		return lenthSizeID;
	}
	
	
	
	
	
}
