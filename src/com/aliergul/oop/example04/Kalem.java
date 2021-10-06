package com.aliergul.oop.example04;

public class Kalem {
	private String model = "";
	private double price = 0d;
	
	public Kalem(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Kalem [model=" + model + ", price=" + price + "]";
	}
	
}
