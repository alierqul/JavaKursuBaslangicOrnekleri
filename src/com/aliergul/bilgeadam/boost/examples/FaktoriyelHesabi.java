package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class FaktoriyelHesabi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi = 0;
		do {
			
			double faktoriyel = 1L;
			System.out.println("\t\t======================================");
			System.out.println("\t\t===       Faktoriyel Program       ===");
			System.out.println("\t\t======================================");
			
			System.out.print("\t\tFaktoriyel hesaplanacak sayi : ");
			sayi = in.nextInt();
			if (sayi < 0)
				System.out.println("\t\tPozitif Girebilirsiniz.\n");
			else if (sayi == 0 || sayi == 1)
				System.out.println("\t\t Sonuc Bir (1) dir .\n");
			else if (sayi > 1) {
				for (int i = 1; i <= sayi; i++) {
					faktoriyel *= i;
					
				}
				
			}
			System.out.println("\t\tFaktoriyel Sonucu= " + faktoriyel);
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			sayi = in.nextInt();
			
		} while (sayi != 0);
		System.out.println("\t\tYine Bekleriz...");
		in.close();
	}
	
}
