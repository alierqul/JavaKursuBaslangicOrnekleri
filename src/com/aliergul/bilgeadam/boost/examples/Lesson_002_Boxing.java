/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         Kullanıcıdan aldığı Byte Değeri Boxing yapan program.
 */
public class Lesson_002_Boxing {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		byte sayi = 0;
		System.out.print("Bir Sayı Giriniz: ");
		sayi = in.nextByte();
		
		// Boxing
		Byte wrapSayi = null;
		wrapSayi = new Byte(sayi);
		System.out.println("Wrapper Sayi = " + wrapSayi);
		// unBoxing
		int primitiNumber = wrapSayi;
		System.out.println("UnBoxing Sayi = " + wrapSayi);
	}
	
	static void m(int i, int i2) {
		System.out.println("int int");
	}
	
	static void m(Integer... i) {
		System.out.println("Integer...");
	}
	
}
