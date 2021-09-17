/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class Example_008_OrtalamaHesaplama {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayiAdedi = 0;
		int sayi = 0;
		double toplam = 0.0;
		System.out.print("Kaç Sayı Girilecek: ");
		sayiAdedi = in.nextInt();
		for (int i = 1; i <= sayiAdedi; i++) {
			System.out.print(i + " :TamSayı giriniz: ");
			sayi = in.nextInt();
			toplam += sayi;
		}
		System.out.println("\n" + sayiAdedi + " Sayının toplamı :" + toplam);
		System.out.printf("Ortalaması :%.2f", toplam / sayiAdedi);
		
	}
	
}
