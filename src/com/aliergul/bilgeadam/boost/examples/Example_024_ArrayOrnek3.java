/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class Example_024_ArrayOrnek3 {
	private static String[][] ches = new String[8][8];
	private static final char[] HARF = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
	private static Scanner in = new Scanner(System.in);
	private static final String ICON_HINT = "**";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			resetChes();
			viewChes();
			selectTarget();
		} while (true);
		
	}
	
	private static void resetChes() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ches[i][j] = String.valueOf(HARF[i]) + (j + 1);
			}
		}
	}
	
	private static void viewChes() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf("[ %1s ] ", ches[i][j]);
				
			}
			System.out.printf("\n\n");
		}
	}
	
	private static void selectTarget() {
		// TODO Auto-generated method stub
		String location = "";
		int row = 0, col = 0;
		do {
			System.out.print("Tahta üzerinde konum seçiniz : ");
			location = in.nextLine().trim().toUpperCase();
			
			if (location.length() == 2 && row != -1 && isRakam(location.charAt(1))) {
				row = findKey(location.charAt(0));
				col = Integer.parseInt(String.valueOf(location.charAt(1)));
				ches[row][col - 1] = "At";
				hintHorseTarget(row, col - 1);
			}
		} while (true);
	}
	
	private static void hintHorseTarget(int row, int col) {
		// TODO Auto-generated method stub
		
		hintCreateTarget(row + 2, col - 1);
		hintCreateTarget(row + 2, col + 1);
		hintCreateTarget(row - 2, col - 1);
		hintCreateTarget(row - 2, col + 1);
		// **
		hintCreateTarget(row - 1, col + 2);
		hintCreateTarget(row + 1, col + 2);
		hintCreateTarget(row - 1, col - 2);
		hintCreateTarget(row + 1, col - 2);
		
		viewChes();
		in.hasNext();
	}
	
	private static void hintCreateTarget(int newRow, int newCol) {
		if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8)
			ches[newRow][newCol] = ICON_HINT;
		
	}
	
	private static boolean isRakam(char chr) {
		if (Character.isDigit(chr)) {
			String str = String.valueOf(chr);
			int rakam = Integer.parseInt(str);
			if (rakam > 0 && rakam < 9) {
				return true;
			}
		}
		return false;
	}
	
	private static int findKey(char chr) {
		for (int i = 0; i < HARF.length; i++) {
			if (HARF[i] == (chr)) {
				return i;
			}
		}
		return -1;
	}
	
}
