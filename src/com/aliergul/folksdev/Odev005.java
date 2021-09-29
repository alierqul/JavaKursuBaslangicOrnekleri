package com.aliergul.folksdev;

/**
 * 1-500 Arası Fibonacci sayılarını ekrana yazdıran Program
 * [ 001 ] [ 001 ] [ 002 ] [ 003 ] [ 005 ]
 * [ 008 ] [ 013 ] [ 021 ] [ 034 ] [ 055 ]
 * [ 089 ] [ 144 ] [ 233 ] [ 377 ]
 * 
 * @author ERGUL
 *
 */
public class Odev005 {
	public static void main(String[] args) {
		int pre = 0;
		int center = 1;
		int next = 0;
		int count = 0;
		// 1 + 1 =2
		// 1 + 2 =3
		// 2 + 3 =5
		while (center <= 500) {
			count++;
			System.out.printf("[ %03d", center);
			System.out.print((count % 5 == 0) ? " ]\n" : " ] ");
			next = pre + center;
			pre = center;
			center = next;
			
		}
		
	}
}
