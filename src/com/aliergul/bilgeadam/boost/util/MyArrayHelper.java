/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class MyArrayHelper {
	/**
	 * dizi boyutunu ve random büyüklüğünü girerek Tek boyutlu bir int dizisi
	 * oluşturur.
	 * 
	 * @return
	 */
	public static int[] createSingleArray() {
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
	
	/**
	 * Verilen int Dizisini Ekrana yazdıran method.
	 * 
	 * @param msj
	 * @param intArray
	 */
	public static void printArray(String msj, int[] intArray) {
		System.out.println(msj);
		for (int i : intArray) {
			System.out.print(i + "- ");
		}
		System.out.println();
	}
	
	/**
	 * Verilen int Dizesinde En küçük sayıyı döndüren method
	 * 
	 * @param intArray
	 * @return
	 */
	public static int findMin(int[] intArray) {
		
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < temp) {
				temp = intArray[i];
			}
		}
		return temp;
		
	}
	
	/**
	 * Verilen int Dizesinde En Büyük sayıyı döndüren method
	 * 
	 * @param intArray
	 * @return
	 */
	public static int findMax(int[] intArray) {
		
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > temp) {
				temp = intArray[i];
			}
		}
		return temp;
		
	}
	
	/**
	 * Verilen Dizeyi Küçükten büyüğe sıralayıp dönderen method
	 * 
	 * @param intArray
	 * @return
	 */
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
	
	/**
	 * Verilen Listedeki Asal Sayıları liste olarak döndüren method.
	 * 
	 * @param intArray
	 * @return
	 */
	public static int[] arrayAsalSayilar(int[] intArray) {
		int[] arrayAsalSayilar = new int[countAsalSayilar(intArray)];
		int i = 0;
		for (int num : intArray) {
			if (MyMathHelper.isAsal(num)) {
				arrayAsalSayilar[i] = num;
				i++;
			}
		}
		return arrayAsalSayilar;
	}
	
	/**
	 * Verilen Listedeki Asal Sayı adetini döndüren method
	 * 
	 * @param intArray
	 * @return
	 */
	
	public static int countAsalSayilar(int[] intArray) {
		
		int count = 0;
		for (int num : intArray) {
			if (MyMathHelper.isAsal(num)) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Dizi Elemanlarının Toplamını Döndüren Method.
	 * 
	 * @param intArray
	 * @return
	 */
	public static int sumArrayList(int[] intArray) {
		
		int sum = 0;
		for (int num : intArray) {
			sum += num;
		}
		return sum;
	}
	
	/**
	 * Verilen Dizideki Tek sayıları Döndüren method.
	 * 
	 * @param intArray
	 * @return
	 */
	public static int[] oddArrayList(int[] intArray) {
		
		int count = 0;
		
		for (int num : intArray) {
			if (num % 2 != 0) {
				count++;
			}
		}
		int[] oddArray = new int[count];
		count = 0;
		for (int num : intArray) {
			if (num % 2 != 0) {
				oddArray[count] = num;
				count++;
			}
		}
		return oddArray;
	}
	
	/**
	 * Verilen Dizideki Çift sayıları Döndüren method.
	 * 
	 * @param intArray
	 * @return
	 */
	public static int[] evenArrayList(int[] intArray) {
		
		int count = 0;
		
		for (int num : intArray) {
			if (num % 2 == 0) {
				count++;
			}
		}
		int[] evenArray = new int[count];
		count = 0;
		for (int num : intArray) {
			if (num % 2 == 0) {
				evenArray[count] = num;
				count++;
			}
		}
		return evenArray;
	}
}
