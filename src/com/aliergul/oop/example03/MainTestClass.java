/**
 * 
 */
package com.aliergul.oop.example03;

/**
 * @author ERGUL
 *
 */
public class MainTestClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotherBoard marks1 = new MotherBoard("İntel Marks 1", "2020", 800, "İntel");
		MotherBoard marks2 = new MotherBoard("AMD Marks 2", "2021", 1600, "İntel");
		
		Cpu cpu1 = new Cpu("intel i5", "2018", 1200, "960 pin");
		Cpu cpu2 = new Cpu("intel i7", "2019", 1800, "1200 pin");
		
		Ram ram1 = new Ram("Kingston", "vega", "2015", 300, "delay 1", "400Ghz", "8GB");
		Ram ram2 = new Ram("Kingston", "delta", "2018", 750, "delay 1", "1200Ghz", "16GB");
		
		Usb usb1 = new Usb("Usb", "Usb2.0", "2013", "Usbx2.0", "400");
		Usb usb2 = new Usb("Usb", "Usb3.0", "2015", "Usbx3.0", "1000");
		
		Mouse mouse1 = new Mouse("Everes TB200", "2010", "10gr", "400");
		Mouse mouse2 = new Mouse("Everes TB500", "2011", "12gr", "400");
		
		Klavye klavye1 = new Klavye("Everest TRQ200", "2005", "QKlavye", true);
		Klavye klavye2 = new Klavye("Everest TRF200", "2005", "FKlavye", true);
		
		PcPacket packet1 = new PcPacket("MonsterAF45TR00047", "2015", 15999, marks2, cpu2, ram2, usb2, mouse2, klavye2);
		PcPacket packet2 = new PcPacket("MonsterAF45TR00047", "2016", 14999, marks1, cpu1, ram1, usb2, mouse1, klavye1);
		PcPacket packet3 = new PcPacket("MonsterAF45TR00047", "2017", 19999, marks2, cpu2, ram2, usb2, mouse2, klavye2);
		
	}
	
}
