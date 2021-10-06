package com.aliergul.oop.example03;

public class PcPacket extends PcItem implements IFinans {
	private MotherBoard motherBoard;
	private Cpu cpu;
	private Ram ram;
	private Usb usb;
	private Mouse mouse;
	private Klavye klavye;
	private double pierce = 0d;
	
	public PcPacket(String model, String year, double price, MotherBoard motherBoard, Cpu cpu, Ram ram, Usb usb,
			Mouse mouse, Klavye klavye) {
		super(model, year);
		this.motherBoard = motherBoard;
		this.cpu = cpu;
		this.ram = ram;
		this.usb = usb;
		this.mouse = mouse;
		this.klavye = klavye;
		this.pierce = pierce;
	}
	
	@Override
	public String getItemName() {
		
		return "PcPacket";
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
