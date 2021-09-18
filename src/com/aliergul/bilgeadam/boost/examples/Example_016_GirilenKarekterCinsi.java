package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_016_GirilenKarekterCinsi {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String key = "";
		char chr = '0';
		do {
			
			double faktoriyel = 1L;
			System.out.println("\t\t======================================");
			System.out.println("\t\t===  Girilen Harf Cinsi Program    ===");
			System.out.println("\t\t======================================");
			
			System.out.print("\t\tBir karakter yaz : ");
			key = in.nextLine();
			chr = key.charAt(0);
			// 48-57 rakamlar
			// 65-90 büük harf
			// 97-122
			if (Character.isDigit(chr)) {
				System.out.println("\t\tRakam Girdiniz.");
			} else if (Character.isLetter(chr)) {
				System.out.println("\t\tHarf Girdiniz.");
			} else if (Character.isLetter(chr)) {
				System.out.println("\t\tÖzel karakter Girdiniz.");
			}
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			key = in.next();
			
		} while (!key.equals("0"));
		System.out.println("\t\tYine Bekleriz...");
		in.close();
		
	}
	
}
