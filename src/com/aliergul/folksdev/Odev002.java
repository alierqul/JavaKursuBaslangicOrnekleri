/**
 * 
 */
package com.aliergul.folksdev;

/**
 * Aşağıdaki Ekran Çıktısını veren Döngü örneği
 * _____1
 * ____12
 * ___123
 * __1234
 * _12345
 * 123456
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
			printSpace(count - i);
			for (int j = 1; j <= count; j++) {
				
				if (j < (i + 1))
					System.out.print(j);
				
			}
			System.out.println();
		}
		
	}
	
	private static void printSpace(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(" ");
		}
	}
	
}
