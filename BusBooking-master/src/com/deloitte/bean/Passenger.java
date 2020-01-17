package com.deloitte.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="psngr_id")
	private int id;
	@Column(name="passenger_name")
	private String name;
	/*@Column(name="passenger_gender")
	private String gender;*/
	@Column(name="to_stn")
	private String to;
	@Column(name="from_stn")
	private String from;
//	@Column(name="athlete_email")
//	private String email;
	@Column(name="psngr_mobile")
	private String mobile;
//	@Column(name="availability")
//	private String availability;


//	public String getAvailability() {
//		return availability;
//	}
//
//	public void setAvailability(String availability) {
//		this.availability = availability;
//	}

	public Passenger() {
	}



	
//
//	public Passenger(int id, String name, String gender, String to, String from, String bus, String mobile) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.gender = gender;
//	this.to = to;
//	this.from = from;
//	this.bus = bus;
//	this.mobile = mobile;
//}





	public int getId() {
		return id;
	}





	public Passenger(int id, String name, String to, String from, String mobile) {
	super();
	this.id = id;
	this.name = name;
	this.to = to;
	this.from = from;
	this.mobile = mobile;
}




	public void setId(int id) {
		this.id = id;
	}





	public String getTo() {
		return to;
	}





	public void setTo(String to) {
		this.to = to;
	}





	public String getFrom() {
		return from;
	}





	public void setFrom(String from) {
		this.from = from;
	}





	@NotEmpty(message="Passenger Name is required")
	@Pattern(regexp="^[A-Z][A-Za-z]{2,40}$", 
	   message="Passenger name should have only characters and first letter should be uppercase")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@NotEmpty(message="Gender not selected")
//	public String getGender() {
//		return gender;
//	}

//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	
//	@Pattern(regexp = "^(?:(?!Select).)*$",
//			message="Select a Bus")
//	public String getBus() {
//		return bus;
//	}
//
//	public void setBus(String bus) {
//		this.bus = bus;
//	}

	
	
	@NotEmpty(message="Mobile is required")
	@Pattern(regexp = "[7-9][0-9]{9}",
		message="Mobile should start with 7,8 or 9 and have 10 digits")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", to=" + to + ", from=" + from + ", mobile=" + mobile + "]";
	}




//
//	@Override
//	public String toString() {
//		return "Passenger [id=" + id + ", name=" + name + ", gender=" + gender + ", to=" + to + ", from=" + from
//				+ ", bus=" + bus + ", mobile=" + mobile + "]";
//	}

	

	
	
	}


