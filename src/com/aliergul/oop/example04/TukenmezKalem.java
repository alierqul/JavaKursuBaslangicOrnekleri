package com.aliergul.oop.example04;

public class TukenmezKalem extends Kalem {
	
	private String color = "";
	private String type = "";
	
	public TukenmezKalem(String model, double price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}
	
	public TukenmezKalem(String model, double price, String color, String type) {
		super(model, price);
		this.color = color;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "TukenmezKalem [color=" + color + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	
}
