package com.springcode;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	
	public int getCustomerId() {
		return customerId;
	}
	
	public long getCustomerContact() {
		return customerContact;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	public Customer(int customerId,String customerName,long customerContact,Address customerAddress)
	{
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerContact=customerContact;
		this.customerAddress=customerAddress;
	}
	 
	public void CustomerInfo() {
		System.out.println("Customer Information:\nCustomer Id: "+getCustomerId()+"\nCustomer Name: "
				+getCustomerName()+"\nCustomer Contact: "+getCustomerContact()+"\nCustomer Address: "
				+getCustomerAddress().getStreet()+","+getCustomerAddress().getCity()+","+getCustomerAddress().getState()+","
				+getCustomerAddress().getCountry()+"-"+getCustomerAddress().getZip());
	}
	
	
}
