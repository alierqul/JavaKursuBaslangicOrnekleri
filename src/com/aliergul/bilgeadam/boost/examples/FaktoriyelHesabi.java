package com.aliergul.bilgeadam.boost.examples;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author ERGUL
 *
 */
public class FaktoriyelHesabi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi = 0;
		do {
			
			BigInteger faktoriyel = BigInteger.ONE;
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
				for (long i = 1; i <= sayi; i++) {
					faktoriyel = faktoriyel.multiply(BigInteger.valueOf(i));
					
				}
				
			}
			System.out.printf("\t\tFaktöriyel Sonucu %s %n", faktoriyel);
			
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			sayi = in.nextInt();
			
		} while (sayi != 0);
		System.out.println("\t\tYine Bekleriz...");
		in.close();
	}
	
}
