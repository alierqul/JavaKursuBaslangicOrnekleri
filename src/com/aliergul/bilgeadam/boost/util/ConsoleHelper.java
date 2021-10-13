/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.util.Map;
import java.util.Scanner;

/**
 * @author ERGUL
 */
public class ConsoleHelper {
	
	public static void main(String[] args) {
		
	}
	
	public static String selectMenu(String msg) {
		Scanner secim = new Scanner(System.in);
		
		printLine(20);
		print(msg, 2, false);
		String s = secim.next().trim();
		secim.close();
		return s;
	}
	
	public static String readString(String msg) {
		Scanner in = new Scanner(System.in);
		do {
			try {
				
				System.out.print(msg);
				String strLine = in.nextLine();
				return strLine;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		
	}
	
	public static int selectDigitSecim() {
		Scanner scan = new Scanner(System.in);
		String secim;
		do {
			boolean isDigit = true;
			secim = scan.next().trim();
			for (int i = 0; i < secim.length(); i++) {
				if (!Character.isDigit(secim.charAt(i))) {
					isDigit = false;
				}
			}
			
			if (isDigit)
				return Integer.parseInt(secim + "");
			
		} while (true);
	}
	
	public static int showMenu(String title, Map<Integer, String> menu) {
		printTitle(title, 30);
		
		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("[  %02d - %-30s ]", key, val), 2, true);
			
		}
		printLine(30);
		
		return selectDigitSecim();
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
		printTitle(msg, msg.length());
	}
	
	public static void printTitle(String msg, int length) {
		int oddMsgLeng = msg.length() % 2;
		printLine(length); // 40 = 30 + 12
		int center = (Math.round((length + 10) / 2) - 5);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%-" + center + "s%s%" + end + "s", "=====", msg, "====="), 2, true);
		printLine(length);
	}
	
	public static void printLine(int msgLong) {
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("=");
		}
		System.out.printf("%s\n", line);
	}
	
	public static void printLine(String msg) {
		printLine(msg.length());
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
