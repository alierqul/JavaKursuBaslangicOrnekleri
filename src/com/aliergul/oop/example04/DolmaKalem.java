package com.aliergul.oop.example04;

public class DolmaKalem extends Kalem {
	private String color = "";
	
	public DolmaKalem(String model, double price) {
		super(model, price);
	}
	
	public DolmaKalem(String model, double price, String color) {
		super(model, price);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "DolmaKalem [color=" + color + ", toString()=" + super.toString() + "]";
	}
	
}
