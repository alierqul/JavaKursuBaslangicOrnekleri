package com.alierul.oop.example03;

abstract class PcItem {
	private String name = "";
	private String model = "";
	private String year = "";
	private double price = 0d;
	
	public abstract String getItemName();
	
	public PcItem(String name, String model, String year, double price) {
		super();
		this.name = name;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "PcItem [name=" + name + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
