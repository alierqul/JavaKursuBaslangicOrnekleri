/**
 * 
 */
package com.aliergul.folksdev;

/**
 * Aşağıdaki Ekran Çıktısını veren Döngü örneği
 * _____1
 * ____21
 * ___321
 * __4321
 * _54321
 * 654321
 * 
 * @author ERGUL
 *
 */
public class Odev002 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 6;
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count; j++) {
				// i=1j=1 " "i=2j=1" "
				// i=1j=2 " "i=2j=2" "
				// i=1j=3 " "i=2j=3" "
				// i=1j=4 " "i=2j=4" "
				// i=1j=5 " "i=2j=5"2"
				// i=1j=6 "1"i=2j=6"1"
				if (i >= (count + 1 - j)) {
					System.out.print(count + 1 - j);
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
}
