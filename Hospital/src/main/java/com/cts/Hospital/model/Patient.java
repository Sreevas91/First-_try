package com.cts.Hospital.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PatientsData")


public class Patient {
	
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		private String name;
		private String gender;
		private String Problem;
		private Date Date_of_booking ;
		@Column(name="phoneNumber",unique=true )
		private Long Phone_Number;
		
		
		//Constructor from superclass
		public Patient() {
			super();
				}
		
		
		//getters ,setters
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getProblem() {
			return Problem;
		}
		public void setProblem(String problem) {
			Problem = problem;
		}
		public Date getDate_of_booking() {
			return Date_of_booking;
		}
		public void setDate_of_booking(Date date_of_booking) {
			Date_of_booking = date_of_booking;
		}
		public Long getPhone_Number() {
			return Phone_Number;
		}
		public void setPhone_Number(Long phone_Number) {
			Phone_Number = phone_Number;
		}
		
}