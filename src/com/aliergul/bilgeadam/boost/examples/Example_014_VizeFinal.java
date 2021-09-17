package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_014_VizeFinal {
	private static final double VIZE_ORAN = 0.4;
	private static final double FINAL_ORAN = 0.6;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vizeNotu = 0;
		int finalNotu = 0;
		double ortalama = 0.0;
		do {
			System.out.println("Vize Final Ortalaması Hesabı");
			System.out.print("Vize Notunu Giriniz: ");
			vizeNotu = in.nextInt();
			System.out.print("Final  Notunu Giriniz: ");
			finalNotu = in.nextInt();
			ortalama = vizeNotu * VIZE_ORAN + finalNotu * FINAL_ORAN;
			System.out.printf("%d Vize %d Final Ortalama Notu= %.2f \n", vizeNotu, finalNotu, ortalama);
			
			switch ((int) ortalama / 10) {
				case 9, 10: {
					System.out.println("Tebrikler AA Notunuz. ");
					break;
				}
				case 8: {
					System.out.println("Fena Değil BB Notunuz. ");
					break;
				}
				case 7: {
					System.out.println("Kıl Payı CC Notunuz. ");
					break;
				}
				case 6, 5: {
					System.out.println("Az Kalmıştı DD Notunuz. ");
					break;
				}
				case 4, 3, 2, 1, 0: {
					System.out.println("Üzgünüm FF Notunuz. ");
					break;
				}
				default: {
					System.out.println("Hatalı Not Girdiniz... ");
					break;
				}
			}
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			vizeNotu = in.nextInt();
		} while (vizeNotu != 0.0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
