/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class CokgeninAlani {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sKenar = 0;
		int uKenar = 0;
		double alan = 0.0;
		do {
			System.out.println("\t\t======================================");
			System.out.println("\t\t=== Çokgenin Alanını Bulan Program ===");
			System.out.println("\t\t======================================");
			do {
				System.out.print("\t\tKenar Sayısını Giriniz : ");
				
				sKenar = in.nextInt();
				if (sKenar < 3)
					System.err.println("En Az üç Girebilirsiniz.");
			} while (sKenar < 3);
			do {
				System.out.print("\t\tKenar Uzunluğunu Giriniz : ");
				
				uKenar = in.nextInt();
				if (uKenar < 1)
					System.err.println("\t\tPozitif Girebilirsiniz.");
			} while (uKenar < 1);
			
			alan = (sKenar * uKenar * uKenar) / (4 * Math.tan(Math.PI / sKenar));
			switch (sKenar) {
				case 3: {
					System.out.printf("\t\tÜçgenin Alanı : %.2f \n", alan);
					break;
				}
				case 4: {
					System.out.printf("\t\tDörgenin Alanı : %.2f \n", alan);
					break;
				}
				case 5: {
					System.out.printf("\t\tBeşgenin Alanı : %.2f \n", alan);
					break;
				}
				case 6: {
					System.out.printf("\t\tAltıgen Alanı : %.2f \n", alan);
					break;
				}
				case 7: {
					System.out.printf("\t\tYedigen Alanı : %.2f \n", alan);
					break;
				}
				case 8: {
					System.out.printf("\t\tSekizgen Alanı : %.2f \n", alan);
					break;
				}
				case 9: {
					System.out.printf("\t\tDokuzgen Alanı : %.2f \n", alan);
					break;
				}
				default:
					System.out.printf("\t\t%d \'gen  Alanı : %.2f \n", sKenar, alan);
			}
			System.out.println("\t\tDevam etmek ister misiniz? [Çıkış=0]");
			sKenar = in.nextInt();
		} while (sKenar != 0);
		System.out.println("\t\tYine Bekleriz...");
		in.close();
		
	}
	
}
