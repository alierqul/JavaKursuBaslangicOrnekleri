package com.aliergul.oop.example03;

public class MotherBoard extends PcItem {
	
	private String CpuType = "";
	
	public MotherBoard(String name, String model, String year, double price, String CpuType) {
		super(name, model, year, price);
		this.CpuType = CpuType;
	}
	
	@Override
	public String getItemName() {
		
		return "MotherBoard";
	}
	
	@Override
	public String toString() {
		return "MotherBoard [CpuType=" + CpuType + ",super = " + super.toString() + "]";
	}
	
}
