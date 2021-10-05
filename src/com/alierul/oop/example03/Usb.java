package com.alierul.oop.example03;

public class Usb extends PcItem {
	private String usbType = "";
	private String usbSpeed = "";
	
	public Usb(String name, String model, String year, double price, String usbType, String usbSpeed) {
		super(name, model, year, price);
		this.usbSpeed = usbSpeed;
		this.usbType = usbType;
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "Usb";
	}
	
	@Override
	public String toString() {
		return "Usb [usbType=" + usbType + ", usbSpeed=" + usbSpeed + ",super = " + super.toString() + "]";
	}
	
}
