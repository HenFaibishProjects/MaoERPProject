package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MaTypeTrainer")
public class MaTypeTrainer {
	
	
		 
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="maTypeToTrainer")
		private int maTypeToTrainerId;
		private int trainerId;
		private int maId;
		private String belt;
		private int stripes;
		
		
		public MaTypeTrainer() {

		}
		
		public MaTypeTrainer(int trainerId, int maId, String belt, int stripes) {
			super();
			this.trainerId = trainerId;
			this.maId = maId;
			this.belt = belt;
			this.stripes = stripes;
		}
		
		
		public int getTrainerId() {
			return trainerId;
		}
		public void setTrainerId(int trainerId) {
			this.trainerId = trainerId;
		}
		public int getMaId() {
			return maId;
		}
		public void setMaId(int maId) {
			this.maId = maId;
		}
		public String getBelt() {
			return belt;
		}
		public void setBelt(String belt) {
			this.belt = belt;
		}
		public int getStripes() {
			return stripes;
		}
		public void setStripes(int stripes) {
			this.stripes = stripes;
		}
		public int getMaTypeToTrainerId() {
			return maTypeToTrainerId;
		}

		

}
