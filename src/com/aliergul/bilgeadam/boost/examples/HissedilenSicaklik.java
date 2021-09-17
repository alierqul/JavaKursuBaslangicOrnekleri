package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class HissedilenSicaklik {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double reelSicaklik = 0.0;
		double hizRuzgar = 0.0;
		double hissedilenSicaklik = 0.0;
		do {
			System.out.println("\t\t======================================");
			System.out.println("\t\t===  Hissedilen Sıcaklık Program   ===");
			System.out.println("\t\t======================================");
			
			System.out.print("\t\tReel Sıcaklık Giriniz : ");
			reelSicaklik = in.nextDouble();
			reelSicaklik = toCelFah(reelSicaklik);
			
			do {
				System.out.print("\t\tRüzgar Hızını Giriniz : ");
				hizRuzgar = in.nextDouble();
				if (hizRuzgar < 0)
					System.out.println("\t\tPozitif Girebilirsiniz.\n");
			} while (hizRuzgar < 0);
			
			hissedilenSicaklik = 33.0
					+ (0.478 + (0.237 * Math.sqrt(hizRuzgar)) - (0.0124 * hizRuzgar)) * (reelSicaklik - 33.0);
			
			hissedilenSicaklik = toFahCel(hissedilenSicaklik);
			System.out.printf("\t\tHissedilen Sıcaklık = %.2f\n\n", hissedilenSicaklik);
			System.out.println("\t\tDevam etmek ister misiniz? [Çıkış=0]");
			reelSicaklik = in.nextInt();
		} while (reelSicaklik != 0);
		System.out.println("\t\tYine Bekleriz...");
		in.close();
	}
	
	static double toCelFah(double cel) {
		return (cel * (9.0f / 5.0f)) + 32;
	}
	
	static double toFahCel(double fah) {
		return (fah - 32) / (9.0f / 5.0f);
	}
}
