package com.springcode;

public class Address {
	private String street,city,state,country;
	private int zip;
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getZip() {
		return zip;
	}
	
	public Address(String street,String city,String state,String country,int zip) {
		super();
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
		this.zip=zip;
	}

}
