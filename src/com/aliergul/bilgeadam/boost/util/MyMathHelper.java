/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.math.BigInteger;

/**
 * @author ERGUL
 *
 */
public class MyMathHelper {
	/**
	 * Verilen Sayının Faktöriyel sonucunu ekrana yazan method.
	 * 
	 * @param num
	 */
	public static void faktoriyel(int num) {
		BigInteger sum = BigInteger.ONE;
		for (int i = num; i >= 1; i--) {
			sum = sum.multiply(BigInteger.valueOf((long) i));
		}
		System.out.println("En Küçük " + num + " Faktöriyeli :" + sum);
		
	}
	
	/**
	 * Verilen Sayının asal olup olmadığını döndüren method:
	 * 
	 * @param sayi
	 * @return
	 */
	public static boolean isAsal(int sayi) {
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
