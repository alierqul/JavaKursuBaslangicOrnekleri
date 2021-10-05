package com.aliergul.oop.example03;

public class PcPacket extends PcItem {
	private MotherBoard motherBoard;
	private Cpu cpu;
	private Ram ram;
	private Usb usb;
	private Mouse mouse;
	private Klavye klavye;
	
	public PcPacket(String name, String model, String year, double price, MotherBoard motherBoard, Cpu cpu, Ram ram,
			Usb usb, Mouse mouse, Klavye klavye) {
		super(name, model, year, price);
		this.motherBoard = motherBoard;
		this.cpu = cpu;
		this.ram = ram;
		this.usb = usb;
		this.mouse = mouse;
		this.klavye = klavye;
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "PcPacket";
	}
	
}
