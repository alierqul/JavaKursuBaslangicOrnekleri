/**
 * 
 */
package com.aliergul.folksdev;

/**
 * 1-100 arasında Asal olan sayıları işaretleyen program.
 * [ 01 ] [ 02 ] [ 03 ] [ 04 ] [ 05 ] [ 06 ] [ 07 ] [ 08 ] [ 09 ] [ 10 ]
 * [ 11 ] [ 12 ] [ 13 ] [ 14 ] [ 15 ] [ 16 ] [ 17 ] [ 18 ] [ 19 ] [ 20 ]
 * [ 21 ] [ 22 ] [ 23 ] [ 24 ] [ 25 ] [ 26 ] [ 27 ] [ 28 ] [ 29 ] [ 30 ]
 * [ 31 ] [ 32 ] [ 33 ] [ 34 ] [ 35 ] [ 36 ] [ 37 ] [ 38 ] [ 39 ] [ 40 ]
 * [ 41 ] [ 42 ] [ 43 ] [ 44 ] [ 45 ] [ 46 ] [ 47 ] [ 48 ] [ 49 ] [ 50 ]
 * [ 51 ] [ 52 ] [ 53 ] [ 54 ] [ 55 ] [ 56 ] [ 57 ] [ 58 ] [ 59 ] [ 60 ]
 * [ 61 ] [ 62 ] [ 63 ] [ 64 ] [ 65 ] [ 66 ] [ 67 ] [ 68 ] [ 69 ] [ 70 ]
 * [ 71 ] [ 72 ] [ 73 ] [ 74 ] [ 75 ] [ 76 ] [ 77 ] [ 78 ] [ 79 ] [ 80 ]
 * [ 81 ] [ 82 ] [ 83 ] [ 84 ] [ 85 ] [ 86 ] [ 87 ] [ 88 ] [ 89 ] [ 90 ]
 * [ 91 ] [ 92 ] [ 93 ] [ 94 ] [ 95 ] [ 96 ] [ 97 ] [ 98 ] [ 99 ] [ 100 ]
 * 
 * @author ERGUL
 *
 */
public class Odev004 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (isAsal(i)) {
				System.out.print("");
				System.err.printf("[ %02d", i);
				System.out.print("");
			} else {
				System.out.printf("[ %02d", i);
			}
			System.out.print((i % 10 == 0) ? " ]\n" : " ] ");
			
		}
		
	}
	
	/**
	 * Verilen Sayının asal olup olmadığını döndüren method:
	 * 
	 * @param sayi
	 * @return
	 */
	public static boolean isAsal(int sayi) {
		if (sayi <= 1)
			return false;
		if (sayi == 2)
			return true;
		if (sayi != 2 && sayi % 2 == 0)
			return false;
		for (int i = 3; i < sayi; i += 2) {
			
			if (sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
}
