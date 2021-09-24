/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class ConsoleHelper {
	private static Scanner secim = new Scanner(System.in);
	
	public static void main(String[] args) {
		printZigZag("PAYPALISHIRING", 3);
	}
	
	/*
	 * P A H N 0 4 8 C
	 * APLSIIG 13579BD
	 * Y I R 2 6 A
	 */
	private static void printZigZag(String msg, int row) {
		
		String[] rows = new String[row];
		int rowNumber = 0;
		int plus = +1;
		for (int i = 0; i < rows.length; i++) {
			rows[i] = "";
		}
		
		for (int i = 0; i < msg.length(); i++) {
			String str = String.valueOf(msg.charAt(i));
			rows[rowNumber] = rows[rowNumber].concat(str);
			rowNumber += plus;
			if (rowNumber == (row - 1) || rowNumber == 0) {
				plus *= -1;
			}
		}
		
		for (int j = 0; j < row; j++) {
			System.out.println(rows[j]);
		}
		
	}
	
	public static String reverseString(String msg) {
		StringBuilder revStr = new StringBuilder();
		
		for (int i = (msg.length() - 1); i >= 0; i--) {
			revStr.append(msg.charAt(i));
			
		}
		return revStr.toString();
		
	}
	
	public static int bulHarf(String msg, String key) {
		char[] s = msg.toLowerCase().toCharArray();
		int count = 0;
		for (int i = 0; i < msg.length(); i++) {
			if (key.equals(String.valueOf(s[i]))) {
				count++;
			}
		}
		return count;
		
	}
	
	public static String cikarHarf(String msg, String key) {
		StringBuilder newStr = new StringBuilder("");
		char[] s = msg.toLowerCase().toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (!key.equals(String.valueOf(s[i]))) {
				newStr.append(s[i]);
			}
			
		}
		
		return newStr.toString();
		
	}
	
	public static String silTekSayiHarfMetin(String msg) {
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < msg.length(); i += 2) {
			newStr.append(msg.charAt(i));
		}
		return newStr.toString();
		
	}
	
	public static String secimYap(String msg) {
		print(msg, 2, false);
		String s = secim.next().trim();
		return s;
	}
	
	public static void print(String msg, int tabCount, boolean ln) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < tabCount; i++) {
			b.append("\t");
		}
		b.append(msg);
		b.append(ln ? "\n" : "");
		System.out.print(b);
		
	}
	
	public static void printTitle(String msg) {
		printLine(msg);
		print("==== " + msg + " ====", 2, false);
		printLine(msg);
	}
	
	public static void printLine(String msg) {
		int msgLong = msg.length();
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\n\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("=");
		}
		System.out.printf("%s\n", line);
	}
	
	public static void animate(int remain, int total) {
		if (remain > total) {
			throw new IllegalArgumentException();
		}
		int maxBareSize = 10; // 10unit for 100%
		int remainProcent = ((100 * remain) / total) / maxBareSize;
		char defaultChar = '-';
		String icon = "*";
		String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
		StringBuilder bareDone = new StringBuilder();
		bareDone.append("[");
		for (int i = 0; i < remainProcent; i++) {
			bareDone.append(icon);
		}
		String bareRemain = bare.substring(remainProcent, bare.length());
		System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
		if (remain == total) {
			System.out.print("\n");
		}
	}
	
}
