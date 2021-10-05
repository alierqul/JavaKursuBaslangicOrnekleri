package com.alierul.oop.example03;

public class Cpu extends PcItem {
	private String pin = "";
	
	public Cpu(String name, String model, String year, double price, String pin) {
		super(name, model, year, price);
		this.pin = pin;
	}
	
	@Override
	public String getItemName() {
		
		return "Cpu";
	}
	
	@Override
	public String toString() {
		return "Cpu [pin=" + pin + "" + ", getItemName()=" + getItemName() + ",super = " + super.toString() + "]";
	}
	
}
