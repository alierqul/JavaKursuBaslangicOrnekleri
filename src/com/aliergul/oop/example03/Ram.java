package com.aliergul.oop.example03;

public class Ram extends PcItem {
	
	private String delay = "";
	private String frekans = "";
	private String rom = "";
	
	public Ram(String name, String model, String year, double price, String delay, String frekans, String rom) {
		super(name, model, year, price);
		this.delay = delay;
		this.frekans = frekans;
		this.rom = rom;
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "Ram";
	}
	
	@Override
	public String toString() {
		return "Ram [delay=" + delay + ", frekans=" + frekans + ", rom=" + rom + ",super = " + super.toString() + "]";
	}
	
}
