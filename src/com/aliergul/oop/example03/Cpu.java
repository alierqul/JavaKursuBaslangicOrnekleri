package com.aliergul.oop.example03;

public class Cpu extends PcItem implements IFinans {
	
	private String pin = "";
	private double pierce = 0d;
	
	public Cpu(String model, String year, double pierce, String pin) {
		super(model, year);
		this.pierce = pierce;
		this.pin = pin;
		
	}
	
	@Override
	public String getItemName() {
		return "Cpu";
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
