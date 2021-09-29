package com.aliergul.folksdev;

/**
 * 6x6 Şeklinde Aşağıdaki çıktıyı veren program.
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * Çıktısını veren Program
 * 
 * @author ERGUL
 *
 */
public class Odev001 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
