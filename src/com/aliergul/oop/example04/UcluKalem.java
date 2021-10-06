package com.aliergul.oop.example04;

public class UcluKalem extends Kalem {
	private String type = "";
	
	public UcluKalem(String model, double price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}
	
	public UcluKalem(String model, double price, String type) {
		super(model, price);
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "UcluKalem [type=" + type + ", toString()=" + super.toString() + "]";
	}
	
}
