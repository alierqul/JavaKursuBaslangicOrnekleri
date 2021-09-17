package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_009_TekCift {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi = 0;
		do {
			
			System.out.print("Bir Tam Sayı Giriniz: ");
			sayi = in.nextInt();
			
			if (sayi == 0) {
				System.out.println("Girilen Sayı: Sıfır " + sayi);
			} else if (Math.abs(sayi) % 2 == 1) {
				System.out.println("Girilen Sayı Tek Sayı: " + sayi);
			} else {
				System.out.println("Girilen Sayı çift Sayı: " + sayi);
			}
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			sayi = in.nextInt();
		} while (sayi != 0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
