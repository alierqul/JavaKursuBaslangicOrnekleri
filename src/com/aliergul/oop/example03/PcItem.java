package com.aliergul.oop.example03;

abstract class PcItem {
	
	private String model = "";
	private String year = "";
	
	public abstract String getItemName();
	
	public PcItem(String model, String year) {
		super();
		this.model = model;
		this.year = year;
		
	}
	
	@Override
	public String toString() {
		return "PcItem [getItemName()=" + getItemName() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
				+ "]";
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
}
