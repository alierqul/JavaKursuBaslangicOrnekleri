package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_017_AsalSayilar {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi = 1, kalan, bolenSayisi = 0;
		
		while (true) {
			
			kalan = 0;
			bolenSayisi = 0;
			System.out.println("\t\t======================================");
			System.out.println("\t\t===  Asal Sayılar Bulan Program    ===");
			System.out.println("\t\t======================================");
			System.out.print("\t\tBir Sayı yazınız : ");
			sayi = in.nextInt();
			sayi = Math.abs(sayi);
			if (sayi == 1 || sayi == 0) {
				System.out.printf(
						"\n\n\t\tGirilen %d sayısıdır. Asal Değildir.\n\t\tAsal Olabilmesi için çarpanlar kümesi en az iki elemanlı olmalıdır.",
						sayi);
			} else if (sayi == 2) {
				System.out.println("\n\t\tEn Küçük ve tek çift Asal Sayıdır.");
			} else {
				System.out.printf("\n\n\t\tGirilen %d sayısıdır. Bölen Sayıları:\n\t\t1 ,", sayi);
				for (int i = 2; i <= sayi; i += 1) {
					kalan = sayi % i;
					if (kalan == 0) {
						bolenSayisi++;
						System.out.print((bolenSayisi % 9 == 0) ? "\n\t\t" : "");
						System.out.printf("%d ", i);
						System.out.printf((i == (sayi)) ? "\n\t\tsayılarına kalansız bölünebiliyor." : ",");
					}
				}
				// Sonuc Ekranı
				if (bolenSayisi == 1) {
					System.out.println("\n\n\t\tSadece Bir e ve Kendine Böündüğünden ASAL SAYIDIR. " + bolenSayisi);
				} else {
					System.out.printf("\n\n\t\tPozitif Bölen Sayısı= %d \n\t\tASAL DEĞİLDİR. ", bolenSayisi + 1);
				}
				
			}
			
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			if (in.next().equals("0"))
				break;
			
		}
		System.out.println("\n\n\t\t\t... Yine Bekleriz ...");
		in.close();
	}
	
}
