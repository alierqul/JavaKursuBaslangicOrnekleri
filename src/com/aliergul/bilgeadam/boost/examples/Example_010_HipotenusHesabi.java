package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_010_HipotenusHesabi {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double aKenari = 0.0;
		double bKenari = 0.0;
		double cKenari = 0.0;
		do {
			System.out.println("Hipotenüs Hesabı");
			System.out.print("a Kenarını Giriniz: ");
			aKenari = in.nextDouble();
			System.out.print("b Kenarını Giriniz: ");
			bKenari = in.nextDouble();
			cKenari = Math.sqrt(aKenari * aKenari + bKenari * bKenari);
			System.out.printf("c Kenarı Hipotenüs =: %.2f \n", cKenari);
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			aKenari = in.nextDouble();
		} while (aKenari != 0.0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
