package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * 
 * @author ERGUL
 *         VKI hesaaplama
 */
public class Example_006_VKIKiloDegerlendirme {
	public void bulVki() {
		Scanner in = new Scanner(System.in);
		System.out.print("Kilo Gir: ");
		double k = in.nextDouble();
		System.out.print("boy Gir:");
		double b = 0f;
		b = in.nextDouble();
		double vki = 0f;
		vki = k / (b * b);
		System.out.println("VK� degeri = " + vki);
		if (vki < 18.5) {
			System.out.println("18, 5 kg/m.' nin altında olanlar: Zayıf.");
		} else if (vki >= 18.5 && vki < 24.9) {
			System.out.println("18.5 - 24, 9 kg/m. arasında olanlar: Normal kilolu.");
		} else if (vki >= 25 && vki < 29.9) {
			System.out.println("25 - 29, 9 kg/m. arasında olanlar: Fazla kilolu.");
		} else if (vki >= 30 && vki < 39) {
			System.out.println("30 � 39, 9 kg/m. arasında olanlar: Obez.");
		} else {
			System.out.println("40 kg/m.'nin üzerinde olanlar: ileri derecede obez (morbid obez), olarak görülür.");
			
		}
		
	}
}
