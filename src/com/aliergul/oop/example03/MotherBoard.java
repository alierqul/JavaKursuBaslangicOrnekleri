package com.aliergul.oop.example03;

public class MotherBoard extends PcItem implements IFinans {
	
	private String CpuType = "";
	private double pierce = 0d;
	
	public MotherBoard(String model, String year, double price, String CpuType) {
		super(model, year);
		this.CpuType = CpuType;
		this.pierce = pierce;
	}
	
	@Override
	public String getItemName() {
		
		return "MotherBoard";
	}
	
	@Override
	public String toString() {
		return "MotherBoard [CpuType=" + CpuType + ",super = " + super.toString() + "]";
	}
	
	@Override
	public void setNewPierce(double pierce) {
		this.pierce = pierce;
		
	}
	
	@Override
	public double getNewPierce() {
		
		return this.pierce;
	}
	
}
