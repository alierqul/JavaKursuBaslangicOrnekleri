/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;
import com.aliergul.bilgeadam.boost.util.MyArrayHelper;

/**
 * 
 * @author ERGUL
 *
 */
public class Example_022_ArrayOrnek {
	public static final String TAG = "Array Örnekleri";
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ConsoleHelper.printTitle(TAG);
		do {
			int[] array = MyArrayHelper.createSingleArray();
			MyArrayHelper.printArray("Üretilen Liste", array);
			ConsoleHelper.print("En Büyük Sayı : " + MyArrayHelper.findMax(array), 2, true);
			ConsoleHelper.print("En Küçük Sayı : " + MyArrayHelper.findMin(array), 2, true);
			MyArrayHelper.printArray("Çift Sayılar", MyArrayHelper.evenArrayList(array));
			ConsoleHelper.print("En Büyük Sayı : " + MyArrayHelper.findMax(MyArrayHelper.evenArrayList(array)), 2,
					true);
			ConsoleHelper.print("En Küçük Sayı : " + MyArrayHelper.findMin(array), 2, true);
			MyArrayHelper.printArray("tek Sayılar", MyArrayHelper.oddArrayList(array));
			ConsoleHelper.print("En Büyük Sayı : " + MyArrayHelper.findMax(MyArrayHelper.oddArrayList(array)), 2, true);
			ConsoleHelper.print("En Küçük Sayı : " + MyArrayHelper.findMin(array), 2, true);
			ConsoleHelper.printLine(TAG);
			
		} while (!ConsoleHelper.selectMenu("Çıkmak için [0] tuşlayınız.").equals("0"));
		ConsoleHelper.print("Yine Bekleriz... ", 3, true);
	}
	
}
