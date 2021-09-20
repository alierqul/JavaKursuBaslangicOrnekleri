/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

/**
 * @author ERGUL
 *
 */
public class Lesson_001_Casting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sayi1 = "4";
		int yeniSayi1 = Integer.valueOf(sayi1);
		int yeniSayi2 = Integer.parseInt(sayi1);
		int sayi2 = 6;
		System.out.println(sayi1 + sayi2);
		System.out.println(yeniSayi1 + sayi2);
		System.out.println(yeniSayi2 + sayi2);
		// System.out.println(sayi1+sayi2);
		// Tam Sayıyı String e Çevirme
		int sayi5 = 44;
		String strSayi1 = String.valueOf(sayi5);
		String strSayi2 = Integer.toString(sayi5);
		System.out.println(strSayi1 + " " + sayi2);
		
		// boxing
		// unboxing
		// DataType = primitive + wrapper class
		// Lesson_002 örnek yapıldı.
		// primitive type
		int sayi6 = 6; // null değer alamaz .
		
		// wrapper class
		Integer wrapSayi = null; // Object referans sınıfı kullandığından null alabiiliyor
		wrapSayi = new Integer(5);
	}
	
}
