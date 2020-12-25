package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orderr {

	@Id
	@GeneratedValue
	private Integer sno;
	private String type;
	private String address;
	private String locname;
	private String foodtype;
	private String time;
	public Orderr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Orderr(String type, String address, String locname, String foodtype, String time) {
		super();
		this.type = type;
		this.address = address;
		this.locname = locname;
		this.foodtype = foodtype;
		this.time = time;
	}
	
	
	
	
	
	
	
	
	
	
}
