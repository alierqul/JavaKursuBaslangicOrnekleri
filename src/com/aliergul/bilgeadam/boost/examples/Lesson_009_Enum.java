/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

/**
 * @author ERGUL
 *
 */
public class Lesson_009_Enum {
	enum Color {
		BLACK, WHITE, YELOW, RED, BLUE
	}
	
	public static void main(String[] args) {
		Color clr = Color.YELOW;
		System.out.println("kaçıncı Sırada  : " + clr.ordinal());
		System.out.println("2.sıradaki renk : " + Color.values()[2]);
	}
	
}
