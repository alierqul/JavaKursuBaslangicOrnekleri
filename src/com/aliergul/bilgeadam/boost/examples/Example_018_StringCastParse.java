/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         kullanıcıdan alınan string sayı verisinin
 *         karesini ve karekökünü hesaplayan algoritma
 * 		
 */
public class Example_018_StringCastParse {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String strSayi = "1";
		
		while (true) {
			{
				System.out.println("\t\t======================================");
				System.out.println("\t\t===  Kare ve KareKök Bulan Program ===");
				System.out.println("\t\t======================================");
				System.out.print("\t\tBir Sayı yazınız : ");
				strSayi = in.nextLine();
				int sayi = Integer.parseInt(strSayi);
				long karesi = (long) Math.pow(sayi, 2);
				double kareKok = Math.sqrt(sayi);
				System.out.printf("\n\n\t\tKareKökü = %.2f", kareKok);
				System.out.println("\n\t\tKaresi = " + karesi);
			}
			
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			if (in.next().equals("0"))
				break;
			
		}
		System.out.println("\n\n\t\t\t... Yine Bekleriz ...");
		in.close();
	}
	
}
