package com.Mao.BackEndDev.businessObjects.hr.Schools;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long roleId;
	public String roleName;
	
	
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	
	public Role() {

	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Long getRoleId() {
		return roleId;
	}
	
	
	
}

