package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.datalayer.DaoImplements.SchoolImplement;

@Entity
@Table(name = "Account")
public class Account {

	    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    protected int accountID;
		protected String useNname;
		protected String password;
		protected Date creationTime;
		protected int roleId;
		protected int schoolId;
		
		// for add account
		public Account(String useNname, String password, Date creationTime, int school,int role) {
			super();
			this.useNname = useNname;
			this.password = password;
			this.creationTime = creationTime;
		}
		
		// for add school (the role will be account school admin)
		public Account(String useNname, String password, Date creationTime, int school) {
			super();
			this.roleId = 2;
			this.useNname = useNname;
			this.password = password;
			this.creationTime = creationTime;
			this.schoolId = school;
		}
		
		
		public Account() {
		}


		public String getUseNname() {
			return useNname;
		}


		public void setUseNname(String useNname) {
			this.useNname = useNname;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Date getCreationTime() {
			return creationTime;
		}


		public void setCreationTime(Date creationTime) {
			this.creationTime = creationTime;
		}


		public int getRoleId() {
			return roleId;
		}


		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}


		public int getAccountID() {
			return accountID;
		}
		
		public int getRole() {
			return roleId;
		}

		public void setRole(int role) {
			this.roleId = role;
		}

		public int getSchool() {
			return schoolId;
		}

		public void setSchool(int school) {
			this.schoolId = school;
		}
		
}