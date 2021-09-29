/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         Java Kursu �rnekleri
 *         ders10
 */
public class OdevMain {
	static Scanner in;
	// Basit Projeler...
	
	public static void main(String[] args) {
		appMenu();
	}
	
	private static void appMenu() {
		in = new Scanner(System.in);
		int secim = viewMenu();
		while (secim > 0) {
			System.out.println("");
			if (secim == 1) {
				// Dolar �eviri
				System.out.print("Dolar Tutar�n� Gir: ");
				Example_003_DolarCeviri dolarCeviri = new Example_003_DolarCeviri();
				dolarCeviri.cevirDolarTL(in.nextDouble());
				
			} else if (secim == 2) {
				// TL �eviri
				System.out.print("Türklirası Tutarını Gir: ");
				Example_003_DolarCeviri dolarCeviri = new Example_003_DolarCeviri();
				dolarCeviri.cevirTLDolar(in.nextDouble());
				
			} else if (secim == 3) {
				
				System.out.print("3- Fahrenhayt Çeviri ");
				Example_005_Celcius fahrenhayt = new Example_005_Celcius();
				fahrenhayt.bulFahrenhayt();
				
			} else if (secim == 4) {
				
				System.out.print("4- VKI Hesaplama ");
				Example_006_VKIKiloDegerlendirme kiloDegerlendirme = new Example_006_VKIKiloDegerlendirme();
				kiloDegerlendirme.bulVki();
			} else if (secim == 5) {
				
				System.out.print("5- Haftanın Günü ");
				Example_007_HaftaninGunleri haftaninGunleri = new Example_007_HaftaninGunleri();
				haftaninGunleri.viewHaftaninGunu();
			}
			
			secim = viewMenu();
		}
		
	}
	
	static int viewMenu() {
		
		System.out.println("\n1- TL - Dolar Çeviri ");
		System.out.println("2- Dolar -TL Çeviri ");
		System.out.println("3- Fahrenhayt Çeviri ");
		System.out.println("4- VKI Hesaplama ");
		System.out.println("5- Haftanın Günü ");
		System.out.println("0- Çıkış");
		return in.nextInt();
		
	}
	
	public class Lesson {
		public static void main(String[] args) {
			int aKenari = 10; // Gerçek Değerler
			int bKenari = 6; // Gerçek Değerler
			hesaplaAlan(aKenari, bKenari);
		}
		
		public static int hesaplaAlan(int a, int b) { // kenar uzunluklarının temsili bir değeridir.
			return a * b; // method bitene kadar hafızada saklanan geçici referans değerleri diyebiliriz.
		} // method tamamlandıktan sonra bu parametreler
			// GarbageCollector tarafından temizlenir.
	}
}
