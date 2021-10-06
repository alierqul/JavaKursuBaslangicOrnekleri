package com.aliergul.oop.example03;

public class Ram extends PcItem implements IFinans {
	
	private String delay = "";
	private String frekans = "";
	private String rom = "";
	private double pierce = 0d;
	
	public Ram(String name, String model, String year, double price, String delay, String frekans, String rom) {
		super(model, year);
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
	
	@Override
	public void setNewPierce(double pierce) {
		this.pierce = pierce;
	}
	
	@Override
	public double getNewPierce() {
		
		return this.pierce;
	}
	
}
