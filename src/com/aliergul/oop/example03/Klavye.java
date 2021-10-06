package com.aliergul.oop.example03;

public class Klavye extends PcItem {
	private String keyType;
	private boolean isMekanic = false;
	
	public Klavye(String model, String year, String keyType, boolean isMekanic) {
		super(model, year);
		this.keyType = keyType;
		this.isMekanic = isMekanic;
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
