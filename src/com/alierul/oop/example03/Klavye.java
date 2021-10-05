package com.alierul.oop.example03;

public class Klavye extends PcItem {
	private String keyType;
	
	public Klavye(String name, String model, String year, double price, String keyType) {
		super(name, model, year, price);
		this.keyType = keyType;
	}
	
	@Override
	public String getItemName() {
		
		return "Klavye";
	}
	
	@Override
	public String toString() {
		return "Klavye [keyType=" + keyType + ",super = " + super.toString() + "]";
	}
	
}
