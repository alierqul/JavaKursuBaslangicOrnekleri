/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.util.Scanner;

/**
 * @author ERGUL
 *         if(x>=-32768 && x<=32767){
 *         System.out.println("* short");
 *         }
 * 
 *         if(x>=-4294967296L && x<=4294967295L){
 *         System.out.println("* int");
 *         }
 * 
 *         if(x>=-9223372036854775808L && x<=9223372036854775807L) {
 *         System.out.println("* long");
 *         }
 */
public class ConsoleHelper {
	private static Scanner secim = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	public static String selectMenu(String msg) {
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
