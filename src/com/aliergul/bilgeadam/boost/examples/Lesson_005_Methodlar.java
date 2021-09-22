/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         printf("%02d ", j);
 *         %02d - 2 hane olarak gösterir printf("%02d ", j);
 *         01
 *         %03d - 3 hane olarak gösterir
 *         001
 */
public class Lesson_005_Methodlar {
	
	/**
	 * @param args
	 */
	
	static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		viewNumbers(20);
	}
	
	private static void viewNumbers(int count) {
		for (int j = 1; j <= count; j++) {
			System.out.printf("%02d ", j);
			System.out.print((j % 10 == 0) ? "\n" : "");
		}
		
	}
	
	private static double calAverage(int count) {
		if (count <= 0)
			return 0;
		int sayi = 0;
		int topla = 0;
		for (int j = 1; j <= count; j++) {
			System.out.print(j + " Sayıyı giriniz: ");
			sayi = in.nextInt();
			topla += sayi;
			
		}
		return topla / (double) count;
	}
}
