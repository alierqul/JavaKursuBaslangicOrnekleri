/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

/**
 * @author ERGUL
 * 
 */
public class Example_020_MenuClone {
	static Scanner in;
	static double sonuc = 0.0;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		do {
			switch (viewMenu()) {
				case 1: {
					
					break;
				}
				case 2: {
					
					break;
				}
				case 3: {
					
					break;
				}
				case 4: {
					
					break;
				}
				case 0: {
					ConsoleHelper.print("Çıkış Yapıldı.", 2, false);
					System.exit(0);
					break;
				}
				default:
					
					ConsoleHelper.print("Yanlış Seçim Yapıldı.", 2, false);
					;
			}
			
		} while (!ConsoleHelper.selectMenu("Çıkmak için [0] tuşlayınız.").equals("0"));
		
	}
	
	private static int viewMenu() {
		ConsoleHelper.printTitle("- Hesap Makinesi -");
		System.out.println("= 1- Toplama");
		System.out.println("= 2- Çıkarma");
		System.out.println("= 3- Çarpma");
		System.out.println("= 4- Bölme");
		System.out.println("\n= 0- Çıkış");
		return in.nextInt();
	}
	
}
