/**
 * 
 */
package com.aliergul.oop.example03;

/**
 * Anakart
 * -Model
 * -Fiyatı
 * -Yılı
 * Cpu
 * -model
 * -name
 * -pin
 * Ram
 * -frekans
 * -delay
 * -hafıza
 * -model
 * Usb
 * -hızı
 * -model
 * -teknloji(2.0,3.0)
 * mouse
 * -name
 * -ağırlığı
 * -fiyatı
 * -modeli
 * Ayrı Paketler
 * -anakrt, cpu,ram, usb,mouse, klavyye
 * 
 * Anakart
 * -marks 1 =ısınma
 * -mark 2 ısınmaz
 * cpu
 * -cpu_x1
 * -cpu_x2
 * Ram
 * -8Gb
 * -16Gb
 * Usb
 * -2.0
 * -3.0
 * Mouse
 * -Blue
 * 
 * @author ERGUL
 *
 */
public class MainTestClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotherBoard marks1 = new MotherBoard("Marks", "Marks 1", "2020", 800, "İntel");
		MotherBoard marks2 = new MotherBoard("Marks", "Marks 2", "2021", 1600, "İntel");
		
		Cpu cpu1 = new Cpu("intel", "i5", "2018", 1200, "960 pin");
		Cpu cpu2 = new Cpu("intel", "i7", "2019", 1800, "1200 pin");
		
		Ram ram1 = new Ram("Kingston", "vega", "2015", 300, "delay 1", "400Ghz", "8GB");
		Ram ram2 = new Ram("Kingston", "delta", "2018", 750, "delay 1", "1200Ghz", "16GB");
		
		Usb usb1 = new Usb("Usb", "Usb2.0", "2013", 0, "Usbx2.0", "400");
		Usb usb2 = new Usb("Usb", "Usb3.0", "2015", 0, "Usbx3.0", "1000");
		
		Mouse mouse1 = new Mouse("Everes", "TB200", "2010", 70, "10gr");
		Mouse mouse2 = new Mouse("Everes", "TB500", "2011", 90, "12gr");
		
		Klavye klavye1 = new Klavye("Everest", "TRQ200", "2005", 60, "QKlavye");
		Klavye klavye2 = new Klavye("Everest", "TRF200", "2005", 75, "FKlavye");
		
		PcPacket packet1 = new PcPacket("Casper Toplama", "MonsterAF45TR00047", "2015", 15999, marks2, cpu2, ram2, usb2,
				mouse2, klavye2);
		PcPacket packet2 = new PcPacket("Casper Toplama", "MonsterAF45TR00047", "2016", 14999, marks1, cpu1, ram1, usb2,
				mouse1, klavye1);
		PcPacket packet3 = new PcPacket("Casper Toplama", "MonsterAF45TR00047", "2017", 19999, marks2, cpu2, ram2, usb2,
				mouse2, klavye2);
		
	}
	
}
