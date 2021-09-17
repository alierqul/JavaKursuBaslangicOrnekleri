package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_015_RadarCezaHesaplama {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int radarDegeri = 0;
		double ceza = 0.0;
		
		do {
			System.out.println("\t\t======================================");
			System.out.println("\t\t===			Radar Programı		   ===");
			System.out.println("\t\t======================================");
			
			System.out.print("\t\tYakalanan Hız Değeri: ");
			radarDegeri = in.nextInt();
			
			if (radarDegeri >= 80 && radarDegeri <= 85) {
				System.out.println("\t\tHızlı Gidiyorsunuz Lütfen Yavaşlayınız: ");
				ceza = 200.0;
			} else if (radarDegeri > 85 && radarDegeri <= 100) {
				System.out.println("\t\tÇok Hızlı Gidiyorsunuz Lütfen Yavaşlayınız: ");
				ceza = 300.0;
			} else if (radarDegeri > 100) {
				System.out.println("\t\tÇok Çok Hızlı Gidiyorsunuz Lütfen Yavaşlayınız: ");
				ceza = 1000.0;
			}
			System.out.printf("\t\tCezanız %.2f TL Erken Ödeseniz \\15 indirim: \n", ceza);
			System.out.printf("\t\tErken Ödeme tutarı= : %.2f\n\n", ceza - ceza * 0.15);
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			radarDegeri = in.nextInt();
		} while (radarDegeri != 0.0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
