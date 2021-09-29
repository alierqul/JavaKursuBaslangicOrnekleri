package com.aliergul.folksdev;

public class Odev003 {
	/**
	 * Aşağıdaki Şekili çıkaran program.
	 * ________**
	 * _______****
	 * ______******
	 * _____********
	 * ____**********
	 * ___************
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int col = 12;
		int row = Math.round(col / 2);
		System.out.println("satır ve sutun " + col + " - " + row);
		int altSinir = 0;
		int ustSinir = 0;
		for (int i = 1; i <= row; i++) {
			altSinir = row - i;
			ustSinir = row + i;
			for (int j = 0; j <= col; j += 1) {
				// _-_-_**-_-_-
				// 123456789ABC
				if (j > altSinir && j <= ustSinir) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
}
