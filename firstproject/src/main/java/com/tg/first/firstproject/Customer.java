package com.tg.first.firstproject;

import java.util.Properties;

public class Customer {

	private String Name;
//	private List<String> address;//same goes for set
	private String contact;
//	private Map<String, String> address;
	private Properties address;
	public Customer(String name, int contact, String address) {
		System.out.println(address);
		System.out.println(contact);
		System.out.println(name);
	}
	public Customer(String name, String contact, Properties address) {
		super();
		Name = name;
		this.contact = contact;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", contact=" + contact + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}
