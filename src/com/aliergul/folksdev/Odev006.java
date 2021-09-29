/**
 * 
 */
package com.aliergul.folksdev;

/**
 * pascal Üçgeni sonucu Çıkaran Program.
 * ___________01
 * __________01 01
 * _________01 02 01
 * ________01 03 03 01
 * _______01 04 06 04 01
 * ______01 05 10 10 05 01
 * _____01 06 15 20 15 06 01
 * ____01 07 21 35 35 21 07 01
 * ___01 08
 * __01 09
 * _01 10
 * 
 * @author ERGUL
 *
 */
public class Odev006 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxCount = 10;
		int num = 1;
		for (int i = 0; i <= maxCount; i++) {
			koyBosluk(maxCount + 1, i);
			num = 1;
			
			for (int j = 0; j <= i; j++) {
				System.out.printf("%03d ", num);
				num = num * (i - j) / (j + 1);
				
			}
			
			System.out.println();
		}
	}
	
	public static void koyBosluk(int bosluk, int j) {
		for (int i = bosluk; i > j; i--) {
			System.out.print("  ");
		}
		
	}
	
}
