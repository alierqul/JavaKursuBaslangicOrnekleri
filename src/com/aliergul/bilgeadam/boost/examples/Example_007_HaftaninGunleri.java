package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_007_HaftaninGunleri {
	
	public void viewHaftaninGunu() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("1-7 arasında sayı Yazınız : ");
			int gun = in.nextInt();
			switch (gun) {
				case 1: {
					System.out.println(gun + "- Pazartesi Günü Birinci Gün");
					break;
				}
				case 2: {
					System.out.println(gun + "- Salı Günü ikinci Gün");
					break;
				}
				case 3: {
					System.out.println(gun + "- Çarşamba Günü üçüncü Gün");
					break;
				}
				case 4: {
					System.out.println(gun + "- Perşembe Günü dördüncü Gün");
					break;
				}
				case 5: {
					System.out.println(gun + "- Cuma Günü beşinci Gün");
					break;
				}
				case 6: {
					System.out.println(gun + "- Cumartesi Günü altıncı Günü");
					break;
				}
				case 7: {
					System.out.println(gun + "- Pazar Günü yedinci Gün");
					break;
				}
				default:
					throw new IllegalArgumentException("Böyle Bir gün Tanımlı Değil: " + gun);
			}
			System.out.println("Çıkmak İster misiniz? [Çıkış:0 Devam: 1]");
			
		} while (in.nextInt() != 0);
		
	}
	
}
