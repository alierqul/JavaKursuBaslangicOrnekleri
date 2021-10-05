package com.aliergul.oop.example03;

public class Mouse extends PcItem {
	
	private String weight = "";
	
	public Mouse(String name, String model, String year, double price, String weight) {
		super(name, model, year, price);
		this.weight = weight;
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "Mouse";
	}
	
	@Override
	public String toString() {
		return "Mouse [weight=" + weight + ",super = " + super.toString() + "]";
	}
	
}
