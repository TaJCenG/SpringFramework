package com.tg.first.firstproject;

import java.util.Date;

public class Order {

	private String Id;
	private Date date;
	private String productName;
	private Customer customer;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
