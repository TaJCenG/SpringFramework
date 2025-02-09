package com.tg.first.firstproject;

import java.util.Date;

public class Order {

	private String productId;
	private String productName;
	private Customer customer;
	public Order(String productId, String productName, Customer customer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [productId=" + productId + ", productName=" + productName + ", customer=" + customer
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}




}
