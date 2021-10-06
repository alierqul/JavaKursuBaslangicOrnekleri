package com.aliergul.oop.example03;

public class Mouse extends PcItem {
	
	private String weight = "";
	private String dpi = "";
	
	public Mouse(String model, String year, String weight, String dpi) {
		super(model, year);
		this.weight = weight;
		this.dpi = dpi;
	}
	
	@Override
	public String getItemName() {
		
		return "Mouse";
	}
	
	@Override
	public String toString() {
		return "Mouse [weight=" + weight + ",super = " + super.toString() + "]";
	}
	
}
