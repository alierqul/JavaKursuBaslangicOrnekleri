package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_002_NegatifPozitif {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi = 0;
		do {
			
			System.out.print("Bir Tam Sayı Giriniz: ");
			sayi = in.nextInt();
			if (sayi == 0) {
				System.out.println("Girilen Sayı: " + sayi);
			} else if (sayi < 0) {
				System.out.println("Girilen Sayı Negatif: " + sayi);
			} else if (sayi > 0) {
				System.out.println("Girilen Sayı Pozitif: " + sayi);
			}
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			sayi = in.nextInt();
		} while (sayi != 0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
