/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Dizinin Eleman sayısını kullanıcı girecek
 * 1 ile kullanıcının girmiş olduğu sayı arasında sayıları random olarak
 * alınacak.
 * toplarını
 * oralamalarını
 * kaç tane çift
 * kaç tane tek
 * 
 * @author ERGUL
 *
 */
public class Example_022_ArrayOrnek {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = singleArrayCreate();
		printArray("Diziler", intArray);
		printArray("Asal Sayılar", arrayAsalSayilar(intArray));
		faktoriyel(enKucuk(intArray));
		iconDiegonal();
		diegonalMatrixCreate(intArray);
	}
	
	private static void diegonalMatrixCreate(int[] intArray) {
		Scanner in = new Scanner(System.in);
		System.out.print("Satır Sayısı: ");
		int row = in.nextInt();
		System.out.print("Sütun Sayısı: ");
		int col = in.nextInt();
		int[][] matrix = new int[row][col];
		int maxArray = enBuyuk(intArray);
		int minArray = enKucuk(intArray);
		int medyan = sortArray(intArray)[intArray.length / 2];
		if (row == col) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i == j) {
						matrix[i][j] = medyan;
					} else if (i > j) {
						matrix[i][j] = minArray;
					} else {
						matrix[i][j] = maxArray;
					}
					
					System.out.printf("%02d  ", matrix[i][j]);
				}
				System.out.println();
			}
		}
		
	}
	
	private static void iconDiegonal() {
		Scanner in = new Scanner(System.in);
		System.out.print("Satır Sayısı: ");
		int row = in.nextInt();
		System.out.print("Sütun Sayısı: ");
		int col = in.nextInt();
		System.out.print("simge Sayısı: ");
		String icon = in.next().trim().substring(0, 1);
		String[][] matrix = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = icon;
				System.out.printf("%2s", icon);
			}
			System.out.println();
		}
	}
	
	private static int[] singleArrayCreate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Dizi Eleman Sayısı: ");
		int arrayCount = in.nextInt();
		System.out.print("Random değer aralığı: ");
		int randomMax = in.nextInt();
		
		int[] tempArray = new int[arrayCount];
		for (int i = 0; i < arrayCount; i++) {
			tempArray[i] = (int) (Math.random() * randomMax + 1);
		}
		
		return tempArray;
	}
	
	public static void printArray(String msj, int[] intArray) {
		System.out.println(msj);
		for (int i : intArray) {
			System.out.print(i + "- ");
		}
		System.out.println();
	}
	
	public static void faktoriyel(int num) {
		BigInteger sum = BigInteger.ONE;
		for (int i = num; i >= 1; i--) {
			sum = sum.multiply(BigInteger.valueOf((long) i));
		}
		System.out.println(num + " Faktöriyel :" + sum);
		
	}
	
	public static int enKucuk(int[] intArray) {
		
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < temp) {
				temp = intArray[i];
			}
		}
		return temp;
		
	}
	
	public static int enBuyuk(int[] intArray) {
		
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > temp) {
				temp = intArray[i];
			}
		}
		return temp;
		// 5 7 1 6 2
		// 1 7 5
	}
	
	public static int[] sortArray(int[] intArray) {
		
		int temp = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return intArray;
		
	}
	
	public static int[] arrayAsalSayilar(int[] intArray) {
		int[] arrayAsalSayilar = new int[countAsalSayilar(intArray)];
		int i = 0;
		for (int num : intArray) {
			if (isAsal(num)) {
				arrayAsalSayilar[i] = num;
				i++;
			}
		}
		return arrayAsalSayilar;
	}
	
	public static int countAsalSayilar(int[] intArray) {
		
		int count = 0;
		for (int num : intArray) {
			if (isAsal(num)) {
				count++;
			}
		}
		return count;
	}
	
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
