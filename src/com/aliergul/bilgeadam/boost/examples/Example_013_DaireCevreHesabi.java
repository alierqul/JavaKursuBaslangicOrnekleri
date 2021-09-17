package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_013_DaireCevreHesabi {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double rYaricap = 0.0;
		double alan = 0.0;
		double cevre = 0.0;
		do {
			System.out.println("DaireCevre Hesabı");
			
			System.out.print("Dairenin Yarıçapını Giriniz: ");
			rYaricap = in.nextDouble();
			cevre = Math.PI * 2.0 * rYaricap;
			alan = Math.PI * rYaricap * rYaricap;
			System.out.printf("Dairenin Çevresi= %.2f \n", cevre);
			System.out.printf("Dairenin Alanı=  %.2f \n", alan);
			System.out.print("Devam etmek istermisiniz [Çıkış=0]: ");
			rYaricap = in.nextDouble();
		} while (rYaricap != 0.0);
		in.close();
		System.out.print("Yine Bekleriz ... ");
		
	}
	
}
